package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		// 追加1ここから
		int l = 0;
		// 追加1ここまで
		for (int i = 0; i < words.length; i++) {
			sb.append(capitalize(words[i]));
			// 追加2ここから
			for(int k=1; k<words[i].length(); k++){
				String tmp = sb.substring(k+l);
				sb.delete(k+l, sb.length());
				sb.append(uncapitalize(tmp));
				//System.out.println(new String(sb));
			}
			l += words[i].length();
			// 追加2ここまで
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i+1; // 変更1。i文字目の重複を避ける。
			}
		}
		sb.append(camelcase.substring(j));
		//System.out.println(new String(sb));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		if(s.length()==0) return "";
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		if(s.length()==0) return "";
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
