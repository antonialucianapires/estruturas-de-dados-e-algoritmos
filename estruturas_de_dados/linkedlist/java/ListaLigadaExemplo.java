public class ListaLigadaExemplo {
    public static void main(String[] args) {
        ListaLigada<String> lista = new ListaLigada<>();
        printStatus(lista, "tamanho inicial: ");

        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");

        printStatus(lista, "tamanho após adicionar: ");
        printElemento(lista, 0, "primeiro item");
        printElemento(lista, lista.getTamanho() - 1, "último item");

        lista.remover("AC");

        printListaCompleta(lista);
        printStatus(lista, "tamanho final: ");
    }

    private static void printStatus(ListaLigada<String> lista, String mensagem) {
        System.out.println("ListaLigadaSimples: " + mensagem + ": " + lista.getTamanho());
    }

    private static void printElemento(ListaLigada<String> lista, int posicao, String mensagem) {
        System.out.println("ListaLigadaSimples: " + mensagem + ": " + lista.get(posicao).getValor());
    }

    private static void printListaCompleta(ListaLigada<String> lista) {
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println("ListaLigadaSimples: item posição " + i + ": " + lista.get(i).getValor());
        }
    }
}

class Elemento<T> {
    private T valor;
    private Elemento<T> proximo;

    public Elemento(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public Elemento<T> getProximo() {
        return proximo;
    }

    public void setProximo(Elemento<T> proximo) {
        this.proximo = proximo;
    }
}

class ListaLigada<T> {
    private Elemento<T> primeiro;
    private Elemento<T> ultimo;
    private int tamanho;

    // Inserção: O(1) para adicionar no final da lista
    public void adicionar(T valor) {
        Elemento<T> novoElemento = new Elemento<>(valor);
        if (primeiro == null) {
            primeiro = novoElemento;
            ultimo = novoElemento;
        } else {
            ultimo.setProximo(novoElemento);
            ultimo = novoElemento;
        }
        tamanho++;
    }

    // Inserção: O(1) para adicionar no início da lista
    public void adicionarNoInicio(T valor) {
        Elemento<T> novoElemento = new Elemento<>(valor);
        if (primeiro == null) {
            primeiro = novoElemento;
            ultimo = novoElemento;
        } else {
            novoElemento.setProximo(primeiro);
            primeiro = novoElemento;
        }
        tamanho++;
    }

    // Inserção: O(n) para adicionar no meio da lista
    public void adicionarNoMeio(T valor) {
        Elemento<T> novoElemento = new Elemento<>(valor);
        if (primeiro == null) {
            primeiro = novoElemento;
            ultimo = novoElemento;
        } else {
            Elemento<T> atual = primeiro;
            for (int i = 0; i < tamanho / 2 - 1; i++) {
                atual = atual.getProximo();
            }
            novoElemento.setProximo(atual.getProximo());
            atual.setProximo(novoElemento);
        }
        tamanho++;
    }

    // Remoção: O(n) devido à necessidade de buscar o elemento e ajustar as referências
    public void remover(T valorProcurado) {
        Elemento<T> atual = primeiro;
        Elemento<T> anterior = null;

        // Busca pelo elemento: O(n)
        while (atual != null && !atual.getValor().equals(valorProcurado)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual != null) {
            // Ajuste das referências: O(1)
            if (anterior == null) {
                primeiro = atual.getProximo();
            } else {
                anterior.setProximo(atual.getProximo());
            }
            if (atual == ultimo) {
                ultimo = anterior;
            }
            tamanho--;
        }
    }

    // Busca: O(n) para acessar o elemento na posição especificada
    public Elemento<T> get(int posicao) {
        Elemento<T> atual = primeiro;
        for (int i = 0; i < posicao && atual != null; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public int getTamanho() {
        return tamanho;
    }

    public IteratorListaLigada<T> getIterator() {
        return new IteratorListaLigada<>(this.primeiro);
    }
}

class IteratorListaLigada <T>{
    private Elemento<T> elemento;

    public IteratorListaLigada(Elemento<T> elemento) {
        this.elemento = elemento;
    }

    public boolean temProximo() {
        if(elemento.getProximo() != null) {
            return true;
        }
        return false;
    }

    public Elemento<T> getElemento() {
        return elemento;
    }
}
