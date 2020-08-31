package engenhariaSoftwareIII.Atividade1;

public class Carga extends Veiculo {
	
	public Carga(double valorVeiculo) {
		super(valorVeiculo);
	}

	@Override
	public double precoVeiculoCalcular() {
		return valorVeiculo * 2;
	}
}
