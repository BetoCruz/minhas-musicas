package br.com.musica.minhasmusicas.modelo;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;


    //----------metodos----------
    public void sinopse(){
        System.out.println("Nome do artista:"+this.getArtista());
        System.out.println("Album:"+getTitulo());
        System.out.println("Classificação:"+getClassificacao());
    }
    //----------fim metodos----------

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

    @Override //---Aplicando o conceito de polimorfismo
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 4500){
            return 10;
        }else{
            return 7;
        }
    }
}
