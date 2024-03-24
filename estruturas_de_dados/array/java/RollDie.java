/**
 * Esta classe simula o lançamento de um dado e registra a frequência de cada face.
 * A simulação usa a classe SecureRandom para gerar números aleatórios representando
 * as faces do dado (valores de 1 a 6). Após simular seis milhões de lançamentos,
 * a frequência de cada face é exibida.
 * 
 * Código exemplo de "Java Como Programar", 10ª edição, por Paul Deitel e Harvey Deitel.
 * 
 * @since 2024-03-25
 */
public class RollDie {
    public static void main(String[] args) {
        // Cria um gerador de números aleatórios seguro para uso em simulação
        SecureRandom randomNumbers = new SecureRandom();
        
        // Array para armazenar a frequência das faces do dado
        int[] frequency = new int[7]; // índice 0 não utilizado

        // Simula o lançamento do dado seis milhões de vezes
        for (int roll = 1; roll <= 6000000; roll++)
            ++frequency[1 + randomNumbers.nextInt(6)];

        // Cabeçalho da saída de dados
        System.out.printf("%s%10s%n", "Face", "Frequency");

        // Imprime a frequência de cada face do dado
        for (int face = 1; face < frequency.length; face++)
            System.out.printf("%4d%10d%n", face, frequency[face]);
     }
}