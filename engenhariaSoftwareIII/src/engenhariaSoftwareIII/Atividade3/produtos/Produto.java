package engenhariaSoftwareIII.Atividade3.produtos;

import java.util.ArrayList;
import java.util.List;

public abstract class Produto {
	public String nome;
	public double preco;
	public String descricao;
	public List<Produto> produtos = new ArrayList<>();
	  
	public Produto (String nome, double preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}
  
	public Produto (String nome, ArrayList<Produto> produtos) {
		this.nome = nome;
		this.produtos = produtos;
	}
	
	public abstract double getPreco();
}
