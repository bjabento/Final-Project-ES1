import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transportadora {
    int id;
    String nome;
    String email;

    public Transportadora(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Object> confirmarEntrega(int idEntrega, int idNotificacao, Transportadora transportadora, LocalDate data, Encomenda encomenda, EstadoEncomenda proximoEstado){
        encomenda.setEstadoEncomenda(proximoEstado);

        NotificacaoEntrega notificacao = new NotificacaoEntrega(idNotificacao, encomenda, "www.ablazon.com/feedback"+"/"+encomenda.getId());
        notificacao.enviarEmail();

        Entrega entrega = new Entrega(idEntrega, transportadora, data, encomenda);

        List<Object> list = new ArrayList<>();
        list.add(notificacao);
        list.add(entrega);

        return list;
    }
}
