package br.com.spotfy.modelos;

public class Audio {
    private String titulo;
    private String artista;
    private int duracao;
    private int totalDeRepoducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeRepoducoes() {
        return totalDeRepoducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        if (curtidas > 0 || totalDeRepoducoes > 2){
            return 5;
        } else {
            return 0;
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibeFichaTecnica(){
        System.out.println("############### FICHA TÉCINICA ###############");
        System.out.println("O nome da música é: " + titulo);
        System.out.println("Do artista: " + artista);
        System.out.println("Duração: " + duracao + " segundos | " + totalDeRepoducoes + " reproduções");
        System.out.println("Curtidas: " + curtidas + " | " + getClassificacao() + " estrelas");
    }

    public void play(){
        System.out.println("Tocando " + titulo + " ...");
        this.totalDeRepoducoes++;
    }
    public void curtir(){
        System.out.println("Você curtiu " + titulo + "S2");
        this.curtidas++;
    }
}
