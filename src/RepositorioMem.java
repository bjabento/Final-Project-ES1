import java.util.ArrayList;

public class RepositorioMem extends Repositorio {

    ArrayList<Object> list = new ArrayList<>();

    public RepositorioMem() {
    }

    @Override
    public void save(Object objeto) {

        int id = 0;

        if (objeto.getClass() == Cliente.class) {
            Cliente cliente = (Cliente) objeto;
            id = cliente.getId();
        }
        else if (objeto.getClass() == Encomenda.class) {
            Encomenda encomenda = (Encomenda) objeto;
            id = encomenda.getId();
        }
        else if (objeto.getClass() == Entrega.class) {
            Entrega entrega = (Entrega) objeto;
            id = entrega.getId();
        }
        else if (objeto.getClass() == EstadoEncomenda.class) {
            EstadoEncomenda estadoEncomenda = (EstadoEncomenda) objeto;
            id = estadoEncomenda.getId();
        }
        else if (objeto.getClass() == Feedback.class) {
            Feedback feedback = (Feedback) objeto;
            id = feedback.getId();
        }
        else if (objeto.getClass() == Funcionario.class) {
            Funcionario funcionario = (Funcionario) objeto;
            id = funcionario.getId();
        }
        else if (objeto.getClass() == ItensEncomenda.class) {
            ItensEncomenda itensEncomenda = (ItensEncomenda) objeto;
            id = itensEncomenda.getId();
        }
        else if (objeto.getClass() == Livro.class) {
            Livro livro = (Livro) objeto;
            id = livro.getId();
        }
        else if (objeto.getClass() == NotificacaoNormal.class) {
            NotificacaoNormal notificacao = (NotificacaoNormal) objeto;
            id = notificacao.getId();
        }
        else if (objeto.getClass() == NotificacaoConfirmacao.class) {
            NotificacaoConfirmacao notificacaoConfirmacao = (NotificacaoConfirmacao) objeto;
            id = notificacaoConfirmacao.getId();
        }
        else if (objeto.getClass() == NotificacaoEntrega.class) {
            NotificacaoEntrega notificacaoEntrega = (NotificacaoEntrega) objeto;
            id = notificacaoEntrega.getId();
        }
        else if (objeto.getClass() == Pagamento.class) {
            Pagamento pagamento = (Pagamento) objeto;
            id = pagamento.getId();
        }
        else if (objeto.getClass() == Transportadora.class) {
            Transportadora transportadora = (Transportadora) objeto;
            id = transportadora.getId();
        }
        else if (objeto.getClass() == Voucher.class) {
            Voucher voucher = (Voucher) objeto;
            id = voucher.getId();
        }

        for (Object obj : list) {
            if (obj.getClass() == Cliente.class) {
                Cliente cliente = (Cliente) obj;
                if (cliente.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == Encomenda.class) {
                Encomenda encomenda = (Encomenda) obj;
                if (encomenda.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == Entrega.class) {
                Entrega entrega = (Entrega) obj;
                if (entrega.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == EstadoEncomenda.class) {
                EstadoEncomenda estadoEncomenda = (EstadoEncomenda) obj;
                if (estadoEncomenda.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == Feedback.class) {
                Feedback feedback = (Feedback) obj;
                if (feedback.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == Funcionario.class) {
                Funcionario funcionario = (Funcionario) obj;
                if (funcionario.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == ItensEncomenda.class) {
                ItensEncomenda itensEncomenda = (ItensEncomenda) obj;
                if (itensEncomenda.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == Livro.class) {
                Livro livro = (Livro) obj;
                if (livro.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == NotificacaoNormal.class) {
                NotificacaoNormal notificacao = (NotificacaoNormal) obj;
                if (notificacao.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == NotificacaoConfirmacao.class) {
                NotificacaoConfirmacao notificacaoConfirmacao = (NotificacaoConfirmacao) obj;
                if (notificacaoConfirmacao.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == NotificacaoEntrega.class) {
                NotificacaoEntrega notificacaoEntrega = (NotificacaoEntrega) obj;
                if (notificacaoEntrega.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == Pagamento.class) {
                Pagamento pagamento = (Pagamento) obj;
                if (pagamento.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == Transportadora.class) {
                Transportadora transportadora = (Transportadora) obj;
                if (transportadora.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
            else if (obj.getClass() == Voucher.class) {
                Voucher voucher = (Voucher) obj;
                if (voucher.getId() == id) {
                    System.out.println("ERRO: O ID " + id + " já está a ser utilizado por outro objeto!");
                    return;
                }
            }
        }

        list.add(objeto);
    }

    @Override
    public Object get(int id) {

        for (Object obj : list) {
            if (obj.getClass() == Cliente.class) {
                Cliente cliente = (Cliente) obj;
                if (cliente.getId() == id) {
                    return cliente;
                }
            }
            else if (obj.getClass() == Encomenda.class) {
                Encomenda encomenda = (Encomenda) obj;
                if (encomenda.getId() == id) {
                    return encomenda;
                }
            }
            else if (obj.getClass() == Entrega.class) {
                Entrega entrega = (Entrega) obj;
                if (entrega.getId() == id) {
                    return entrega;
                }
            }
            else if (obj.getClass() == EstadoEncomenda.class) {
                EstadoEncomenda estadoEncomenda = (EstadoEncomenda) obj;
                if (estadoEncomenda.getId() == id) {
                    return estadoEncomenda;
                }
            }
            else if (obj.getClass() == Feedback.class) {
                Feedback feedback = (Feedback) obj;
                if (feedback.getId() == id) {
                    return feedback;
                }
            }
            else if (obj.getClass() == Funcionario.class) {
                Funcionario funcionario = (Funcionario) obj;
                if (funcionario.getId() == id) {
                    return funcionario;
                }
            }
            else if (obj.getClass() == ItensEncomenda.class) {
                ItensEncomenda itensEncomenda = (ItensEncomenda) obj;
                if (itensEncomenda.getId() == id) {
                    return itensEncomenda;
                }
            }
            else if (obj.getClass() == Livro.class) {
                Livro livro = (Livro) obj;
                if (livro.getId() == id) {
                    return livro;
                }
            }
            else if (obj.getClass() == NotificacaoNormal.class) {
                NotificacaoNormal notificacao = (NotificacaoNormal) obj;
                if (notificacao.getId() == id) {
                    return notificacao;
                }
            }
            else if (obj.getClass() == NotificacaoConfirmacao.class) {
                NotificacaoConfirmacao notificacaoConfirmacao = (NotificacaoConfirmacao) obj;
                if (notificacaoConfirmacao.getId() == id) {
                    return notificacaoConfirmacao;
                }
            }
            else if (obj.getClass() == NotificacaoEntrega.class) {
                NotificacaoEntrega notificacaoEntrega = (NotificacaoEntrega) obj;
                if (notificacaoEntrega.getId() == id) {
                    return notificacaoEntrega;
                }
            }
            else if (obj.getClass() == Pagamento.class) {
                Pagamento pagamento = (Pagamento) obj;
                if (pagamento.getId() == id) {
                    return pagamento;
                }
            }
            else if (obj.getClass() == Transportadora.class) {
                Transportadora transportadora = (Transportadora) obj;
                if (transportadora.getId() == id) {
                    return transportadora;
                }
            }
            else if (obj.getClass() == Voucher.class) {
                Voucher voucher = (Voucher) obj;
                if (voucher.getId() == id) {
                    return voucher;
                }
            }
        }

        System.out.println("ERRO: O objeto com ID " + id + " não foi encontrado!");
        return null;
    }
}


