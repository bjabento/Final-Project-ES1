import java.time.LocalDate;

public class Entrega {
    int id;
    Transportadora transportadora;
    LocalDate data;
    Encomenda encomenda;

    public Entrega(int id, Transportadora transportadora, LocalDate data, Encomenda encomenda) {
        this.id = id;
        this.transportadora = transportadora;
        this.data = data;
        this.encomenda = encomenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }
}
