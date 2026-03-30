import java.util.Scanner;
void main() {
    Scanner entrada = new Scanner(System.in);
    IO.print("Informe o seu salário: R$");
    double salario = entrada.nextDouble();
    double ValorAumento = 0;
    String aumento = "";

    if (salario < 1000){
        ValorAumento = salario * 0.2;
        aumento = "20%";
    }else if (salario > 1000 && salario <= 1700) {
        ValorAumento = salario * 0.15;
        aumento = "15%";
    }else if (salario > 1700 && salario <= 2300 ) {
        ValorAumento = salario * 0.1;
        aumento = "10%";
    }else if (salario >2300 ) {
        ValorAumento = salario * 0.05;
        aumento = "5%";
    }
    double salarioNovo = salario + ValorAumento;
    IO.println("Salário antigo: R$" + salario);
    IO.println("Aumento: " + aumento);
    IO.println("Valor do aumento: R$" + ValorAumento);
    IO.println("Salário Novo: R$" + salarioNovo);
}
