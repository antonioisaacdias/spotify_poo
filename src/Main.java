import br.com.spotfy.modelos.Audio;
import br.com.spotfy.modelos.Musica;

public class Main {
    public static void main(String[] args) {
        Musica admiravelGadoNovo = new Musica();
        admiravelGadoNovo.setArtista("Zé Ramalho");
        admiravelGadoNovo.setDuracao(156);
        admiravelGadoNovo.setTitulo("Adimirável Gado Novo");

        Musica apenasUmRapaz = new Musica();
        apenasUmRapaz.setTitulo("Apenas um Rapaz Latino-americano");
        apenasUmRapaz.setDuracao(123);
        apenasUmRapaz.setArtista("Belchior");

        Musica borbulhasDeAmor = new Musica();
        borbulhasDeAmor.setTitulo("Borbulhas de Amor");
        borbulhasDeAmor.setDuracao(154);
        borbulhasDeAmor.setArtista("Fagner");

        admiravelGadoNovo.play();
        admiravelGadoNovo.curtir();

        admiravelGadoNovo.exibeFichaTecnica();
        apenasUmRapaz.exibeFichaTecnica();
        borbulhasDeAmor.exibeFichaTecnica();



    }
}