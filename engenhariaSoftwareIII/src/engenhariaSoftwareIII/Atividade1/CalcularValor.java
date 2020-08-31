package engenhariaSoftwareIII.Atividade1;

public class CalcularValor {
	public TipoCalculo tipo;
	public Veiculo veiculo;

	public double valor() {
		return tipo.formaCalcular() * veiculo.precoVeiculoCalcular(); 
	}

}
