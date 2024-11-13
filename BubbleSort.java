
public class BubbleSort {
    public static void ordenar(int[] vetor){
        boolean trocou = false;
        do {
            trocou = false;
            for(int x = 0; x < vetor.length - 1; x++){
                int valor = vetor[x];
                if(valor > vetor[x + 1]){
                    vetor[x] = vetor[x + 1];
                    vetor[x + 1] = valor;
                    trocou = true;
                }
            }
        } while (trocou);
    }
}
