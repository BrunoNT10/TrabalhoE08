package br.inatel.model.carro;

import br.inatel.model.Veiculo;

public class Carro extends Veiculo {
    private int idPiloto;

    public Carro(String modelo, String fabricante, int ano, int idPiloto) {
        super();
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.idPiloto = idPiloto;
    }

    @Override
    public void usar() {
        System.out.println("Dirigindo o carro: " + modelo + " da marca " + fabricante);
    }

    // Getters e Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo=modelo;}
}


