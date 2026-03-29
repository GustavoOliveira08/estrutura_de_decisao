import java.util.Scanner;
public class residencia_normal {
    public static void main(String[] args) {
        Scanner entrada= new  Scanner (System.in);

        System.out.print("O quanto você consome de água: ");
        float consumo = entrada.nextFloat();
        float valor =0;

        if (consumo <= 10){
            valor = consumo * 22.38f;
        }  else if (consumo <= 20) {
            valor = consumo * 3.50f;
        }else if (consumo <= 50) {
            valor = consumo * 8.75f;
        } else{
            valor = consumo * 9.64f;
        }
        System.out.print("Valor da conta: " + valor);
    }
}
