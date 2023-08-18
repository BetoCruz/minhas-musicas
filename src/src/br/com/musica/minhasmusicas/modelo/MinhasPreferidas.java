package br.com.musica.minhasmusicas.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() > 9){
            System.out.println(audio.getTitulo()+"É considerado sucesso absoluto, esta bombando");
        }else{
            System.out.println(audio.getTitulo()+"Tambem é bom, esta entre as melhores");
        }
    }
}
