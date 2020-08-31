package engenhariaSoftwareIII.Atividade1;

public class Passeio extends Veiculo {
	
	public Passeio(double valorVeiculo) {
		super(valorVeiculo);
	}

	@Override
	public double precoVeiculoCalcular() {
		return valorVeiculo * 1;
	}
}