public class NovoSal {
    double salario;


    public void novoSalario(double salario) {
    double novoSal = 0;
    if(salario <= 1000) {
        novoSal = (salario * 0.30);
    }
    else if(salario <= 2000) {
        novoSal = (salario * 0.25);
    }
    else if(salario <= 3000) {
        novoSal = (salario * 0.20);
    }
    else if(salario <= 4000) {
        novoSal = (salario * 0.15);
    }
    else{
        novoSal = (salario * 0.10);
    }
        salario+= novoSal;
        System.out.println("Novo Salario: " + salario);
    }
}
