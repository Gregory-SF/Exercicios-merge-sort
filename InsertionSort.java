
public class InsertionSort {
    public static void ordenar(int[] vetor){
        for(int x = 1; x < vetor.length; x++){
            int chave = vetor[x];
            int y = x - 1;
            while(y >= 0 && vetor[y] > chave){
                vetor[y + 1] = vetor[y];
                y--;
            }
            vetor[y + 1] = chave;
        }
    }
}
 
