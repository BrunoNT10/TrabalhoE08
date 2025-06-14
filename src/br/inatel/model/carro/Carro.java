package br.inatel.model.carro;

import br.inatel.model.Marca;
import br.inatel.model.Veiculo;
import br.inatel.model.Piloto;
import br.inatel.model.Motor;

public class Carro extends Veiculo {
    private Piloto piloto;
    private Marca marca;
    private Motor motor;

    public Carro(String modelo, String fabricante, int ano, Piloto piloto, Marca marca, Motor motor) {
        super();
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.piloto = piloto;
        this.marca = marca;
        this.motor = motor;
    }

    @Override
    public void usar() {
        System.out.println("Dirigindo o carro: " + modelo + " da marca " + fabricante);
    }

    // Getters e Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo=modelo;}
}


