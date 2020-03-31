package tdd.dessafio04;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.model.Livro;
import br.com.gft.model.Tema;

public class LivroTest {
	private Livro livro1;
	private Livro livro2;
	
	@Before
	public void setup() {
		livro1 = new Livro(100, Tema.EDUCATIVO );
		livro2 = new Livro(100, Tema.OUTROS);

	}
	
	@Test
	public void deveCalcularImpostoLivroDidatico() throws Exception {
		assertEquals(0, livro1.calculaImposto(), 0.0001);
	}
	
	@Test
	public void deveCalcularImpostoLivros() throws Exception {
		assertEquals(10, livro2.calculaImposto(), 0.0001);
	}
	
	
	
}
