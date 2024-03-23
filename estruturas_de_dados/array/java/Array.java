public class Array {
    public static void main(String[] args) {

        ArrayExample array = new ArrayExample(5);

        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);

        array.removeAt(0);

        array.indexOf(0);

        array.print();

    }

    public static class ArrayExample {
        private int[] items;
        private int count;

        public ArrayExample(int length) {
            items = new int[length];
        }

        // Inserção: O(1) amortizado, pois necessita de redimensionamento ocasional que
        // é O(n)
        public void insert(int item) {
            // Verifica se o array está cheio. Se estiver, cria um novo array maior.
            // Esta parte causa o redimensionamento que é O(n), mas acontece raramente.
            if (items.length == count) {
                int[] newItems = new int[count * 2];
                for (int i = 0; i < count; i++)
                    newItems[i] = items[i];
                items = newItems;
            }
            // Adiciona o item no final do array: O(1)
            items[count++] = item;
        }

        // Remoção: O(n) devido à necessidade de deslocar elementos após o índice
        // removido
        public void removeAt(int index) {
            // Valida o índice: O(1)
            if (index < 0 || index >= count)
                throw new IllegalArgumentException();

            // Desloca os elementos para preencher o espaço do elemento removido: O(n)
            for (int i = index; i < count - 1; i++)
                items[i] = items[i + 1];
            count--;
        }

        // Busca: O(n) pois realiza uma busca linear através dos elementos
        public int indexOf(int item) {
            for (int i = 0; i < count; i++)
                if (items[i] == item)
                    return i;
            return -1;
        }

        // Impressão de todos os elementos: O(n)
        public void print() {
            for (int i = 0; i < count; i++)
                System.out.println(items[i]);
        }

    }
}