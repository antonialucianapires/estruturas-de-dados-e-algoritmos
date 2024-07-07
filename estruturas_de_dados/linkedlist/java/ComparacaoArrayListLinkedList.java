import java.util.ArrayList;
import java.util.List;

public class ComparacaoArrayListLinkedList {

    private static final int NUM_ELEMENTS = 1000;

    public static void main(String[] args) {
        System.out.println("Comparação entre ArrayList e ListaLigada com " + NUM_ELEMENTS + " elementos.");

        // Comparando a adição de elementos no final
        long arrayListAddTime = adicionarElementos(new ArrayList<>());
        long linkedListAddTime = adicionarElementos(new ListaLigada<>());

        System.out.println("Tempo para adicionar " + NUM_ELEMENTS + " elementos no final:");
        System.out.println("ArrayList: " + arrayListAddTime + " ms");
        System.out.println("ListaLigada: " + linkedListAddTime + " ms");

        // Comparando a adição de elementos no início
        long arrayListAddInicioTime = adicionarElementosNoInicio(new ArrayList<>());
        long linkedListAddInicioTime = adicionarElementosNoInicio(new ListaLigada<>());

        System.out.println("Tempo para adicionar " + NUM_ELEMENTS + " elementos no início:");
        System.out.println("ArrayList: " + arrayListAddInicioTime + " ms");
        System.out.println("ListaLigada: " + linkedListAddInicioTime + " ms");

        // Comparando a adição de elementos no meio
        long arrayListAddMeioTime = adicionarElementosNoMeio(new ArrayList<>());
        long linkedListAddMeioTime = adicionarElementosNoMeio(new ListaLigada<>());

        System.out.println("Tempo para adicionar " + NUM_ELEMENTS + " elementos no meio:");
        System.out.println("ArrayList: " + arrayListAddMeioTime + " ms");
        System.out.println("ListaLigada: " + linkedListAddMeioTime + " ms");

        // Preparando listas para as operações de busca e remoção
        List<Integer> arrayList = new ArrayList<>();
        ListaLigada<Integer> linkedList = new ListaLigada<>();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            arrayList.add(i);
            linkedList.adicionar(i);
        }

        // Comparando a busca de elementos
        long arrayListSearchTime = buscarElementos(arrayList);
        long linkedListSearchTime = buscarElementos(linkedList);

        System.out.println("Tempo para buscar " + NUM_ELEMENTS + " elementos:");
        System.out.println("ArrayList: " + arrayListSearchTime + " ms");
        System.out.println("ListaLigada: " + linkedListSearchTime + " ms");

        // Comparando a remoção de elementos
        long arrayListRemoveTime = removerElementos(arrayList);
        long linkedListRemoveTime = removerElementos(linkedList);

        System.out.println("Tempo para remover " + NUM_ELEMENTS + " elementos:");
        System.out.println("ArrayList: " + arrayListRemoveTime + " ms");
        System.out.println("ListaLigada: " + linkedListRemoveTime + " ms");
    }

    private static long adicionarElementos(List<Integer> lista) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            lista.add(i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    private static long adicionarElementos(ListaLigada<Integer> lista) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            lista.adicionar(i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    private static long adicionarElementosNoInicio(List<Integer> lista) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            lista.add(0, i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    private static long adicionarElementosNoInicio(ListaLigada<Integer> lista) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            lista.adicionarNoInicio(i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    private static long adicionarElementosNoMeio(List<Integer> lista) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            lista.add(lista.size() / 2, i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    private static long adicionarElementosNoMeio(ListaLigada<Integer> lista) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            lista.adicionarNoMeio(i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    private static long buscarElementos(List<Integer> lista) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            lista.get(i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    private static long buscarElementos(ListaLigada<Integer> lista) {
        long inicio = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while (iterator.temProximo()) {
            iterator.getElemento();
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    private static long removerElementos(List<Integer> lista) {
        long inicio = System.currentTimeMillis();
        for (int i = NUM_ELEMENTS - 1; i >= 0; i--) {
            lista.remove(i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    private static long removerElementos(ListaLigada<Integer> lista) {
        long inicio = System.currentTimeMillis();
        for (int i = NUM_ELEMENTS - 1; i >= 0; i--) {
            lista.remover(i);
        }
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }
}
