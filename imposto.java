import java.util.Scanner;
import static java.lang.System.out;
public class imposto {
    public static void main(String[] args ){
        Scanner entrada = new Scanner(System.in);

        out.print("Qual é o seu salário: ");
        double salario = entrada.nextDouble();
        double inss = 0;

        if(salario < 1621){
            inss = salario * (7.5/100);
        }else if(salario >= 1621 && salario <= 2902.84){
            inss = salario * (9/100);
        } else if(salario >= 2902.85 && salario <= 4354.27){
            inss = salario * (12/100);
        }else if(salario >= 4354.28 && salario <= 8475.55){
            inss = salario * (14/100);
        }else if(salario >8475.55){
            inss = salario * (14/100);
        }
        double calculo = salario - inss;
        double irrf = 0;

        if(calculo < 1903.98){
            irrf = 0;
        }else if(calculo >= 1903.99 && calculo <= 2826.65){
            irrf = calculo * (7.5/100);
        } else if(calculo >= 2826.66 && calculo <= 3751.05){
            irrf = calculo * (15/100);
        }else if(calculo >= 3751.06 && calculo <= 4664.68){
            irrf = calculo * (22.5/100);
        }else if(salario > 4664.69) {
            irrf = salario * (27.5 / 100);
        }
        out.print("Valor do Imposto: "+ irrf);
    }
}
