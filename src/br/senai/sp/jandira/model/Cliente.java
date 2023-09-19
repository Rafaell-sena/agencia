package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    /**
     * Declarar Variaveis
     *
     * */
    String nome, email, endereco;
    long telefone, cpf, rg;

    double dinheiroDisponivel;

    /** Instancia o Scanner */
    Scanner teclado = new Scanner(System.in);

    List<Cliente> ListCliente = new ArrayList<>();


    public void CadastrarCliente(){

        System.out.println("---------  Cadastro Cliente  ---------");
        System.out.println("Qual é o nome do Cliente: ");
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
    }

    public void adicionarCliente(Cliente objCliente) {
        ListCliente.add(objCliente);
    }
    public void ListCliente() {
            for (Cliente objCliente : ListCliente) {
                System.out.println(objCliente.nome);

            }
        }
    }




