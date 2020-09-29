package engenhariaSoftwareIII.Atividade3.produtos;

import java.util.ArrayList;

public class ProdutoKit extends Produto {

	public ProdutoKit(String nome, ArrayList<Produto> produtos) {
		super(nome, produtos);
	}

	@Override
	public double getPreco() {
		double valorTotal = 0;
		for (Produto produto: produtos) {
			valorTotal = valorTotal + produto.getPreco();
		}
		return valorTotal;
	}

	@Override
	public String mostrarDescricao() {
		String descricao = "Nome do Kit: "+nome+"\n";
		for (Produto produto: produtos) {
			descricao = descricao + "Nome: "+produto.nome+"\nDescrição: "+ produto.descricao+"\n";
		}
		return descricao;
	}

}
