package snakecamel;

public class Main {
	public static void main(String[] args){
		SnakeCamelUtil SCU = new SnakeCamelUtil();
		String[] tests = new String[14];
		
		tests[0] = ( SCU.capitalize("") );
		tests[1] = ( SCU.capitalize("a") );
		tests[2] = ( SCU.capitalize("xyz") );
		
		tests[3] = ( SCU.uncapitalize("") );
		tests[4] = ( SCU.uncapitalize("A") );
		tests[5] = ( SCU.uncapitalize("Xyz") );
		
		tests[6] = ( SCU.snakeToCamelcase("abc") );
		tests[7] = ( SCU.snakeToCamelcase("abc_def") );
		tests[8] = ( SCU.snakeToCamelcase("abc_def_gh") );
		tests[9] = ( SCU.snakeToCamelcase("abc__def__gh") );
		tests[10] = ( SCU.snakeToCamelcase("_abc_def__") );
		
		tests[11] = ( SCU.camelToSnakecase("Abc") );
		tests[12] = ( SCU.camelToSnakecase("AbcDef") );
		tests[13] = ( SCU.camelToSnakecase("AbcDefGh") );
		
		for(int i=0; i<tests.length; i++)
			System.out.println(tests[i]);
	}
}
