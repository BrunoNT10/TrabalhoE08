package br.inatel;
import java.util.Scanner;

import br.inatel.model.*;
import br.inatel.model.carro.Carro;
import br.inatel.model.equipamento.seguranca.EquipamentoSeguranca;

import java.io.*;
import java.io.IOException;


public class Main {
    public static void writeFile(String conteudo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./db.txt", true))) {
            writer.write(conteudo);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carro[] carros = new Carro[20];
        int count = 0;
        while (true) {
            System.out.println("Bem vindo ao Nascar Manager!");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastre um novo carro");
            System.out.println("2 - Sair do sistema");
            System.out.print("Escolha: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                count++;
                System.out.println("Primeiro vamos cadastrar as informações do carro:");
                System.out.print("Modelo: ");
                String modelo = entrada.nextLine();
                System.out.print("Fabricante: ");
                String fabricante = entrada.nextLine();
                System.out.print("Ano: ");
                int ano = entrada.nextInt();
                System.out.print("Cilindrada: ");
                double cilindrada = entrada.nextDouble();
                System.out.print("Aspirado: ");
                boolean aspirado = entrada.nextBoolean();
                System.out.print("Durabilidade: ");
                double durabilidade = entrada.nextDouble();
                entrada.nextLine();

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("Agora vamos cadastrar as informações do piloto: ");
                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                System.out.println("Equipamento de Segurança usado pelo piloto: ");
                System.out.print("Capacete: ");
                String capacete = entrada.nextLine();
                System.out.print("Macacão: ");
                String macacao = entrada.nextLine();
                System.out.print("Bota: ");
                String bota = entrada.nextLine();
                System.out.print("Luva: ");
                String luva = entrada.nextLine();

                System.out.println("Marca proprietária do veículo: ");
                System.out.print("Nome: ");
                String nomeMarca = entrada.nextLine();
                System.out.print("Nacionalidade: ");
                String nacionalidadeMarca = entrada.nextLine();
                System.out.print("Quantidade de Pilotos: ");
                int numPilotosMarca = entrada.nextInt();

                Motor motor = new Motor(cilindrada, aspirado, durabilidade);
                EquipamentoSeguranca equipamento = new EquipamentoSeguranca(capacete, macacao, bota, luva);
                Piloto piloto = new Piloto(nome, equipamento);
                Marca marca = new Marca(nomeMarca, nacionalidadeMarca, numPilotosMarca);
                Carro carro = new Carro(modelo, fabricante, ano, piloto, marca, motor);

                writeFile("Modelo: " + modelo + "\n");
                writeFile("Fabricante: " + fabricante + "\n");
                writeFile("Ano: " + ano + "\n");
                writeFile("Cilindrada: " + cilindrada + "\n");
                writeFile("Aspirado: " + aspirado + "\n");
                writeFile("Durabilidade: " + durabilidade + "\n");
                writeFile("Capacete: " + capacete + "\n");
                writeFile("Macacão: " + macacao + "\n");
                writeFile("Bota: " + bota + "\n");
                writeFile("Luva: " + luva + "\n");
                writeFile("Nome do Piloto: " + nome + "\n");
                writeFile("Nome da Marca: " + nomeMarca + "\n");
                writeFile("Nacionalidade da Marca: " + nacionalidadeMarca + "\n");
                writeFile("Número de Pilotos da Marca: " + numPilotosMarca + "\n");
                writeFile("****************************\n");
                carros[count] = carro;
            }
            else {
                break;
            }
        }
    }
}