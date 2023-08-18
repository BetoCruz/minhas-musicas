package br.com.musica.minhasmusicas.modelo;

public class Podcast extends Audio{
    private String apresentador;
    private String descricao;



    //--------metodos-------------
    public void sinopse(){
        System.out.println("Nome do Apresentador:"+this.getApresentador());
        System.out.println("Descriçao:"+this.getDescricao());
        System.out.println("Classificação:"+getClassificacao());
    }    //--------Fim metodos---------

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 400){
            return 10;
        }else {
            return 8;
        }
    }
}
