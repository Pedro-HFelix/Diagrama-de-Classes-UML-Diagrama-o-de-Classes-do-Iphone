package IPHONE;

import java.util.Scanner;

import apps_Iphone.navegador.adicionarNovaAba;

public class usuario {
    public static void main(String[] args) {
        iphoneCel buscaLeitorIphone = new iphoneCel();

        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha o que deseja fazer ");
        String armazenamento = leitor.nextLine();  

        if(armazenamento.equals("navegador"))
        {
            System.out.println("O que deseja fazer no navegador?");
            armazenamento = leitor.nextLine();
            switch (armazenamento) {
                case "NEWP":
                    buscaLeitorIphone.Atualizarpagina();
                    break;
            case "ATUALIZAR":
                    buscaLeitorIphone.Atualizarpagina();
                    break;
            case "EXIBIRPAG": 
                    buscaLeitorIphone.exibirPagina();
                default:
                    break;
            }
        }
        else if (armazenamento.equals("reproduzir"))
        {
            System.out.println("O que deseja fazer na musica?");
            armazenamento = leitor.nextLine();
            switch (armazenamento) {
                case "ESCOLHER":
                    buscaLeitorIphone.selecionarMusica();
                    break;
            case "PAUSAR":
                    buscaLeitorIphone.pausar();
                    break;
            case "TOCAR": 
                    buscaLeitorIphone.tocar();
                default:
                    break;
            }
        }
        else if (armazenamento.equals("telefone"))
        {
           System.out.println("O que deseja fazer no telefone"); 
           armazenamento = leitor.nextLine();
           switch (armazenamento) {
               case "ATENDER":
                   buscaLeitorIphone.atender();
                   break;
           case "CORREIO":
                   buscaLeitorIphone.iniciarCorrerioVoz();
                   break;
           case "LIGAR": 
                   buscaLeitorIphone.ligar();
               default:
                   break;
           }
        }
    }

    
    
    

    
}
