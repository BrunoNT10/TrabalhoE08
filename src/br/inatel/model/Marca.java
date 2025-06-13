package br.inatel.model;

public class Marca {
    private int idMarca;
    private String nome;
    private String nacionalidade;
    private int quantPilotos;

    public Marca() {}

    public Marca(String nome, String nacionalidade, int quantPilotos) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.quantPilotos = quantPilotos;
    }

    // Getters e Setters
    public int getIdMarca() { return idMarca; }
    public void setIdMarca(int idMarca) { this.idMarca = idMarca; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }
    public int getQuantPilotos() { return quantPilotos; }
    public void setQuantPilotos(int quantPilotos) { this.quantPilotos = quantPilotos; }

    public static class MarcaPatrocinador {
        private int idMarca;
        private int idPatrocinador;

        public MarcaPatrocinador() {}

        public MarcaPatrocinador(int idMarca, int idPatrocinador) {
            this.idMarca = idMarca;
            this.idPatrocinador = idPatrocinador;
        }

        // Getters e Setters
        public int getIdMarca() { return idMarca; }
        public void setIdMarca(int idMarca) { this.idMarca = idMarca; }
        public int getIdPatrocinador() { return idPatrocinador; }
        public void setIdPatrocinador(int idPatrocinador) { this.idPatrocinador = idPatrocinador; }
    }
}