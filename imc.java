import java.util.Scanner;

public class imc {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        float peso = entrada.nextInt();
        System.out.print("Digite sua altura: ");
        float altura = entrada.nextFloat();
        float imc = peso/(altura * altura);
        String situacao = "";

        if (imc < 16 ){
            situacao = "Magreza grave";
        } else if (imc > 16 && imc < 17 ){
            situacao = "Magreza moderada";
        }else if (imc > 17 && imc < 18.5 ){
            situacao = "Magreza leve";
        } else if (imc > 18.5 && imc < 25 ) {
            situacao = "Saudável";
        }else if (imc > 25 && imc <30 ){
            situacao = "Sobrepeso";
        }else if (imc > 30 && imc < 35 ) {
            situacao = "Obesidade Grau I";
        }else if (imc > 35 && imc < 40 ) {
            situacao = "Obesidade Grau II (severa)";
        }else if (imc > 40){
            situacao = "Obesidade Grau III (mórbida)";
        }else{
            situacao = "Obesidade Grau III (mórbida)";
        }
        System.out.printf("IMC: %.2f Sua situação é %s\n", imc, situacao);
    }
}
