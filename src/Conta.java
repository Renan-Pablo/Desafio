public class Conta {
    private String nome;
    private String tipoConta;
    private double saldoAtual;

    public String getNome() {
        return nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public void exibeDadosIniciais(){
        System.out.println("********************************************");
        System.out.println("Dados Inicias do Cliente:\n");
        System.out.printf("Nome:             %s\n", nome);
        System.out.printf("Tipo de conta:    %s\n", tipoConta);
        System.out.printf("Saldo inicial:   R$ %.2f\n", saldoAtual);
        System.out.println("********************************************");
    }

    public void menuDeOpcoes(){
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair\n");
        System.out.println("Digite a opção desejada:");
    }

    public void mostrarSaldo(){
        System.out.printf("Saldo atual é de R$ %.2f\n", saldoAtual);
    }

    public void valorRecebido(double valor){
        saldoAtual += valor;
    }
    public void valorTransferido(double valor){
        saldoAtual -= valor;
    }
}
