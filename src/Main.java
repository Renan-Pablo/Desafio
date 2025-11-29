import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldoAtual = 2500;
        int escolhaOpcao = 0;
        System.out.println(
                """
        ******************************************************
        Dados iniciais do Cliente:
        
        Nome:             Renan Pablo
        Tipo conta:       Corrente
        Saldo inicial:    R$ 2500,00
        ******************************************************
        
        Operações:
        """);
        while (escolhaOpcao != 4) {


            System.out.println("""            
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair 
                    
                    Digite  a opção desejada: """);
            escolhaOpcao = input.nextInt();

            switch (escolhaOpcao) {
                case 1:
                    System.out.printf("O saldo atual é de R$ %.1f\n", saldoAtual);
                    break;
                case 2:
                    System.out.println("Qual valor deseja receber: ");
                    double valorRecebido = input.nextDouble();
                    if (valorRecebido <= 0){
                        System.out.println("Esse valor não é permitido para receber.");
                        valorRecebido = input.nextDouble();
                    }
                        saldoAtual += valorRecebido;
                        System.out.printf("Saldo atualizado R$ %.1f\n", saldoAtual);
                    break;
                case 3:
                    System.out.println("Qual valor deseja transferir: ");
                    double valorTransferido = input.nextDouble();
                    if (valorTransferido > saldoAtual){
                        System.out.println("Não há saldo suficiente para fazer essa transferêmcia.");
                        valorTransferido = input.nextDouble();
                    }
                        saldoAtual -= valorTransferido;
                        System.out.printf("Saldo atualizado R$ %.1f\n", saldoAtual);
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
