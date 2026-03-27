package cofrinho;

public class Principal {

	public static void main(String[] args) {
		
		Cofrinho c = new Cofrinho();
		int opcao = 0; // Para inicializar o programa
				
	
		while (opcao != 5) {

            // MENU PRINCIPAL
            opcao = c.menu1();

            // valida opção do menu (1 a 5)
            while (opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida! Tente novamente.\n");
                opcao = c.menu1();
            }

            // ADICIONAR MOEDA
            if (opcao == 1) {

                int tipo = c.menu2();

                // Validação do tipo de moeda
                while (tipo < 1 || tipo > 3) {
                    System.out.println("Tipo inválido! Tente novamente.\n");
                    tipo = c.menu2();
                }

                double valor = c.valor();

                if (tipo == 1) {
                    c.adicionar(new Real(valor));
                } else if (tipo == 2) {
                    c.adicionar(new Dolar(valor));
                } else {
                    c.adicionar(new Euro(valor));
                }
            }

            // REMOVER MOEDA
            else if (opcao == 2) {

                int tipo = c.menu2();

                // Validação do tipo de moeda
                while (tipo < 1 || tipo > 3) {
                    System.out.println("Tipo inválido! Tente novamente.\n");
                    tipo = c.menu2();
                }

                double valor = c.valor();

                if (tipo == 1) {
                    c.remover("Real", valor);
                } else if (tipo == 2) {
                    c.remover("Dolar", valor);
                } else {
                    c.remover("Euro", valor);
                }
            }

            // LISTAR MOEDAS
            else if (opcao == 3) {
                c.listarMoedas();
            }

            // TOTAL CONVERTIDO
            else if (opcao == 4) {
                System.out.println("\nTotal convertido: R$ " + c.totalConvertido());
                System.out.println();
            }
        }

        System.out.println("\nPROGRAMA FINALIZADO!");
    }
}