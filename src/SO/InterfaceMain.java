package SO;

import Apps.AparelhoTelefonico;
import Apps.Navegador;
import Apps.ReprodutorMusical;

public class InterfaceMain {
    public static void main(String[] args) throws Exception {

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        Navegador navegar = new Navegador();
        ReprodutorMusical reproduzir =  new ReprodutorMusical();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        navegar.adicionarNovaAba();
        navegar.atualizarPagina();
        navegar.exibirPagina();

        reproduzir.selecionarMusica();
        reproduzir.pausar();
        reproduzir.tocar();
    }
}
