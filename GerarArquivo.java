import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GerarArquivo {
    public static void main(String[] args) {
        // Defina o tamanho desejado e o nome do arquivo
        for (int i = 2; i <= 10; i++) {
                
            int tamanho = 1000; // Altere para 100000 ou 1000000 conforme necessário
            String nomeArquivo = "numeros1K"+i+".txt";

            // Gere e salve os números no arquivo
            gerarNumeros(tamanho, nomeArquivo);
            System.out.println("Arquivo '" + nomeArquivo + "' com " + tamanho + " números gerado.");
        }
    }
    private static void gerarNumeros(int tamanho, String nomeArquivo) {
        Random random = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            writer.print("{");
            for (int i = 0; i < tamanho; i++) {
                writer.print(random.nextInt(10 * tamanho));
                if (i < tamanho - 1) {
                    writer.print(",");
                }
            }
            writer.print("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
