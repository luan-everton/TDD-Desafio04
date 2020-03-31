package tdd.dessafio04;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.model.VideoGame;


public class VideoGameTest {
	private VideoGame game1;
	private VideoGame game2;

	@Before
	public void setup() {
		game1 = new VideoGame(1000, true);
		game2 = new VideoGame(1000, false);

	}
	
	@Test
	public void deveCalcularImpostoGameUsado() throws Exception {
		assertEquals(250, game1.calcularImposto(), 0.0001);
	}
	
	@Test
	public void deveCalcularImpostoGameNovo() throws Exception {
		assertEquals(450, game2.calcularImposto(), 0.0001);
	}
	
}
