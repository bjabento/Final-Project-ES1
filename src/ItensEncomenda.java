import java.util.ArrayList;
import java.util.HashMap;

public class ItensEncomenda {
    int id;
    HashMap<Livro, Integer> itens;

    public ItensEncomenda(int id, HashMap<Livro, Integer> itens) {
        this.id = id;
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Livro, Integer> getItens() {
        return itens;
    }

    public void setItens(HashMap<Livro, Integer> itens) {
        this.itens = itens;
    }
}
