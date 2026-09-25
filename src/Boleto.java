import java.time.LocalDate;

public class Boleto extends FormaDePagamento {
    private LocalDate dataVencimento;

    public LocalDate getDataVencimento(){
        return dataVencimento = getDataCriacao().plusDays(10);
    }

    @Override
    public void processarPagamento() {
        IO.println("-----------Pagamento-----------"+"\n\nseu boleto foi realizado com sucesso\n"+
                "o código da operação é: " +
                getCodigo() + "\nData de pagamento "+
                getDataCriacao() + "\nData de vencimento: "+
                getDataVencimento()
        );
    }
}
