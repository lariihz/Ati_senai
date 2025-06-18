package Numero4;

public final class PagamentoCartao extends Pagamento {

    @Override
    public void realizarPagamento() {

        System.out.println("Pagamento com cartão aprovado!");
    }
}
