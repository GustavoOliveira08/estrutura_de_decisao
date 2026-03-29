import java.util.Scanner;
import static java.lang.System.out;
public class situacao_escolar {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        out.print("Nota do aluno no 1º Bimestre: ");
        double nota1 = entrada.nextDouble();
        out.print("Nota do aluno no 2º Bimestre: ");
        double nota2 = entrada.nextDouble();
        out.print("Nota do aluno no 3º Bimestre: ");
        double nota3 = entrada.nextDouble();
        out.print("Nota do aluno no 4º Bimestre: ");
        double nota4 = entrada.nextDouble();

        double mediaFinal = (nota1+nota2+nota3+nota4)/4;
        String conceito = "";
        String situacao = "";

        if (mediaFinal >= 9 && mediaFinal <= 10){
            conceito = "A";
            situacao = "APROVADO";
        }else if (mediaFinal >= 7.5 && mediaFinal <= 8.9){
            conceito = "B";
            situacao = "APROVADO";
        }else if (mediaFinal >= 6 && mediaFinal <= 7.4){
            conceito = "C";
            situacao = "APROVADO";
        }else if (mediaFinal >= 4 && mediaFinal <= 5.9){
            conceito = "D";
            situacao = "REPROVADO";
        }else if (mediaFinal >= 0 && mediaFinal <= 3.9){
            conceito = "E";
            situacao = "REPROVADO";
        }
        out.println("Nota 1ºBimestre: " + nota1);
        out.println("Nota 2ºBimestre: " + nota2);
        out.println("Nota 3ºBimestre: " + nota3);
        out.println("Nota 4ºBimestre: " + nota4);
        out.println("Média Final: " + mediaFinal);
        out.println("Conceito: " + conceito);
        out.println("Situação: " + situacao);
    }
}
