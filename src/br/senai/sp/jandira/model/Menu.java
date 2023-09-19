package br.senai.sp.jandira.model;

import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);
    Cliente ListCliente = new Cliente();
    Funcionario listFuncionario = new Funcionario();
    Venda objVenda = new Venda();
    Veiculo listVeiculos = new Veiculo();

    public void menu(){

       boolean continuar = true;

        while (continuar){


            System.out.println("----------- Menu -----------");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Cadastrar Veiculo");
            System.out.println("3- Cadastrar Funcionario");
            System.out.println("4- Realizar Venda");
            System.out.println("5- Listar Veiculos");
            System.out.println("6- Listar Cliente");
            System.out.println("7- Listar Funcionario");
            System.out.println("8- Sair");
            System.out.println("----------------------------");

            int escolhaUsuario = teclado.nextInt();

            switch (escolhaUsuario){

                case 1:
                    Cliente objCliente = new Cliente();
                    ListCliente.CadastrarCliente();
                    ListCliente.adicionarCliente(ListCliente);
                    break;

                case 2:
                    Veiculo objVeiculo = new Veiculo();
                    listVeiculos.CadastarVeiculo();
                    listVeiculos.adicionarVeiculo(listVeiculos);
                    break;

                case 3:
                    Funcionario objFuncionario = new Funcionario();
                    listFuncionario.CadastrarFuncionario();
                    listFuncionario.adicionarFuncionario(listFuncionario);
                    break;

                case 4:
                    boolean validaVenda = objVenda.realizarVenda(listVeiculos, ListCliente);
                    if (validaVenda) {
                        ListCliente.dinheiroDisponivel -= listVeiculos.preco;
                        System.out.println("O saldo do cliente é: " + ListCliente.dinheiroDisponivel);
                    }

                    break;

                case 5:
                    listVeiculos.listVeiculos();
                    break;

                case 6:
                    ListCliente.ListCliente();
                    break;

                case 7:
                    listFuncionario.listFuncionario();
                    break;

                case 8:
                    System.out.println("Informe o modelo do veiculo");
                    String veiculoPesquisado = teclado.nextLine();

                    boolean validaVeiculo = listVeiculos.pesquisarVeiculo(veiculoPesquisado);

                    if (veiculoPesquisado != null && veiculoPesquisado != "") {
                        validaVeiculo = listVeiculos.pesquisarVeiculo(veiculoPesquisado);
                    }

                    if (validaVeiculo){
                        System.out.println("Veiculo Disponivel para Compra");
                    } else {
                        System.out.println("Veiculo Indisponivel !!");
                    }

                case 9:
                    continuar = false;
                    break;
            }

            if (escolhaUsuario < 0 || escolhaUsuario > 9){
                System.out.println("Escolha uma opção Válida!!");
            }
        }
    }
}
