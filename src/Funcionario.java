import java.util.HashMap;
import java.util.Map;

public class Funcionario {
    int id;
    String username, password, nome;

    public Funcionario(int id, String username, String password, String nome) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Encomenda dividirEncomenda(Encomenda encomenda, HashMap<Livro, Integer> itensAtrasados, int idItensAtrasados, int idEncomendaItensAtrasados, EstadoEncomenda encomenda_dividida){

        HashMap<Livro, Integer> itensDisponiveis = new HashMap<>();
        boolean verificacao = false;

        for (Map.Entry x : encomenda.getItensEncomenda().getItens().entrySet()) {

            for (Map.Entry y : itensAtrasados.entrySet()) {

                if (x.getKey() == y.getKey() && x.getValue() == y.getValue()){
                    verificacao = true;
                }
            }

            if (verificacao == false){
                Livro livro = (Livro) x.getKey();
                Integer integer = (Integer) x.getValue();
                itensDisponiveis.put(livro, integer);
            }
            else {
                verificacao = false;
            }
        }

        encomenda.setItensEncomenda(new ItensEncomenda(encomenda.getItensEncomenda().getId(), itensDisponiveis));
        encomenda.setEstadoEncomenda(encomenda_dividida);

        Encomenda encomendaItensAtrasados = new Encomenda(idEncomendaItensAtrasados, encomenda.getCliente(),encomenda.getFuncionario(), encomenda.getData(), encomenda.getMoradaEntrega(), encomenda_dividida, new ItensEncomenda(idItensAtrasados, itensAtrasados), encomenda.getVoucher());

        System.out.println("---------------------------------------------------------------------------------\n\t\tEncomenda Dividida!\n\tEncomenda: " + encomenda.getId() + "\nCliente: " + encomenda.getCliente().getNome() + "\nFuncionário: " + encomenda.getFuncionario().getNome() +
                "\nData: " + encomenda.getData() + "\nMorada de Entrega: " + encomenda.getMoradaEntrega() + "\nEstado Encomenda: " + encomenda.getEstadoEncomenda().getDescricao() +
                "\nItens Encomenda:" + getItens(encomenda) + "\nVoucher: " + encomenda.getVoucher().getDesconto() + "%");
        System.out.println("\n\tEncomenda: " + encomendaItensAtrasados.getId() + "\nCliente: " + encomendaItensAtrasados.getCliente().getNome() + "\nFuncionário: " + encomendaItensAtrasados.getFuncionario().getNome() +
                "\nData: " + encomendaItensAtrasados.getData() + "\nMorada de Entrega: " + encomendaItensAtrasados.getMoradaEntrega() + "\nEstado Encomenda: " + encomendaItensAtrasados.getEstadoEncomenda().getDescricao() +
                "\nItens Encomenda:" + getItens(encomendaItensAtrasados) + "\nVoucher: " + encomendaItensAtrasados.getVoucher().getDesconto() + "%\n---------------------------------------------------------------------------------");

        return encomendaItensAtrasados;
    }

    public String getItens(Encomenda encomenda){
        String itens = "";
        for (Map.Entry me : encomenda.getItensEncomenda().getItens().entrySet()) {
            Livro livro = (Livro) me.getKey();
            itens += "\n\tLivro: "+livro.getTitulo() + " - Quantidade: " + me.getValue();
        }
        return itens;
    }

    public NotificacaoConfirmacao confirmarPagamento(int idNotificacao, Pagamento pagamento, EstadoEncomenda estadoEncomenda, String data){
        pagamento.getEncomenda().setEstadoEncomenda(estadoEncomenda);

        NotificacaoConfirmacao notificacao = new NotificacaoConfirmacao(idNotificacao, pagamento.getEncomenda(), data, "www.ablazon.com/tracking"+"/"+pagamento.getEncomenda().getId());
        notificacao.enviarEmail();

        return notificacao;
    }

    public NotificacaoNormal alterarEstadoEncomenda(int idNotificacao, Encomenda encomenda, EstadoEncomenda proximoEstado){
        encomenda.setEstadoEncomenda(proximoEstado);

        NotificacaoNormal notificacao = new NotificacaoNormal(idNotificacao, encomenda);
        notificacao.enviarEmail();

        return notificacao;
    }
}
