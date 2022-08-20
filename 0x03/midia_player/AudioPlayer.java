public class AudioPlayer implements MediaPlayer{

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        if(tipoMedia == TipoMedia.MP3){
            System.out.print("Reproduzindo MP3: " + nomeArquivo);
        }else{
            String adapter = String.valueOf(tipoMedia);
            System.out.print("Reproduzindo " + adapter + ": " + nomeArquivo);
        }
    }
}
