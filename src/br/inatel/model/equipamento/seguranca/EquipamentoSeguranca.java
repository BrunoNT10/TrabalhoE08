package br.inatel.model.equipamento.seguranca;

import br.inatel.model.Equipamento;
import br.inatel.model.Usavel;

public class EquipamentoSeguranca extends Equipamento implements Usavel {
    private String capacete;
    private String macacao;
    private String bota;
    private String luva;

    public EquipamentoSeguranca(String capacete, String macacao, String bota, String luva) {
        this.capacete = capacete;
        this.macacao = macacao;
        this.bota = bota;
        this.luva = luva;
    }

    @Override
    public void usar() {
        System.out.println("Usando equipamento de segurança: " + capacete + ", " + macacao + ", " + bota + ", " + luva);
    }

    @Override
    public void mostrarEquipamento() {
        System.out.println("Usando equipamento de segurança: " + capacete + ", " + macacao + ", " + bota + ", " + luva);
    }


    // Getters e Setters
    public String getCapacete() { return capacete; }
    public void setCapacete(String capacete) { this.capacete = capacete; }

    public String getMacacao() { return macacao; }
    public void setMacacao(String macacao) { this.macacao = macacao; }

    public String getBota() { return bota; }
    public void setBota(String bota) { this.bota = bota; }

    public String getLuva() { return luva; }
    public void setLuva(String luva) { this.luva=luva;}
}


