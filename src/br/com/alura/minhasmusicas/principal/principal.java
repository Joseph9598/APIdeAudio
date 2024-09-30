package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.filtroRecomendar;
import br.com.alura.minhasmusicas.modelos.musica;
import br.com.alura.minhasmusicas.modelos.podcast;

public class principal {
    public static void main(String[] args) {
        musica minhaMusica = new musica();
        minhaMusica.setAlbum("Trilher");
        minhaMusica.setArtista("Michael Jackson");
        minhaMusica.setGenero("Pop");

        minhaMusica.exibirInformacoes();

        /* metodo que ira inserir o numero de curtidas*/
        for (int i = 0; i < 500; i++) {
            minhaMusica.curtir();
        }
        /* metodo para inserir as reproduções */
        for (int i = 0; i <50 ; i++) {
            minhaMusica.reproduzir();
        }

        filtroRecomendar meuFiltro = new filtroRecomendar();
        meuFiltro.filtrar(minhaMusica);
        System.out.println(" ");

        podcast meuPodcast = new podcast();
        meuPodcast.setDescricao("BolhaDev");
        meuPodcast.setHost("Marcus Mendes");
        meuPodcast.exibirInformacoesPodcast();

        for (int i = 0; i <350 ; i++) {
            meuPodcast.reproduzir();
        }
        meuFiltro.filtrar(meuPodcast);



    }
}
