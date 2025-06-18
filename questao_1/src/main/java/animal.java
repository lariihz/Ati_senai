public class animal {
    String nome;

    public animal (String nome) {
        this.nome = nome;
    }
    public void fazerSom() {
        System.out.println("Som genérico de animal");
    }
    public String getNome () {
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
}



