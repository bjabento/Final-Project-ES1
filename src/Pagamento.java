public class Pagamento {
    int id, entidade, referencia;
    double  valor;
    boolean pagamentoEfetuado = false;
    Encomenda encomenda;

    public Pagamento(int id, int entidade, int referencia, double valor, boolean pagamentoEfetuado, Encomenda encomenda) {
        this.id = id;
        this.entidade = entidade;
        this.referencia = referencia;
        this.valor = valor;
        this.pagamentoEfetuado = pagamentoEfetuado;
        this.encomenda = encomenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEntidade() {
        return entidade;
    }

    public void setEntidade(int entidade) {
        this.entidade = entidade;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPagamentoEfetuado() {
        return pagamentoEfetuado;
    }

    public void setPagamentoEfetuado(boolean pagamentoEfetuado) {
        this.pagamentoEfetuado = pagamentoEfetuado;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }
}
