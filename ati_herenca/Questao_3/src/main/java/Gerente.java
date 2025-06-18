public class Gerente extends Funcionarios {
    double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }


    public double calcularSalario() {
        return SalarioBase + bonus;
    }
}
