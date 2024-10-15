package edu.thiago;

//  import edu.thiago.Iphone;
//  import edu.thiago.AparelhoTelefonico;
//  import edu.thiago.NavegadorInternet;
//  import edu.thiago.ReprodutorMusical;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        Scanner leitor = new Scanner(System.in);


        System.out.println("Desejo Efetuar uma Ligação, irei digitar o número e avançar:");
        String numero = leitor.nextLine();

        iphone.ligar(numero);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("Desejo selecionar uma música, qual seria?");
        String musica = leitor.nextLine();
        
        iphone.selecionarMusica(musica);
        iphone.tocar();
        iphone.pausar();

        System.out.println("Desejo acessar uma Página, qual exatamente?");
        String pagina = leitor.nextLine();

        iphone.exibirPagina(pagina);
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        
        leitor.close();
    }
}
