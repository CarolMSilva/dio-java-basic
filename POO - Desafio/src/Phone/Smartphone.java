package Phone;

import Iphone.Iphone;


public class Smartphone{
    public static void main(String[] args) {
        Iphone phone = new Iphone();

        phone.ligar();
        phone.tocarMusica("Música 1");
        phone.pausarMusica();
        phone.selecionarMusica("Música 2");
        phone.fazerchamada("123-456-789");
        phone.atenderChamada("987-654-321");
        phone.iniciarConversaVoz("987-654-321");
        phone.enviarMensagem("987-654-321", "Olá, tudo bem?");
        phone.receberMensagem("987-654-321", "Tudo bem, obrigado!");
        phone.exibirPagina("https://www.exemplo.com");
        phone.adicionarNovaAba("https://www.novaaba.com");
        phone.atualizarPagina();
        phone.fecharPaginaWeb();
        phone.navegarHistorico();
        phone.desligar();
    }
}
