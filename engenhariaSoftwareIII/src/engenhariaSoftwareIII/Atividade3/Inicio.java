package engenhariaSoftwareIII.Atividade3;

import java.util.ArrayList;

import engenhariaSoftwareIII.Atividade3.calculadores.CalculadorPreco;
import engenhariaSoftwareIII.Atividade3.descontos.Desconto;
import engenhariaSoftwareIII.Atividade3.descontos.Porcentagem;
import engenhariaSoftwareIII.Atividade3.produtos.Produto;
import engenhariaSoftwareIII.Atividade3.produtos.ProdutoKit;
import engenhariaSoftwareIII.Atividade3.produtos.ProdutoUnitario;

public class Inicio {
	
	  public static void main(String[] args) {
		    
		    CalculadorPreco calculo = new CalculadorPreco();
		    ArrayList<Produto> produtos = new ArrayList<>();
		    Produto p1 = new ProdutoUnitario("Maça", 20, "Vermelha, Fuji");
		    Produto p2 = new ProdutoUnitario("Pera", 10, "Verde, d'Anjou");
		    Produto p3 = new ProdutoUnitario("Abacaxi", 5, "Amarelo, Bob Esponja");
		    produtos.add(p1);
		    produtos.add(p2);
		    produtos.add(p3);
		    Produto kit = new ProdutoKit("Frutas", produtos);
		    calculo.produto = kit;
		    //Desconto d1 = new Dinheiro(15);
		    Desconto d1 = new Porcentagem(90);
		    calculo.desconto = d1;
		    System.out.println("Valor de cobrança: " + calculo.valor());
		    //System.out.println(p1.mostrarDescricao());
		    System.out.println(kit.mostrarDescricao());
		  }
}
