
public class SelectionSort {
    public static void ordenar(int[] vetor){
        for(int x = 0; x < vetor.length; x++){
            int indiceMenor = x;
            for(int y = indiceMenor+1; y < vetor.length; y++){
                if(vetor[y] < vetor[indiceMenor]){
                    indiceMenor = y;
                }
            }
            if(indiceMenor != x){
                int temp = vetor[x];
                vetor[x] = vetor[indiceMenor];
                vetor[indiceMenor] = temp;
            }
        }
    }
}

     