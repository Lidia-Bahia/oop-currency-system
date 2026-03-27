package cofrinho;

public abstract class Moeda {
	double valor;
	
	public Moeda(double valor) {
		this.valor = valor;
	}
	
		
	abstract void info();
	
	//método para conversão da moeda
	abstract double converter();

}
