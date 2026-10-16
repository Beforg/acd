import java.util.Arrays;

/**
 * @author bruno-forgiarini
 * @author maria-eduarda
 */
public class QuickSortHibrido {

    /*
     * JUSTIFICATIVA DO LIMITE = 10:
     *
     * Segundo Cormen et al. (Algoritmos: Teoria e Prática, Cap. 1, 2 e 7):
     *
     * 1. Fatores Constantes Menores: O InsertionSort possui constantes multiplicativas
     *    ocultas menores que algoritmos O(n log n) como Quicksort/MergeSort. Para n pequeno,
     *    o termo c1 * n^2 é menor do que c2 * n log n devido ao custo de
     *    particionamento e empilhamento da recursão (Cormen et al., Sec. 1.2 e Prob. 2-1).
     *
     * 2. Adensamento da Árvore Recursiva: Interromper a recursão quando o subvetor atinge
     *    um tamanho k <= 10 reduz a profundidade da árvore recursiva e evita chamadas
     *    overhead desnecessárias para subproblemas triviais (Cormen et al., Ex. 7.4-5).
     */
    private static final int LIMITE = 10;
    public static void quicksortHibrido(int[] A, int p, int r) {
        if (p < r) {
            int tamanhoSubvetor = r - p + 1;

            if (tamanhoSubvetor <= LIMITE) {
                // interrompe a recursão e aplica o InsertionSort no subvetor
                insertionSort(A, p, r);
            } else {
                // cotinua o quicksort para subvetores maiores
                int q = partition(A, p, r);
                quicksortHibrido(A, p, q - 1);
                quicksortHibrido(A, q + 1, r);
            }
        }
    }

    // particionamento (Lomuto)
    private static int partition(int[] A, int p, int r) {
        int pivô = A[r]; // pivô no final do subvetor
        int i = p - 1;

        for (int j = p; j < r; j++) {
            if (A[j] <= pivô) {
                i++;
                trocar(A, i, j);
            }
        }

        trocar(A, i + 1, r);
        return i + 1;
    }

    // InsertionSort A[p .. r]
    private static void insertionSort(int[] A, int p, int r) {
        for (int i = p + 1; i <= r; i++) {
            int chave = A[i];
            int j = i - 1;

            while (j >= p && A[j] > chave) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = chave;
        }
    }

    private static void trocar(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Programa de Teste
    public static void main(String[] args) {
        // Vetor pequeno (menor que o LIMITE)
        int[] v1 = {9, 3, 7, 1, 5, 2, 8};
        System.out.println("V1 Original: " + Arrays.toString(v1));
        quicksortHibrido(v1, 0, v1.length - 1);
        System.out.println("V1 Ordenado: " + Arrays.toString(v1) + "\n");

        // Vetor médio desordenado
        int[] v2 = {34, 7, 23, 32, 5, 62, 32, 12, 90, 1, 15, 8, 43, 2, 70};
        System.out.println("V2 Original: " + Arrays.toString(v2));
        quicksortHibrido(v2, 0, v2.length - 1);
        System.out.println("V2 Ordenado: " + Arrays.toString(v2) + "\n");

        // Vetor em ordem decrescente (pior caso padrão do QuickSort)
        int[] v3 = {50, 40, 30, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("V3 Original: " + Arrays.toString(v3));
        quicksortHibrido(v3, 0, v3.length - 1);
        System.out.println("V3 Ordenado: " + Arrays.toString(v3));
    }
}