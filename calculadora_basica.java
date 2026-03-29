import java.util.Scanner;
import static java.lang.System.out;
public class calculadora_basica {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        out.println("Escolha dois número para realizar o calculo");
        out.print("Qual é o primeiro número: ");
        double numberOne = entrada.nextDouble();
        out.print("Qual é o Segundo número: ");
        double numbertwo = entrada.nextDouble();
        out.println("Escolha um número para a operação que deseja:");
        out.print("\n Adição (1) \n Subtração (2) \n Multiplicação (3) \n Divisão (4)");
        out.println("\n Potência (5)\n Raiz Quadrada (6)\n Número impar(7)\n Número par (8)");
        out.print("Digite a sua escolha: ");
        int operacao = entrada.nextInt();
        double calculo = 0;
        double calculo2 = 0;

        if (operacao == 1){
            calculo = numberOne + numbertwo;
        } else if (operacao == 2){
            calculo = numberOne - numbertwo;
        } else if (operacao == 3){
            calculo = (numberOne * numbertwo);
        } else if (operacao == 4){
            calculo = (numberOne / numbertwo);
        } else if (operacao == 5){
            calculo = Math.pow(numberOne,numbertwo);
        } else if (operacao == 6){
            calculo = Math.sqrt(numberOne);
            calculo2 = Math.sqrt(numbertwo);
        } if (operacao == 8 && calculo%2 == 0){
            out.println("é par");
        } else{
            out.println("é impar");
        }
        out.print("Resultado: " + calculo + calculo2);
    }
}
