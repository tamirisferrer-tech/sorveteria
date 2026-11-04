public class Sorveteria {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int opcao;
        int quantidadeBolas = 0;
        double precoBola = 3.00;

        do {
            System.out.println("===== SORVETERIA =====");
            System.out.println("1 - Chocolate");
            System.out.println("2 - Morango");
            System.out.println("3 - Baunilha");
            System.out.println("4 - Flocos");
            System.out.println();
            System.out.println("0 - Fechar pedido");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Chocolate adicionado!");
                    quantidadeBolas++;
                    break;
                case 2:
                    System.out.println("Morango adicionado!");
                    quantidadeBolas++;
                    break;
                case 3:
                    System.out.println("Baunilha adicionada!");
                    quantidadeBolas++;
                    break;
                case 4:
                    System.out.println("Flocos adicionado!");
                    quantidadeBolas++;
                    break;
                case 0:
                    System.out.println("Fechando pedido...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println();

        } while (opcao != 0);

        if (quantidadeBolas == 0) {
            System.out.println("Obrigado pela preferência!");
        } else {
            double valorSemDesconto = quantidadeBolas * precoBola;
            double desconto = 0;
            double valorFinal = valorSemDesconto;

            if (quantidadeBolas >= 3) {
                desconto = valorSemDesconto * 0.15;
                valorFinal = valorSemDesconto - desconto;
            }

            System.out.println("Quantidade de bolas: " + quantidadeBolas);
            System.out.printf("Valor sem desconto: R$ %.2f%n", valorSemDesconto);
            if (desconto > 0) {
                System.out.printf("Desconto (15%%): R$ %.2f%n", desconto);
            }
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);
            System.out.println("Obrigado pela preferência!");
        }
    }
}