package engenhariaSoftwareIII.Atividade3.produtos;

public class ProdutoUnitario extends Produto{

	public ProdutoUnitario(String nome, double preco, String descricao) {
		super(nome, preco, descricao);
	}
	

	
	@Override
	public double getPreco() {
		return preco;
	}



	@Override
	public String mostrarDescricao() {
		return "Nome: "+nome+"\nDescrição: "+descricao;
	}
}
