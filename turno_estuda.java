import java.util.Scanner;
import static java.lang.System.out;
public class turno_estuda {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        out.println("Períodos:");
        out.println("Digite 'M' para Manhã");
        out.println("Digite 'T' para Tarde");
        out.println("Digite 'N' para Noturno");
        out.println("Qual período você estuda?");
        String turno = entrada.nextLine();
        String mensagem = "";

        if (turno.equals("M") || turno.equals("T") || turno.equals("N")){
            if(turno.equals("M")){
                mensagem = "Bom dia";
            }else if(turno.equals("T")){
                mensagem = "Boa Tarde";
            }else{
                mensagem = "Boa Noite";
            }
            out.print(mensagem);
        }else{
            out.println("Valor inválido");
            out.println("Digite as letras em maiúsclo e a letras correspondente");
        }
    }
}
