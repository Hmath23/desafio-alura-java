import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeCliente = "Matheus Henrique";
        String tipoConta = "Conta Corrente";
        double saldo = 1239.32;
        double valor =0;
        int operacoes = 0;

        System.out.println("================================================");
        System.out.println("===========       Banco Java      ==============");
        System.out.println("================================================");
        System.out.println("");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo da Conta: R$ " + saldo);
        System.out.println("");
        System.out.println("");

        String menu = """
                Informe a operação que deseja realizar:
                1 - Consultar Saldo
                2 - Depositar Valor
                3 - Trasnferir Valor
                4 - Sair
                """;

        while (operacoes != 4){

            System.out.println(menu);
            operacoes = leitura.nextInt();

            if (operacoes == 1){
                System.out.println("O seu saldo atual é de R$" + saldo);
            }
            else if (operacoes == 2){
                System.out.println("Digite o valor a ser depositado");
                valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("seu novo saldo é de R$" + saldo);
            }
            else if (operacoes == 3){
                System.out.println("Digite o Valor a ser Transferido");
                valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente para realizar a transação");
                }else {
                    saldo -= valor;
                    System.out.println("Seu novo saldo é de R$" + saldo);
                }
            }
            else if (operacoes == 4) {
                break;
            }
            else {
                System.out.println("Opção inválida");
            }
        }
    }
}
