package br.inatel.model.equipamento.comunicacao;

import br.inatel.model.Equipamento;
import br.inatel.model.Usavel;

public class EquipamentoComunicacao extends Equipamento implements Usavel {
    private String radio;

    @Override
    public void usar() {
        System.out.println("Usando Equipamento de comunicacao.");
    }

    public EquipamentoComunicacao(String radio) {
        this.radio = radio;
    }
}


