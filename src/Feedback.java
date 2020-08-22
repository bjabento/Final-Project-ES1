import java.util.HashMap;
import java.util.Map;

public class Feedback {
    int id;
    Encomenda encomenda;
    HashMap<String, Integer> questionario = new HashMap<>();

    public Feedback(int id, Encomenda encomenda) {
        this.id = id;
        this.encomenda = encomenda;
        questionario.put("Avaliação Geral", 0);
        questionario.put("Rapidez", 0);
        questionario.put("Estado da Encomenda", 0);
        questionario.put("Comunicação", 0);
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

    public HashMap<String, Integer> getQuestionario() {
        return questionario;
    }

    public void setQuestionario(HashMap<String, Integer> questionario) {
        this.questionario = questionario;
    }
}
