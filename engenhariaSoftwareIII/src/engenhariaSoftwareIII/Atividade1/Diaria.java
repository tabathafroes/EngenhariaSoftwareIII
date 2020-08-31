package engenhariaSoftwareIII.Atividade1;

public class Diaria extends TipoCalculo{
	
	public Diaria(double valorConta) {
		super(valorConta);
	}

	@Override
	public double formaCalcular() {
		return valorConta * 26;
	}
}