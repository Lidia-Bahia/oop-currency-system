package cofrinho;

import java.util.ArrayList;

import java.util.Scanner; //leitura dos dados de entrada

public class Cofrinho {
	
	   // Valores de entrada de teclado
		Scanner input = new Scanner(System.in);
		
		// Criação da lista de valores
		private ArrayList <Moeda> listaMoedas = new ArrayList<>();
		
		// MENU PRINCIPAL
		public int menu1 () {
			System.out.println("==========================");
			System.out.println("|    MENU DO COFRINHO    |");
			System.out.println("==========================\n");
			System.out.println("1- Adicionar Moeda");
			System.out.println("2- Remover Moeda");
			System.out.println("3- Listar Moedas no sistema");
			System.out.println("4- Total em reais");
			System.out.println("5- Sair");
			System.out.print("> Digite a opçção desejada: ");
			int opcao = input.nextInt();
			
			return opcao; //usa o valor que o sistema leu
			}
			
		
		// MENU SECUNDÁRIO
		public int menu2 ( ) {
				System.out.println("\n-----Tipos de Moedas Disponíveis-----");
				System.out.println("1- Real");
				System.out.println("2- Dólar");
				System.out.println("3- Euro");
				System.out.print("> Digite a opçção desejada: ");
				int opcao = input.nextInt();
				
			return opcao;
			}
		
		// Valor para adicionar ou retirar
		public double valor() {
		    double valor;
		    
		    while (true) {
		        System.out.print("> Digite o valor: ");
		        valor = input.nextDouble();

		        if (valor > 0) {
		            return valor;
		        } else {
		            System.out.println("Valor inválido! Tente novamente.\n");
		        }
		    }
		}
		
		// Método que ADICIONAR moedas
		public void adicionar(Moeda m) {
			listaMoedas.add(m);
			System.out.println("\nOperação realizada com sucesso! \n");
		}
		
		// REMOVER moedas
		public void remover(String tipo, double valor) {
			for (int i = 0; i <listaMoedas.size(); i++) {
				
				Moeda m = listaMoedas.get(i);
				
				if(tipo.equals("Real") && m instanceof Real && m.valor == valor) {
					listaMoedas.remove(i);
					System.out.println("Moeda removida com sucesso!\n");
					return;
				}
				
				else if(tipo.equals("Dolar") && m instanceof Dolar && m.valor == valor) {
					listaMoedas.remove(i);
					System.out.println("Moeda removida com sucesso!\n");
					return;				
			}
				else if(tipo.equals("Euro") && m instanceof Euro && m.valor == valor) {
					listaMoedas.remove(i);
					System.out.println("Moeda removida com sucesso!\n");
					return;
			}
		}
			System.out.println("Moeda não encontrada! \n");
	}
		
		
		// LISTA de moedas
		public void listarMoedas() {
			
			if (listaMoedas.isEmpty()) {
				System.out.println("\n Cofrinho VAZIO! \n");
				return;
			}
			
			System.out.println("\n---Moedas encontradas---");
			
			for (Moeda m : listaMoedas) {
				m.info();
			}
			
			System.out.println();
		}
		
		//Mostra o total convertido
		public double totalConvertido() {
			double total = 0;
			
			for (Moeda m : listaMoedas) {
				total += m.converter();
			}
			
			return total;
			
			
		}
		
	}
