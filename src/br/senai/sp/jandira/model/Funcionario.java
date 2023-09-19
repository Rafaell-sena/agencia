package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {

    /**
     * Declarar Variaveis
     *
     * */
    String nome, email, endereco;
    long telefone, cpf, rg;

    double comissao;

    /** Instancia o Scanner */
    Scanner teclado = new Scanner(System.in);

    List<Funcionario> listFuncionario = new ArrayList<>();

    public void CadastrarFuncionario(){

        System.out.println("---------  Cadastro Cliente  ---------");
        System.out.println("Qual é o nome do Funcionario: ");
        nome = teclado.nextLine();
        System.out.println("Informe o CPF: ");
        cpf = teclado.nextLong();
        System.out.println("Informe o RG: ");
        rg = teclado.nextLong();
        System.out.println("Informe o Telefone: ");
        telefone = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Informe o email: ");
        email = teclado.nextLine();
        System.out.println("Informe o endereço: ");
        endereco = teclado.nextLine();
        System.out.println("--------  Cadastro Finalizado  ---------");
        System.out.println("----------------------------------------");

        teclado.close();

    }

    public void receberComissao(Veiculo objveiculo){

        comissao = objveiculo.preco * 0.10;
        System.out.println("A comissão foi de " + comissao);
    }

    public void adicionarFuncionario(Funcionario objFuncionario) {
        listFuncionario.add(objFuncionario);
    }

    public void listFuncionario() {
        for (Funcionario objFuncionario : listFuncionario) {
            System.out.println(objFuncionario.nome);
        }
    }
}


