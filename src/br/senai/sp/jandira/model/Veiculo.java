package br.senai.sp.jandira.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {
    String modelo, marca, cor, placa, combustivel;
    double preco;
    int ano;

    /**
     * Instancia Scanner
     */
    Scanner teclado = new Scanner(System.in);
    List<Veiculo> listVeiculos = new ArrayList();

    public void CadastarVeiculo() {

        System.out.println("---------  Cadastro Veiculo  ---------");
        System.out.println("Informe a Marca: ");
        marca = teclado.nextLine();
        System.out.println("Informe o Modelo: ");
        modelo = teclado.nextLine();
        System.out.println("Informe a cor: ");
        cor = teclado.nextLine();
        System.out.println("Informe o combustivel: ");
        combustivel = teclado.nextLine();
        System.out.println("Informe o ano: ");
        ano = teclado.nextInt();
        System.out.println("Informe o Preço: ");
        preco = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Informe a Placa:");
        placa = teclado.nextLine();
        System.out.println("--------  Cadastro Finalizado  ---------");
        System.out.println("----------------------------------------");


    }

    public void adicionarVeiculo(Veiculo objVeiculo) {
        listVeiculos.add(objVeiculo);
    }

    public void listVeiculos() {
        for (Veiculo objVeiculo : listVeiculos) {
            System.out.println(objVeiculo.modelo);
        }
    }

    public boolean pesquisarVeiculo(String veiculoPesquisado) {
        for (Veiculo objVeiculo : listVeiculos) {

            if (objVeiculo.modelo.equalsIgnoreCase(veiculoPesquisado)) ;
            return true;
        }
        return false;
    }
}
