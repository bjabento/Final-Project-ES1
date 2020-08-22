import java.util.List;
import java.util.Map;

public class Cliente {
    int id;
    String username, password, nome, email;

    public Cliente(int id, String username, String password, String nome, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void darFeedback(Feedback feedback, List<Integer> listaRespostas){
        int i = 0;
        for (Map.Entry me : feedback.getQuestionario().entrySet()) {
            feedback.getQuestionario().replace((String) me.getKey(), listaRespostas.get(i));
            i += 1;
        }

        System.out.println("---------------------------------------------------------------------------------\n\t\tFeedback dado pelo Cliente " +feedback.getEncomenda().getCliente().getNome() +
                " acerca da Encomenda " + feedback.getEncomenda().getId() + ":");

        for (Map.Entry me : feedback.getQuestionario().entrySet()) {
            System.out.println("" + me.getKey() + " - " + me.getValue());
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

    public void realizarPagamento(Pagamento pagamento){
        pagamento.setPagamentoEfetuado(true);
        System.out.println("---------------------------------------------------------------------------------\n\t\tPagamento da Encomenda " + pagamento.getEncomenda().getId() + " efetuado com sucesso!"
                + "\n---------------------------------------------------------------------------------");

    }
}
