package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class SnakeCamelTest {

	@Test	
	public void �T�^�I��Snake��Camel�ɒ�����(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "XyzaBcde";
		String actual = scu.snakeToCamelcase("xyza_bcde");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void �啶������������Snake��Camel�ɒ�����(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "XyzaBcde";
		String actual = scu.snakeToCamelcase("XYZA_BCDE");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void �T�^�I��Camel��Snake�ɒ�����(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyza_bcde";
		String actual = scu.camelToSnakecase("XyzaBcde");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void �擪�̕�������������Camel��Snake�ɒ�����(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyza_bcde";
		String actual = scu.camelToSnakecase("xyzaBcde");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void Snake��Camel�ɒ�����_1�P��(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Apple";
		String actual = scu.snakeToCamelcase("apple");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void Camel��Snake�ɒ�����_1�P��(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "apple";
		String actual = scu.camelToSnakecase("apple");
		assertThat(actual, is(expected));
	}
}

