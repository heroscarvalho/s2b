package pucs2b.exemplo01;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testSomar() {
		//Ativando o método somar
		int expected = 50;
		int actual = Hello.somar(20, 30);
		//fail - falha, marca quando o r for diferente de 50
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void testSomar2() {
		assertEquals(0,  Hello.somar(0, 0));
	}

}
