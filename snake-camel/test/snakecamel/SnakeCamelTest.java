package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class SnakeCamelTest {

	@Test	
	public void 典型的なSnakeをCamelに直せる(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "XyzaBcde";
		String actual = scu.snakeToCamelcase("xyza_bcde");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 大文字も混じったSnakeをCamelに直せる(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "XyzaBcde";
		String actual = scu.snakeToCamelcase("XYZA_BCDE");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 典型的なCamelをSnakeに直せる(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyza_bcde";
		String actual = scu.camelToSnakecase("XyzaBcde");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 先頭の文字が小文字のCamelをSnakeに直せる(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyza_bcde";
		String actual = scu.camelToSnakecase("xyzaBcde");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void SnakeをCamelに直せる_1単語(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Apple";
		String actual = scu.snakeToCamelcase("apple");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void CamelをSnakeに直せる_1単語(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "apple";
		String actual = scu.camelToSnakecase("apple");
		assertThat(actual, is(expected));
	}
}

