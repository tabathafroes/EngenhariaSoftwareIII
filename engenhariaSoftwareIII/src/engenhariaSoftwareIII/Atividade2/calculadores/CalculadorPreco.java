package engenhariaSoftwareIII.Atividade2.calculadores;

import engenhariaSoftwareIII.Atividade2.descontos.Desconto;
import engenhariaSoftwareIII.Atividade2.produtos.Produto;

public class CalculadorPreco{
	  public Produto produto;
	  public Desconto desconto;

	  	public double valor() {
			return desconto.formaCalcular(produto);
		}
	  
	}