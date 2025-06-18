public class Desenvolvedor extends Funcionarios {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }


    public double calcularSalario() {
        return SalarioBase * 1.10;
    }
}


