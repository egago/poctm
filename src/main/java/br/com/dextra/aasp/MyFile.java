package br.com.dextra.aasp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFile {
	
	public static List<String[]> readLinesFromFile(String filePath) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(filePath));
		List<String[]> data = new ArrayList<String[]>();
		while (scan.hasNextLine()) {
			data.add(scan.nextLine().split(";"));
		}
		scan.close();
		return data;
	}
	
	public static void createFile(String filePath, String content) throws IOException {
		File file = new File(filePath);
		if (!file.exists())
			file.createNewFile();
		
		FileOutputStream output = new FileOutputStream(file);
		output.write(content.getBytes());
		output.flush();
		output.close();
	}

}