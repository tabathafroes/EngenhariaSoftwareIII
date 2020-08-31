package engenhariaSoftwareIII.Atividade1;

public abstract class TipoCalculo {
	
	public double valorConta = 0; 

	public TipoCalculo(double valorConta) {
		this.valorConta = valorConta;
	}

	public abstract double formaCalcular();
}
