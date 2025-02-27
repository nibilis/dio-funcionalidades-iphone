public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da url " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada!");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }
    
}
