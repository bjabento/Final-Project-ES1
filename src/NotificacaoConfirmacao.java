public class NotificacaoConfirmacao implements Notificacao {
    int id;
    Encomenda encomenda;
    String descricao;
    String dataPresvistaEntrega;
    String linkAcompanhamento;

    public NotificacaoConfirmacao(int id, Encomenda encomenda, String dataPresvistaEntrega, String linkAcompanhamento) {
        this.id = id;
        this.encomenda = encomenda;
        this.dataPresvistaEntrega = dataPresvistaEntrega;
        this.linkAcompanhamento = linkAcompanhamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataPresvistaEntrega() {
        return dataPresvistaEntrega;
    }

    public void setDataPresvistaEntrega(String dataPresvistaEntrega) {
        this.dataPresvistaEntrega = dataPresvistaEntrega;
    }

    public String getLinkAcompanhamento() {
        return linkAcompanhamento;
    }

    public void setLinkAcompanhamento(String linkAcompanhamento) {
        this.linkAcompanhamento = linkAcompanhamento;
    }

    public void enviarEmail(){
        descricao = "---------------------------------------------------------------------------------\n";
        descricao += "\t\tDestinatário: " + encomenda.getCliente().getEmail() +"\nO estado da sua Encomenda " + encomenda.getId() + " foi alterado para: " + encomenda.getEstadoEncomenda().getDescricao() + "\nData prevista de entrega: " + dataPresvistaEntrega + "\nLink de acompanhamento da encomenda: " + linkAcompanhamento;
        descricao += "\n---------------------------------------------------------------------------------";
        System.out.println(descricao);
    }
}
