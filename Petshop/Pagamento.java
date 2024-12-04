public class Pagamento {

    public static void pagar(String pagamento) throws OpcaoInvalidaPagamentoException {
        if (!pagamento.equalsIgnoreCase("credito") &&
                !pagamento.equalsIgnoreCase("pix") &&
                !pagamento.equalsIgnoreCase("dinheiro") &&
                !pagamento.equalsIgnoreCase("debito")) {
            throw new OpcaoInvalidaPagamentoException("Opção inválida!");

        }
    }

}
