package cofrinho;

public class Dolar extends Moeda {
		
	public Dolar(double valor) {
		super(valor);
	}

	@Override
	double converter() {
		return this.valor*5.29; //cotação do dolar do dia 20/03/26
	}

	@Override
	void info() {
		System.out.printf("Dólar: US$ %.2f%n", valor);
		
	}

}
