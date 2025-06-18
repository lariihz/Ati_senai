

public class Main  {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios("João", 3000.00);
        Gerente gerente = new Gerente("Maria", 5000.00, 2000.00);
        Desenvolvedor Desenvolvedor = new Desenvolvedor("Carlos", 4000.00);

        System.out.println("Salário do Funcionario: R$ " + funcionarios.calcularSalario());
        System.out.println("Salário do Gerente: R$ " + gerente.calcularSalario());
        System.out.println("Salário do Desenvolvedor: R$ " + Desenvolvedor.calcularSalario());
    }
}