import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.nome = "Renan Pablo";
        conta1.tipoConta = "Corrente";
        conta1.saldoAtual = 2500.00;

        conta1.exibeDadosIniciais();

        Scanner input = new Scanner(System.in);

        int escolhaOpcao = 0;
        while (escolhaOpcao != 4) {

            conta1.menuDeOpcoes();
            escolhaOpcao = input.nextInt();

            switch (escolhaOpcao) {
                case 1:
                    conta1.mostrarSaldo();
                    break;
                case 2:
                    System.out.println("Qual valor deseja receber: ");
                    double valorRecebido = input.nextDouble();
                    if (valorRecebido <= 0){
                        System.out.println("Valor inapropriado, tente novamente: ");
                        valorRecebido = input.nextDouble();
                    }
                        conta1.valorRecebido(valorRecebido);
                        conta1.mostrarSaldo();
                    break;
                case 3:
                    System.out.println("Qual valor deseja transferir: ");
                    double valorTransferido = input.nextDouble();
                    if (valorTransferido > conta1.saldoAtual){
                        System.out.println("Não há saldo suficiente para fazer essa transferêmcia.");
                        valorTransferido = input.nextDouble();
                    }
                        conta1.valorTransferido(valorTransferido);
                        conta1.mostrarSaldo();
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
        }
    }
