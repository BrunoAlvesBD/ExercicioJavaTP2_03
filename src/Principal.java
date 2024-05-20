import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o salario atual: ");
        double salario = entrada.nextDouble();

        NovoSal empregado = new NovoSal();
        empregado.novoSalario(salario);

    }
}
