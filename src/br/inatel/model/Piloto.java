package br.inatel.model;

import br.inatel.model.equipamento.seguranca.EquipamentoSeguranca;

public class Piloto {
    private String nome;
    private int qpf;
    private String genero;
    private String nacionalidade;
    private boolean campeao;
    private EquipamentoSeguranca equipamentoSeguranca;

    // Construtores
    public Piloto() {}

    public Piloto(String nome, EquipamentoSeguranca equipamentoSeguranca) {
        this.nome = nome;
        this.equipamentoSeguranca = equipamentoSeguranca;
    }

    public Piloto(String nome, int qpf, String genero, String nacionalidade, boolean campeao) {
        this.nome = nome;
        this.qpf = qpf;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.campeao = campeao;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getQpf() { return qpf; }
    public void setQpf(int qpf) { this.qpf = qpf; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }
    public boolean isCampeao() { return campeao; }
    public void setCampeao(boolean campeao) { this.campeao = campeao; }
    public EquipamentoSeguranca getEquipamentoSeguranca() { return this.equipamentoSeguranca; }
    public void setEquipamentoSeguranca(EquipamentoSeguranca equipamentoSeguranca) { this.equipamentoSeguranca = equipamentoSeguranca; }
}