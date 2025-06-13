package br.inatel.model;

public class Equipamento {
    private int idEquipamento;
    private String nomeEquipamento;

    public void mostrarEquipamento() {
        System.out.println("Usando equipamento: " + this.nomeEquipamento);
    };

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public int getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }
}


