package engenhariaSoftwareIII.Atividade2;

import engenhariaSoftwareIII.Atividade2.calculadores.CalculadorPreco;
import engenhariaSoftwareIII.Atividade2.descontos.Poncentagem;
import engenhariaSoftwareIII.Atividade2.produtos.Produto;

public class Inicio {
	
	  public static void main(String[] args) {
		    
		    CalculadorPreco calculo = new CalculadorPreco();
		    Produto p1 = new Produto("Maça", 20);
		    calculo.produto = p1;
		    Poncentagem d1 = new Poncentagem(90);
		    calculo.desconto = d1;

		    System.out.println("Valor de cobrança: " + calculo.valor());

		    
		  }
}
