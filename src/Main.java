void main() {
    FormaDePagamento pix = new PagamentoPix();
    FormaDePagamento boleto = new Boleto();

    pix.processarPagamento();
    pix.processarPagamento();

    boleto.processarPagamento();
    boleto.processarPagamento();
}