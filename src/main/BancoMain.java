package main;

import service.BancoService;
import service.Conta;

public class BancoMain {
    public static void main(String[] args) {
        BancoService bancoService = new BancoService();

        bancoService.adicionarNovaConta("Levi", "123.456.789.11");
        bancoService.adicionarNovaConta("Thiago", "123.456.789.77");
        bancoService.adicionarNovaConta("Thiago", "123.456.789.77");


        bancoService.depositarDinheiro("001", 3500);

        bancoService.listarContas();

        bancoService.sacarDinheiro("001",2500);

        bancoService.listarContas();



    }




}
