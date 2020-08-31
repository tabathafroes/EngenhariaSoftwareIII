package engenhariaSoftwareIII.Atividade1;

public class Hora extends TipoCalculo{
	
	public Hora(double valorConta) {
		super(valorConta);
	}

	@Override
	public double formaCalcular() {
		return valorConta * 2;
	}
}
