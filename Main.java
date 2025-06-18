package Numero4;

public class Main {
    public static void main(String[] args) {

        Pagamento[] pagamentos = {new PagamentoCartao(), new PagamentoDinheiro()};

        for (Pagamento pagamento : pagamentos) {

            pagamento.realizarPagamento();
        }
    }
}
