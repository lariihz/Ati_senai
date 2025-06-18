public class Cachorro extends animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }

    public Cachorro(String nome) {
        super(nome);
    }


}


