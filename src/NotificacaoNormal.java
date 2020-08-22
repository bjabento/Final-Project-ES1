public class NotificacaoNormal implements Notificacao {
    int id;
    Encomenda encomenda;
    String descricao;

    public NotificacaoNormal(int id, Encomenda encomenda) {
        this.id = id;
        this.encomenda = encomenda;
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

    public void enviarEmail(){
        descricao = "---------------------------------------------------------------------------------";
        descricao = "\t\tDestinatário: " + encomenda.getCliente().getEmail() +"\nO estado da sua Encomenda " + encomenda.getId() + " foi alterado para: " + encomenda.getEstadoEncomenda().getDescricao();
        descricao += "\n---------------------------------------------------------------------------------";
        System.out.println(descricao);
    }

}
