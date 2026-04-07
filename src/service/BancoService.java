package service;

public class BancoService {
 Conta[] conta = new Conta[10];
 int posicao = 0;


 public void adicionarNovaConta(String pedirTitular, String pedirCPF){
     Conta conta = new Conta();

     conta.titular = pedirTitular;
     conta.CPF = pedirCPF;
     conta.numeroDaConta = String.format("%03d", posicao + 1);

     this.conta[posicao] = conta;
     posicao++;

 }

 public void depositarDinheiro(String numeroDaConta, double valorParaDepositar){
     boolean encontrou = false;

     for (int i = 0; i < posicao; i++){
        if (conta[i].numeroDaConta.equals(numeroDaConta)){
            conta[i].saldo += valorParaDepositar;
            System.out.println("Valor depositado com sucesso! ");
            encontrou = true;
            break;
        }
    }

     if (!encontrou){
         System.out.println("Conta não encontrada");
         return;
     }

 }

 public void sacarDinheiro(String numeroDaConta, double valorParaSacar){

     boolean encontrou = false;

     for (int i = 0; i < posicao; i++){

         if (conta[i].numeroDaConta.equals(numeroDaConta)){
             encontrou = true;
             if (conta[i].saldo < valorParaSacar){
                 System.out.println("Saldo insuficente para sacar");
                 System.out.println("Saldo disponivel: "+ conta[i].saldo);
             }else {
                 conta[i].saldo -= valorParaSacar;
                 System.out.println("Valor sacado com sucesso!");
                 break;
             }
         }

     }

     if (!encontrou){
         System.out.println("Conta não encontrada!");
         return;
     }
 }

 public void consultarConta(String numeroDaConta){

     boolean encontrou = false;

     for (int i = 0; i < posicao; i++){

         if (conta[i].numeroDaConta.equals(numeroDaConta)){
             System.out.println("Titular: "+conta[i].titular);
             System.out.println("CPF: "+conta[i].CPF);
             System.out.println("Numero da conta: "+conta[i].numeroDaConta);
             System.out.println("Saldo disponivel: "+conta[i].saldo);
             encontrou = true;
             break;
         }
     }

     if (!encontrou){
         System.out.println("Conta não encontrada!");
     }

 }


 public void listarContas(){
     for (int i = 0; i < posicao; i++){
         System.out.println("-------------------");
         System.out.println("Titular: "+conta[i].titular);
         System.out.println("CPF: "+conta[i].CPF);
         System.out.println("Numero da conta: "+conta[i].numeroDaConta);
         System.out.println("Saldo disponivel: "+conta[i].saldo);

     }
 }


}
