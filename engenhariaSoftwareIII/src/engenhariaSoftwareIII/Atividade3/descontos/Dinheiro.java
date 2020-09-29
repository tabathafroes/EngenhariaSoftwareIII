package engenhariaSoftwareIII.Atividade3.descontos;

import engenhariaSoftwareIII.Atividade3.produtos.Produto;

public class Dinheiro extends Desconto{

	public Dinheiro(double valorDesconto) {
		super(valorDesconto);
	}

	@Override
	public double formaCalcular(Produto produto) {
		return produto.getPreco() - valorDesconto;
	}
}