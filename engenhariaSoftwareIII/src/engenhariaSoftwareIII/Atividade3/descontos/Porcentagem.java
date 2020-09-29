package engenhariaSoftwareIII.Atividade3.descontos;

import engenhariaSoftwareIII.Atividade3.produtos.Produto;

public class Porcentagem extends Desconto{
	
	public Porcentagem(double valorDesconto) {
		super(valorDesconto);
	}

	@Override
	public double formaCalcular(Produto produto) {
		return produto.getPreco() * (valorDesconto/100);
	}
}