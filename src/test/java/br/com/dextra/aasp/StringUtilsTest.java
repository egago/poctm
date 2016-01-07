package br.com.dextra.aasp;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void test1() {
		String expect = "Vara do Trabalho 00029980320135020034 (02998201303402006) do Nascimento X Banco Santander";
		String actual = StringUtils.removeName("RENATO RODRIGUES", "LUCIANE ADAM DE OLIVEIRA OAB:  201596/SP-D\" São Paulo  34ª Vara do Trabalho 00029980320135020034 (02998201303402006) Renato Rodrigues do Nascimento X  Banco Santander Brasil S/A AUDIÊNCIA  CONCILIAÇÃO:  26/11/15 às 13:45 Hs Mesa:   21 LOCAL:  Fórum  Trab");
		Assert.assertEquals(expect, actual);
	}

	@Test
	public void test2() {
		String actual = StringUtils.removeName("ADRIANA SANTOS", "ADRIANA DOS SANTOS OAB:  273957/SP-D\" Santo André   4ª Vara do Trabalho 00006218620145020434 (00621201443402006) Wilma Alves de Lima X  Verzani & Sandrini LTDA +  1 Notificação: Quanto ao despacho proferido: fls.439 .Íntegra no site www.trtsp.jus.br. Cód");
		Assert.assertEquals("", actual);
	}

	@Test
	public void test3() {
		String expect = "OAB: 85907/MG-D\" T.R.T. 00901003020095020252 AP";
		String actual = StringUtils.removeName("RENATA MARTINS GOMES", "RENATA MARTINS GOMES OAB:  85907/MG-D\" T.R.T. 00901003020095020252 AP 02ª VT de Cubatão. EDITAL SPR/DF 0000267/2015 - DISTRIBUIÇÃO. LUIZ FERNANDO DE ANDRADE X José Carlos da Cruz RECUPERA CONST IND COM LTDA. ME ANDRÉ EDNILSON OLIVEIRA E Outros . DATA DIS");
		Assert.assertEquals(expect, actual);
	}

	@Test
	public void test4() {
		String expect = "Teleservicos S.A.(MASSA FALIDA DE), SCO:";
		String actual = StringUtils.removeName("LUIZ EDUARDO VIDAL RODRIGUES", "JOSE FERNANDO XIMENES ROCHA OAB:  119354/SP-A\" T.R.T. 00027626820125020072 RO 72ª VT de São Paulo. EDITAL Nº 0006506/2015 - PAUTA DE JULGAMENTO. Dayane Maximo da Rocha X Claro S/A, Vidax Teleservicos S.A.(MASSA FALIDA DE), SCO: LUIZ EDUARDO VIDAL RODRIGUES");
		Assert.assertEquals(expect, actual);
	}

}