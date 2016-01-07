package br.com.dextra.aasp;

import java.io.IOException;
import java.util.List;

public class Main {
	
	private static final String APROVADOS = "/home/dextra/Downloads/text-mining/aprovado";
	private static final String DESCARTADOS = "/home/dextra/Downloads/text-mining/descartado";
	
	public static void main(String[] args) throws IOException {
		List<String[]> data = MyFile.readLinesFromFile("/home/dextra/Downloads/temp.txt");
		Long i = 1l;
		for (String item[] : data) {
			String content = StringUtils.removeName(item[0], item[2]);
			if (!content.isEmpty()) {
				System.out.println(String.format("%s | %s | %s", item[0], item[1], content));
				String path = Main.DESCARTADOS ;
				if (!"Descartado".equals(item[1]))
					path = Main.APROVADOS;
				
				path += "/" + i.toString();
				MyFile.createFile(path, content);
				i++;
				if (i % 10000 == 0)
					System.out.println("item: " + i);
			}
		}
		System.out.println("Finish");
	}

}