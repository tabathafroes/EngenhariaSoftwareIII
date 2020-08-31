package engenhariaSoftwareIII.Atividade1;

public abstract class Veiculo {
	public double valorVeiculo = 0;
	
	public Veiculo(double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}
	
	public abstract double precoVeiculoCalcular();
}