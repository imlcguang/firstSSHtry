package com.ixs.mvctry.util.dijkstra.client;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ixs.mvctry.dao.impl.RelationDaoImpl;
import com.ixs.mvctry.model.Relation;
import com.ixs.mvctry.util.dijkstra.model.Edge;
import com.ixs.mvctry.util.dijkstra.model.Graph;

/**
 * Client code to demonstrate Dijkstra's algorithm
 * 
 *
 */
public class DijkstraClient {

	@Autowired
	private static RelationDaoImpl relationDao;

	public static void main(String[] args) {
		List<Relation> list = new ArrayList<Relation>();
		list = relationDao.findAllRelation();
		int size = list.size();
		Edge[] edges = new Edge[list.size()];
		// Define the edges of the graph

		for (int i = 0; i < size; i++) {
			Relation relation = list.get(i);
			int fromNodeIndex = Integer.valueOf(relation.getUserid()).intValue();
			int toNodeIndex = Integer.valueOf(relation.getFriendid()).intValue();
			edges[i] = new Edge(fromNodeIndex, toNodeIndex, 1);
		}
		// Create the graph

		Graph graph = new Graph(edges);

		// Update the graph with the shortest distances
        //设置开始节点
		int sourse = 0;
		graph.calculateShortestDistances(sourse);

		// Display the graph

		System.out.println(graph.toString(sourse));

	}

}