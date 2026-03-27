package cofrinho;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}
	
	@Override
	double converter() {
		return this.valor*6.12; //cotação do euro do dia 20/03/26
	}

	@Override
	void info() {
		System.out.printf("Euros: € %.2f%n", this.valor);
	}
		
		
		
}
