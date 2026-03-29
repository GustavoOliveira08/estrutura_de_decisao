import java.util.Scanner;
public class residencia_social {
    public static void main(String[] args) {
        Scanner entrada= new  Scanner (System.in);

        System.out.print("O quanto você consome de água: ");
        float consumo = entrada.nextFloat();

        if (consumo <= 10){
            System.out.println("O valor da sua conta é: " + consumo * 7.59);
        }  else if (consumo <= 20) {
            System.out.println("O valor da sua conta é: " + consumo * 1.31);
        }else if (consumo <= 30) {
            System.out.println("O valor da sua conta é: " + consumo * 4.64);
        }else if (consumo <= 50) {
            System.out.println("O valor da sua conta é: " + consumo * 6.62);
        } else {
            System.out.println("O valor da sua conta é: " + consumo * 7.31);
        }
    }
}
