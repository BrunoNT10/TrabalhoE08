package br.inatel.model;

public abstract class Veiculo {
    public String modelo;
    public String fabricante;
    public int ano;
    public abstract void usar();
}