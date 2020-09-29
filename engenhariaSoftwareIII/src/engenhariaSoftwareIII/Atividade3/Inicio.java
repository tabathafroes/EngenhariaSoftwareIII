package engenhariaSoftwareIII.Atividade3;

import java.util.ArrayList;

import engenhariaSoftwareIII.Atividade3.calculadores.CalculadorPreco;
import engenhariaSoftwareIII.Atividade3.descontos.Desconto;
import engenhariaSoftwareIII.Atividade3.descontos.Dinheiro;
import engenhariaSoftwareIII.Atividade3.produtos.Produto;
import engenhariaSoftwareIII.Atividade3.produtos.ProdutoKit;
import engenhariaSoftwareIII.Atividade3.produtos.ProdutoUnitario;

public class Inicio {
	
	  public static void main(String[] args) {
		    
		    CalculadorPreco calculo = new CalculadorPreco();
		    ArrayList<Produto> produtos = new ArrayList<>();
		    Produto p1 = new ProdutoUnitario("Maça", 20, "Vermelha, Doce, Feliz");
		    Produto p2 = new ProdutoUnitario("Pera", 10, "Ruim, Verde, Pior que a maçâ");
		    Produto p3 = new ProdutoUnitario("Abacaxi", 5, "Ótimo, acido, legal, coroa, Bob Esponja, Medieval Neutro");
		    produtos.add(p1);
		    produtos.add(p2);
		    produtos.add(p3);
		    Produto kit = new ProdutoKit("frutas", produtos);
		    calculo.produto = kit;
		    Desconto d1 = new Dinheiro(15);
		    calculo.desconto = d1;
		    System.out.println("Valor de cobrança: " + calculo.valor());

		    
		  }
}
