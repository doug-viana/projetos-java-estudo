package br.com.anbima.projeto062;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> clientes = new ArrayList<>();
        String nome;

        System.out.println("--- Cadastro de Clientes ANBIMA ---");

        while (true) {
            System.out.print("Digite o nome do cliente (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            clientes.add(nome);
        }

        // Ordenando a lista
        Collections.sort(clientes);

        System.out.println("\nLista de Clientes Cadastrados: ");
        for (String c : clientes) {
            System.out.println("- " + c);
        }
        System.out.println("Total: " + clientes.size());
    }
}
