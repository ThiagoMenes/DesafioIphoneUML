package edu.thiago;
// import edu.thiago.AparelhoTelefonico;
// import edu.thiago.NavegadorInternet;
// import edu.thiago.ReprodutorMusical;



public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    //Métodos AparelhoTelefônico

    public void ligar(String numero){
        System.out.println("Ligando para o número: "+ numero + " pelo Iphone");
    }
    public void atender(){
        System.out.println("Atendendo a ligação pelo Iphone");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o Correio de Voz pelo Iphone");
    }

    //Métodos Reprodutor Musical

    public void tocar(){
        System.out.println("Tocando Música pelo Iphone");
    }
    public void pausar(){
        System.out.println("Música Pausada pelo Iphone");
    };
    public void selecionarMusica(String musica){
        System.out.println("Música " + musica + " Selecionada pelo Iphone");
    };

    /*  Métodos NavegadorInternet*/

    public void exibirPagina(String url){
        System.out.println("Exibindo a página: " + url + " pelo Iphone");
    };
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba pelo Iphone");
    };
    public void atualizarPagina(){
        System.out.println("Atualizando a Página pelo Iphone");
    }

}
