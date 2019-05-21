package JUnit_Testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import es.datautil.Data;
import es.datautil.Meses;

public class DataTest {

	
	@Test
	public void bissextosNaoCentenarios() {
		boolean resultado = Data.anoBissexto(2004);
		Assertions.assertTrue(resultado);
	}

	
	@Test
	public void bissextosCentenarios() {
		boolean resultado = Data.anoBissexto(2000);
		Assertions.assertTrue(resultado);
	}

	@Test
	public void naoBissextosCentenarios() {
		boolean resultado = Data.anoBissexto(1900);
		Assertions.assertFalse(resultado);
	}
	
	@Test
	public void naoBissextos() {
		boolean resultado = Data.anoBissexto(2019);
		Assertions.assertFalse(resultado);
	}
	
	@ParameterizedTest
	@CsvSource({"1,31","3,31","4,30","5,31","6,30","7,31","8,31","9,30","10,31","11,30","12,31"})
	public void mesesNaoFevereiro(int numeroMes, int resultadoEsperado) {
		int resultado = Data.diasMes(Meses.mesFromInt(numeroMes));
		Assertions.assertEquals(resultadoEsperado, resultado);
	}
	
	@ParameterizedTest
	@CsvSource({"2,2004,29","2,1900,28","2,2019,28","2,2000,29"})
	public void mesFevereiro(int numeroMes, int ano, int resultadoEsperado) {
		Meses mes = Meses.mesFromInt(numeroMes);
		int resultado = Data.diasMes(mes, ano);
		Assertions.assertEquals(resultadoEsperado, resultado);
	}
	
}
