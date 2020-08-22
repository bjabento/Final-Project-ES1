import java.time.LocalDate;
import java.util.Map;

public class Encomenda {
    int id;
    Cliente cliente;
    Funcionario funcionario;
    LocalDate data;
    String moradaEntrega;
    EstadoEncomenda estadoEncomenda;
    ItensEncomenda itensEncomenda;
    Voucher voucher;

    public Encomenda(int id, Cliente cliente, Funcionario funcionario, LocalDate data, String moradaEntrega, EstadoEncomenda estadoEncomenda, ItensEncomenda itensEncomenda) {
        this(id, cliente, funcionario, data, moradaEntrega, estadoEncomenda, itensEncomenda, null);
    }

    public Encomenda(int id, Cliente cliente, Funcionario funcionario, LocalDate data, String moradaEntrega, EstadoEncomenda estadoEncomenda, ItensEncomenda itensEncomenda, Voucher voucher) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data = data;
        this.moradaEntrega = moradaEntrega;
        this.estadoEncomenda = estadoEncomenda;
        this.itensEncomenda = itensEncomenda;
        this.voucher = voucher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getMoradaEntrega() {
        return moradaEntrega;
    }

    public void setMoradaEntrega(String moradaEntrega) {
        this.moradaEntrega = moradaEntrega;
    }

    public EstadoEncomenda getEstadoEncomenda() {
        return estadoEncomenda;
    }

    public void setEstadoEncomenda(EstadoEncomenda estadoEncomenda) {
        this.estadoEncomenda = estadoEncomenda;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public ItensEncomenda getItensEncomenda() {
        return itensEncomenda;
    }

    public void setItensEncomenda(ItensEncomenda itensEncomenda) {
        this.itensEncomenda = itensEncomenda;
    }

    public Pagamento gerarDadosPagamento(int idPagamento, Encomenda encomenda){

        int valor = 0;

        for (Map.Entry me : encomenda.getItensEncomenda().getItens().entrySet()) {
            Livro livro = (Livro) me.getKey();
            valor += (livro.getPreco() * (Integer) me.getValue());
        }

        Pagamento pagamento = new Pagamento(idPagamento, 11111, 123456789, valor, false, encomenda);

        System.out.println("---------------------------------------------------------------------------------\n\t\tDados de pagamento da Encomenda " + encomenda.getId() + ":\nEntidade: "
                + pagamento.getEntidade() + "\nReferência: " + pagamento.getReferencia() + "\nValor: " + pagamento.getValor() + " €" + "\n---------------------------------------------------------------------------------");

        return pagamento;
    }
}
