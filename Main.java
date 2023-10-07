import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 10000, 20000};

        for (int size : sizes) {
            BinaryTree binaryTree = new BinaryTree();
            AVLTree avlTree = new AVLTree();

            // Inserir elementos aleatórios
            int[] randomNumbers = generateRandomNumbers(size);

            // Inserir na BinaryTree
            long startTime = System.currentTimeMillis();
            for (int num : randomNumbers) {
                binaryTree.insert(num);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Tempo de inserção na BinaryTree para " + size + " elementos: " + (endTime - startTime) + " ms");

            // Inserir na AVLTree
            startTime = System.currentTimeMillis();
            for (int num : randomNumbers) {
                avlTree.insert(num);
            }
            endTime = System.currentTimeMillis();
            System.out.println("Tempo de inserção na AVLTree para " + size + " elementos: " + (endTime - startTime) + " ms");

            // Realizar buscas e remoções

            System.out.println();
        }
    }

    private static int[] generateRandomNumbers(int n) {
        int[] randomNumbers = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randomNumbers[i] = random.nextInt();
        }
        return randomNumbers;
    }
}
