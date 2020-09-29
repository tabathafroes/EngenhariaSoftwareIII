package engenhariaSoftwareIII.Atividade3.calculadores;

import engenhariaSoftwareIII.Atividade3.descontos.Desconto;
import engenhariaSoftwareIII.Atividade3.produtos.Produto;

public class CalculadorPreco{
	  public Produto produto;
	  public Desconto desconto;

	  	public double valor() {
			return desconto.formaCalcular(produto);
		}
	  
	}