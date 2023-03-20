import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome Imobiliária: ");
        String nome = sc.nextLine();

        System.out.print("Telefone Imobiliária: ");
        String telefone = sc.nextLine();

        System.out.print("Cidade Imobiliária: ");
        String cidade = sc.nextLine();

        Imobiliaria im = new Imobiliaria(nome, telefone, cidade);

        System.out.print("Selecione uma opção (1 - Adicionar Apto, 2 - Ajustar aluguel, 3 - Média das áreas, 4 - Exibir Info): ");
        int operacao = sc.nextInt();
        while(operacao != 5) {
            switch (operacao) {
                case 1:
                    System.out.println("NOVO APARTAMENTO");
                    sc.nextLine();

                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();

                    System.out.print("Número de Quartos: ");
                    int numQuartos = sc.nextInt();

                    System.out.print("Área: ");
                    double area = sc.nextDouble();

                    System.out.print("Aluguel: ");
                    double aluguel = sc.nextDouble();

                    Apartamento novoAp = new Apartamento(endereco, numQuartos, area, aluguel);
                    im.addApartamento(novoAp);
                    break;
                case 2:
                    im.ajustaAluguel();
                    break;
                case 3:
                    System.out.printf("Média das áreas: %d\n", im.mediaArea());
                    break;
                case 4:
                    im.mostraInfo();
                    break;
                default:
                    System.out.println("Este número de operação não existe");
                    break;
            }
            System.out.print("Selecione uma opção (1 - Adicionar Apto, 2 - Ajustar aluguel, 3 - Média das áreas, 4 - Exibir Info): ");
            operacao = sc.nextInt();
        }

        sc.close();
    }
}
