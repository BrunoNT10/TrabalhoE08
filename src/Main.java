package br.inatel;
import java.util.Scanner;

import br.inatel.model.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Bem vindo ao Nascar Manager!");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar algo");
            System.out.println("2 - Buscar algo");
            int opcao = entrada.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            if (opcao == 1) {
                System.out.println("1 - Cadastrar veiculo");
                System.out.println("2 - Cadastrar piloto");
                System.out.println("3 - Cadastrar marca");
                System.out.println("4 - Cadastrar equipamento");
                System.out.println("5 - Cadastrar patrocinador");
            }
            else if (opcao == 2) {
                System.out.println("1 - Buscar veiculos");
                System.out.println("2 - Buscar pilotos");
                System.out.println("3 - Buscar marcas");
                System.out.println("4 - Buscar equipamentos");
                System.out.println("5 - Buscar patrocinadores");
            }
        }
    }
}