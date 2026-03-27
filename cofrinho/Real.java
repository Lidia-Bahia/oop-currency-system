package cofrinho;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
	}

	@Override
	double converter() {
		return this.valor;
	}

	@Override
	void info() {
		System.out.printf("Real: R$ %.2f%n", this.valor);//resultado com duas casas decimais
		
	}
		

}
