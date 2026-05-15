package br.com.anbima.projeto063;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("--- Validador de Registros ANBIMA ---");

        while(true) {
            try {
                System.out.print("Por favor, digite o número de registro: ");
                // O erro acontece aqui se o usuário digitar letras
                numero = Integer.parseInt(scanner.nextLine());

                // Se o código chegar NESTA LINHA, significa que não houve erro
                break;
            } catch (NumberFormatException e) {
                // O código pula para cá se houver erro de formato
                System.out.println("Erro: Entrada inválida. Use apenas algarismos numéricos!");
            }
        }
        System.out.println("Sucesso! Registro " + numero + " processado.");
        scanner.close();
    }
}
