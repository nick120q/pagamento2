public class PagamentoPix extends FormaDePagamento {
    @Override
    public void processarPagamento() {
        IO.println("-----------Pagamento-----------"+"\n\nseu pix foi realizado com sucesso\n"+
                "o código da operação é: " +
                getCodigo() + "\nData de pagamento"+
                getDataCriacao());
    }
}
