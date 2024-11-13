
public class MergeSort {
    public static void ordenar(int[] vetor){
        int auxiliar[] = new int[vetor.length];
        merge(vetor, auxiliar, 0, vetor.length-1);
    }

    private static void merge(int vetor[], int auxiliar[], int inicio, int fim) {
        if(inicio<fim) {
            int meio = (inicio + fim)/2;
            merge(vetor,auxiliar,inicio, meio);
            merge(vetor,auxiliar,meio+1, fim);
            intercalacao(vetor, auxiliar, inicio, meio, fim);
        }
    }
    private static void intercalacao(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        for(int x=inicio; x <=fim; x++) {
            auxiliar[x] = vetor[x];
            }
        int esquerda = inicio;
        int direita = meio+1;
        
        for(int x= inicio; x<=fim; x++) {
            if(esquerda>meio) {
                vetor[x] = auxiliar[direita++];
            }
            else if(direita>fim) {
                vetor[x]= auxiliar[esquerda++];
            }
            else if(auxiliar[esquerda]<auxiliar[direita]) {
                vetor[x] = auxiliar[esquerda++];
            } else {
                vetor[x] = auxiliar[direita++];
            }
        }
    
    }

    public static void mergeMatriz(int vetor[][], int auxiliar[][], int inicio, int fim) {
        if(inicio<fim) {
            int meio = (inicio + fim)/2;
            mergeMatriz(vetor,auxiliar,inicio, meio);
            mergeMatriz(vetor,auxiliar,meio+1, fim);
            intercalacaoMatriz(vetor, auxiliar, inicio, meio, fim);
        }
    }
    private static void intercalacaoMatriz(int[][] vetor, int[][] auxiliar, int inicio, int meio, int fim) {
        for (int y = 0; y < vetor.length; y++) {
            for (int x = 0; x < vetor[y].length; x++) {
                auxiliar[y][x] = vetor[y][x];
            }
        }

        for (int y = 0; y < vetor.length; y++) {
            int esquerda = inicio;
            int direita = meio+1;
            for (int x = 0; x < vetor[y].length; x++) {
                if(esquerda>meio) {
                    vetor[y][x] = auxiliar[y][direita++];
                }
                else if(direita>fim) {
                    vetor[y][x]= auxiliar[y][esquerda++];
                }
                else if(auxiliar[y][esquerda]<auxiliar[y][direita]) {
                    vetor[y][x] = auxiliar[y][esquerda++];
                } else {
                    vetor[y][x] = auxiliar[y][direita++];
                }
            }
        }
    }

    public static void mergeString(String vetor[], String auxiliar[], int inicio, int fim) {
        if(inicio<fim) {
            int meio = (inicio + fim)/2;
            mergeString(vetor,auxiliar,inicio, meio);
            mergeString(vetor,auxiliar,meio+1, fim);
            intercalacaoString(vetor, auxiliar, inicio, meio, fim);
        }
    }
    private static void intercalacaoString(String vetor[], String auxiliar[], int inicio, int meio, int fim) {
        for(int x=inicio; x <=fim; x++) {
            auxiliar[x] = vetor[x];
            }
        int esquerda = inicio;
        int direita = meio+1;
        for(int x= inicio; x<=fim; x++) {
            if(esquerda>meio) {
                vetor[x] = auxiliar[direita++];
            }
            else if(direita>fim) {
                vetor[x]= auxiliar[esquerda++];
            }
            else if(auxiliar[esquerda].compareTo(auxiliar[direita])<0) {
                vetor[x] = auxiliar[esquerda++];
            } else {
                vetor[x] = auxiliar[direita++];
            }
        }
    }
}

