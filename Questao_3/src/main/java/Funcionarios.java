public class Funcionarios extends Empresa {

        String nome;
        double salarioBase;

        public Funcionarios(String nome, double salarioBase) {
            this.nome = nome;
            this.salarioBase = salarioBase;
        }

        public double calcularSalario() {
            return salarioBase;
        }

}
