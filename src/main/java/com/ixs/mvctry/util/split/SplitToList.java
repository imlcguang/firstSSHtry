package com.ixs.mvctry.util.split;

import java.util.ArrayList;
import java.util.List;

public class SplitToList {

	
	public static List<String> splitTolist(String string) {
		String[] tagsplit = string.split(";");
		List<String> target =new ArrayList<String>();
		for (int i = 0; i < tagsplit.length; i++) {
			target.add(tagsplit[i]);
		}
		return target;
		
	}
}
