public class NotificacaoEntrega implements Notificacao {
    int id;
    Encomenda encomenda;
    String descricao;
    String linkFeedback;

    public NotificacaoEntrega(int id, Encomenda encomenda, String linkFeedback) {
        this.id = id;
        this.encomenda = encomenda;
        this.linkFeedback = linkFeedback;
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

    public String getLinkFeedback() {
        return linkFeedback;
    }

    public void setLinkFeedback(String linkFeedback) {
        this.linkFeedback = linkFeedback;
    }

    public void enviarEmail(){
        descricao = "---------------------------------------------------------------------------------\n";
        descricao += "\t\tDestinatário: " + encomenda.getCliente().getEmail() +"\nO estado da sua Encomenda " + encomenda.getId() + " foi alterado para: Entregue\nDeixe-nos o seu Feedback acerca do serviço em: " + linkFeedback;
        descricao += "\n---------------------------------------------------------------------------------";
        System.out.println(descricao);
    }
}
