package br.com.alura.minhasmusicas.modelos;

public class podcast extends audio implements classificavel{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirInformacoesPodcast(){
        System.out.println("Nome do Host: "+host);
        System.out.println("Nome do poscast: "+descricao);
    }
}
