package br.com.dextra.aasp;

public class StringUtils {

	public static String removeName(String nome, String content) {
		StringBuilder str = new StringBuilder();
		content = content.replaceAll("\\s{2,}", " ");
		nome = nome.replaceAll("\\s{2,}", " ");
		int inicio = content.toUpperCase().indexOf(nome.toUpperCase());
		int fim = nome.length() + inicio;
		if (inicio >= 0) {
			StringUtils.processarTextoPre(inicio, content, str);
			StringUtils.processarPosTexto(fim, content, str);
		}
		return str.toString().trim();
	}

	private static void processarPosTexto(int fim, String content, StringBuilder str) {
		String pos[] = content.substring(fim).trim().split(" ");
		int limPos = pos.length;
		if (limPos > 4)
			limPos = 5;
		
		if (limPos > 0) {
			for (int i = 0; i < limPos; i++) {
				str.append(pos[i]);
				str.append(" ");
			}
		}
	}

	private static void processarTextoPre(int inicio, String content, StringBuilder str) {
		String pre[] = content.substring(0, inicio).trim().split(" ");
		int limPre = pre.length;
		if (limPre > 4)
			limPre = 5;
		
		if (limPre > 0) {
			for (int i = ((pre.length) - limPre); i < pre.length; i++) {
				str.append(pre[i]);
				str.append(" ");
			}
		}
	}
	
}