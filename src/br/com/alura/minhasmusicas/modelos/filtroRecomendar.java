package br.com.alura.minhasmusicas.modelos;

public class filtroRecomendar {
    private String recomendacao;
            /* metodo para converter o parametro de 1 a 5 em recomendacoes com String */
        public void filtrar(classificavel Classificavel){
            if (Classificavel.getClassificacao()>=5){
                System.out.println("Um dos preferidos do momento!");
            }else if(Classificavel.getClassificacao()>=3){
                System.out.println("os fãs estão curtindo!");
            }else {
                System.out.println("Coloque na sua playlist!");
            }
        }

}
