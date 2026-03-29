import java.util.Scanner;

public class residencia_industrial {
    public static void main(String[] args) {
        Scanner entrada= new  Scanner (System.in);

        System.out.println("Preencha os dados dcom base no seu hidrômetro");
        System.out.print("Qual é o valor atual do consumo d'água: ");
        int leituraAtual = entrada.nextInt();
        System.out.print("Qual é o valor anterior do consumo d'água: ");
        int leituraAntiga = entrada.nextInt();
        float consumo = leituraAtual - leituraAntiga;
        float valor =0;

        if (consumo <= 10){
            valor = consumo * 44.95f;
        }else if (consumo <= 20){
            valor = consumo * 8.75f;
        } else if (consumo <= 50){
            valor = consumo * 16.76f;
        }else {
            valor = consumo * 17.46f;
        }
        System.out.println("O valor da sua conta: " + valor);
    }
}
