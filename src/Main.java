import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Voucher voucher = new Voucher(11, 30);

        Cliente cliente1 = new Cliente(1,"Maria","123", "Maria", "maria@mail.com");

        Livro livro1 = new Livro(11,"O Senhor dos Anéis I","J. R. R. Tolkien", new BigInteger("9789721041028"), 21.55);
        Livro livro2 = new Livro(12,"On the Road","Jack Kerouac", new BigInteger("9780140283297"), 12.30);
        Livro livro3 = new Livro(13,"Hamlet","William Shakespeare", new BigInteger("9789721043411"), 14.50);
        Livro livro4 = new Livro(14,"Os Lusíadas","Luís de Camões", new BigInteger("9720301600"), 6.60);
        Livro livro5 = new Livro(15,"O Grande Gatsby","F. Scott Fitzgerald", new BigInteger("8563560298"), 12.90);

        EstadoEncomenda encomenda_submetida = new EstadoEncomenda(3,"Encomenda Submetida");
        EstadoEncomenda pagamendo_recebido = new EstadoEncomenda(4,"Pagamento Recebido - Confirmação da Receção da Encomenda");
        EstadoEncomenda embalado = new EstadoEncomenda(5,"Embalado");
        EstadoEncomenda encomenda_dividida = new EstadoEncomenda(6,"Encomenda Dividida");
        EstadoEncomenda enviado = new EstadoEncomenda(7,"Enviado");
        EstadoEncomenda entregue = new EstadoEncomenda(8,"Entregue");

        Funcionario funcionario1 = new Funcionario(9, "Manuel", "123", "Manuel");

        HashMap<Livro, Integer> itens = new HashMap<>();
        itens.put(livro1, 2);
        itens.put(livro3, 1);
        itens.put(livro5, 5);
        ItensEncomenda itensencomenda1 = new ItensEncomenda(16, itens);

        Encomenda encomenda1 = new Encomenda(10, cliente1, funcionario1, LocalDate.now(), "Rua da Flores, nº12", encomenda_submetida, itensencomenda1, voucher);

        Pagamento pagamento1 = encomenda1.gerarDadosPagamento(23, encomenda1);

        cliente1.realizarPagamento(pagamento1);

        NotificacaoConfirmacao notificacao1 = funcionario1.confirmarPagamento(24, pagamento1, pagamendo_recebido, "10-10-2020");

        HashMap<Livro, Integer> itensAtrasados = new HashMap<>();
        itensAtrasados.put(livro3, 1);
        itensAtrasados.put(livro5, 5);

        Encomenda encomenda1Dividida = funcionario1.dividirEncomenda(encomenda1, itensAtrasados, 18, 19, encomenda_dividida);

        NotificacaoNormal notificacao2 = funcionario1.alterarEstadoEncomenda(25, encomenda1, encomenda_dividida);
        NotificacaoNormal notificacao3 = funcionario1.alterarEstadoEncomenda(26, encomenda1Dividida, encomenda_dividida);
        NotificacaoNormal notificacao4 = funcionario1.alterarEstadoEncomenda(27, encomenda1, embalado);
        NotificacaoNormal notificacao5 = funcionario1.alterarEstadoEncomenda(28, encomenda1, enviado);

        Transportadora transportadora1 = new Transportadora(20, "Transporter", "transporter@mail.com");

        List<Object> list;

        list = transportadora1.confirmarEntrega(29, 30, transportadora1, LocalDate.now(), encomenda1, entregue);
        NotificacaoEntrega notificacao6 = (NotificacaoEntrega) list.get(0);
        Entrega entrega1 = (Entrega) list.get(1);

        Feedback feedback1 = new Feedback(22, encomenda1Dividida);

        List<Integer> listaRespostas = new ArrayList<>();
        listaRespostas.add(4);
        listaRespostas.add(3);
        listaRespostas.add(5);
        listaRespostas.add(4);

        cliente1.darFeedback(feedback1, listaRespostas);

        //Repositório
        Repositorio repo = new RepositorioMem();

        repo.save(cliente1);
        repo.save(livro4);

        Cliente cliente = (Cliente) repo.get(1);
        Livro livro = (Livro) repo.get(14);

        System.out.println("\n----------TESTES REPOSITÓRIO-----------\n");
        System.out.println("Livro de id = 14: " + livro.getTitulo());
        System.out.println("Cliente de id = 1: " + cliente.getNome());
    }
}
