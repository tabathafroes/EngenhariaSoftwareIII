package engenhariaSoftwareIII.Atividade1;

public class Mensalidade extends TipoCalculo{
	
	public Mensalidade(double valorConta) {
		super(valorConta);
	}

	@Override
	public double formaCalcular() {
		return valorConta * 300;
	}
}
