package br.com.alura.minhasmusicas.modelos;

public class musica extends audio implements classificavel {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibirInformacoes() {
        System.out.println("Album do artista: " + album);
        System.out.println("Artista: " + artista);
        System.out.println("Genero: " + genero);
    }
    /* metodo que ira converter as curtidas em um parametro de 1 a 5 (de bom a ruim) */
    @Override
    public int getClassificacao() {
        if (getTotalCurtidas() >= 500) {
            return 5;
        } else if (getTotalCurtidas() >= 50) return 3;
        return 0;
    }
}