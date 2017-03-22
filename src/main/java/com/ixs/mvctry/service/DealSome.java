package com.ixs.mvctry.service;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class DealSome {

	public static void main(String[] args) throws IOException {
		String url = "F:\\学习资料\\a毕业设计\\rescources\\BX-Book-Ratings.sql";
		String target = "F:\\学习资料\\a毕业设计\\rescources\\BX-Book-Ratings1.sql";
		String buffer = null;
		FileReader fileReader = new FileReader(url);
		FileWriter fileWriter = new FileWriter(target);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		while((buffer = bufferedReader.readLine()) != null){
			if(buffer.contains("TYPE=MyISAM")){
				System.out.println("find it");
				buffer = buffer.replace("TYPE=MyISAM", "ENGINE=InnoDB");
			}
			bufferedWriter.write(buffer);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}
		System.out.println("finish!");
		
	}

}
