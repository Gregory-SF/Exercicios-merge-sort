import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Maindez {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 10; i++) {
            int tam = 1;
            Path path = null;
            switch (tam) {
                case 1:
                    path = Paths.get("C:\\Users\\User\\Desktop\\Facul\\Alg. e Estrut. dados\\Teste\\src\\numeros\\numeros1K"+i+".txt");
                    break;
                case 10:
                    path = Paths.get("C:\\Users\\User\\Desktop\\Facul\\Alg. e Estrut. dados\\Teste\\src\\numeros\\numeros10K"+i+".txt");
                break;
                case 100:
                    path = Paths.get("C:\\Users\\User\\Desktop\\Facul\\Alg. e Estrut. dados\\Teste\\src\\numeros\\numeros100K"+i+".txt");
                break;            
                case 1000:
                    path = Paths.get("C:\\Users\\User\\Desktop\\Facul\\Alg. e Estrut. dados\\Teste\\src\\numeros\\numeros1M"+i+".txt");
                break;    
            
            }
            List<String> numeros = Files.readAllLines(path);
            String str = numeros.get(0).toString();
            String [] arr = str.substring(1,str.length()-1).split(",");
            int[] vetorInsertion = new int[1000*tam];
            int[] vetorBubble = new int[1000*tam];
            int[] vetorSelection = new int[1000*tam];
            int[] vetorMerge = new int[1000*tam];


            for(int g = 0; g < arr.length; g++){
                int value = Integer.parseInt(arr[g]);
                vetorInsertion[g] = value;
                vetorBubble[g] = value;
                vetorSelection[g] = value;
                vetorMerge[g] = value;
            }

            System.out.println("Iteração "+i);
            long tempoInicial = System.nanoTime();
            BubbleSort.ordenar(vetorBubble);
            long tempoFinal = System.nanoTime();
            long milisegundos = (tempoFinal-tempoInicial)/1000000;
            long segundos = milisegundos/1000;
            System.out.println("Tempo BubbleSort: " + milisegundos + "ms");
            System.out.println("Tempo BubbleSort: " + (tempoFinal-tempoInicial) + " ns     "+segundos +"seg\n");

            tempoInicial = System.nanoTime();  
            InsertionSort.ordenar(vetorInsertion);
            tempoFinal = System.nanoTime();
            milisegundos = (tempoFinal-tempoInicial)/1000000;
            segundos = milisegundos/1000;    
            System.out.println("Tempo InsertionSort: " + milisegundos + "ms");
            System.out.println("Tempo InsertionSort: " + (tempoFinal-tempoInicial) + " ns     "+segundos +"seg\n");

            tempoInicial = System.nanoTime();  
            SelectionSort.ordenar(vetorSelection);
            tempoFinal = System.nanoTime();
            milisegundos = (tempoFinal-tempoInicial)/1000000;
            segundos = milisegundos/1000;       
            System.out.println("Tempo Selectionsort: " + milisegundos + "ms");
            System.out.println("Tempo Selectionsort: " + (tempoFinal-tempoInicial) + " ns     "+segundos +"seg\n");

            tempoInicial = System.nanoTime();  
            MergeSort.ordenar(vetorMerge);
            tempoFinal = System.nanoTime();
            milisegundos = (tempoFinal-tempoInicial)/1000000;
            segundos = milisegundos/1000;        
            System.out.println("Tempo MergeSort: " + milisegundos + "ms");        
            System.out.println("Tempo MergeSort: " + (tempoFinal-tempoInicial) + " ns     "+segundos +"seg\n");
            System.out.println("******************************************************************************************");
        }
    }
}
