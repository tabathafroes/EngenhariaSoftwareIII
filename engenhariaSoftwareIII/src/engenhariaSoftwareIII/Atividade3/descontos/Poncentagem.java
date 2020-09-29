package engenhariaSoftwareIII.Atividade3.descontos;

import engenhariaSoftwareIII.Atividade3.produtos.Produto;

public class Poncentagem extends Desconto{
	
	public Poncentagem(double valorDesconto) {
		super(valorDesconto);
	}

	@Override
	public double formaCalcular(Produto produto) {
		return produto.getPreco() * (valorDesconto/100);
	}
}