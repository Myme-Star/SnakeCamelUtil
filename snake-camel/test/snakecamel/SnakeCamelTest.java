package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class SnakeCamelTest {

	@Test	
	public void “TŒ^“I‚ÈSnake‚ğCamel‚É’¼‚¹‚é(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "XyzaBcde";
		String actual = scu.snakeToCamelcase("xyza_bcde");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void ‘å•¶š‚à¬‚¶‚Á‚½Snake‚ğCamel‚É’¼‚¹‚é(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "XyzaBcde";
		String actual = scu.snakeToCamelcase("XYZA_BCDE");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void “TŒ^“I‚ÈCamel‚ğSnake‚É’¼‚¹‚é(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyza_bcde";
		String actual = scu.camelToSnakecase("XyzaBcde");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void æ“ª‚Ì•¶š‚ª¬•¶š‚ÌCamel‚ğSnake‚É’¼‚¹‚é(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyza_bcde";
		String actual = scu.camelToSnakecase("xyzaBcde");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void Snake‚ğCamel‚É’¼‚¹‚é_1’PŒê(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Apple";
		String actual = scu.snakeToCamelcase("apple");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void Camel‚ğSnake‚É’¼‚¹‚é_1’PŒê(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "apple";
		String actual = scu.camelToSnakecase("apple");
		assertThat(actual, is(expected));
	}
}

