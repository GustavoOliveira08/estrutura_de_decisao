import java.util.Scanner;
import static java.lang.System.out;
public class varias_opcoes {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        out.println("Escolha um número para as opções:\n Opção 1 \n Opção 2 \n Opção 3 \n Sair 4 \n");
        out.print("Digite o Número da opção: ");
        int opcao= entrada.nextInt();
        String usuario = "";

        if ( opcao == 1){
            usuario = "Você selecionou a opção 1";
        }else if ( opcao == 2){
            usuario = "Você selecionou a opção 2";
        }else if ( opcao == 3){
            usuario = "Você selecionou a opção 3";
        }else if ( opcao == 4){
            usuario = "Você selecionou a sair";
        }else{
            usuario = "Opção inválida";
        }
        out.println(usuario);
        out.println("Fim do programa!");
    }
}
