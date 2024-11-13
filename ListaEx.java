import java.util.Arrays;

public class ListaEx {
    public static void main(String[] args) {
        int opcao = 0;
        switch (opcao) {
            case 1:
                String palavra = "ovo";
                System.out.println(palindromo("palavra", 0, palavra.length()-1));
                break;
            case 2:
                double [] sla = {8.9, 9.1, 1.2, 8.4, 7.4, 5.0};
                System.out.println(somaVetor(sla, 0, 0.0));
                break;
            case 3:
                String aoa = "mamão";
                System.out.println(contarChar(aoa, 'm', 0, 0));
                break;
            case 4:
                System.out.println(fibonacci(6));
                break;
            case 5:
                int num = 34789;
                int soma = 0;
                System.out.println(somarDigitos(num, soma));
                break;
            case 6:
                String novaPalavra = "Gregory2";
                String invertida = "";
                invertida = inverterString(novaPalavra, 0, invertida); 
                System.out.println(invertida);
                break;
            case 7:
                int vetor[][] = {{5,6,4},{8,9,7},{1,2,0}};
                int auxiliar[][] = new int[vetor.length][vetor[0].length];
                MergeSort.mergeMatriz(vetor, auxiliar, 0, vetor.length-1);
                for(int x=0; x<vetor.length; x++) {
                    System.out.println(Arrays.toString(vetor[x]));
                }
                break;
            case 8:
                Aluno a3 = new Aluno("c", 9 ,4);
                Aluno a5 = new Aluno("e", 7, 8);
                Aluno a4 = new Aluno("d", 6, 7);
                Aluno a1 = new Aluno("a", 3, 2);
                Aluno a6 = new Aluno("f", 4, 2);
                Aluno a2 = new Aluno("b", 5,8);
                Aluno [] alunos = {a1,a2,a3,a4,a5,a6};
                Aluno.ordenarAlunos(alunos);
                break;
            case 9:
                String vetorStr[] = {"c","e","d","a","f"};
                String auxiliarStr[] = new String[vetorStr.length];
                MergeSort.mergeString(vetorStr, auxiliarStr, 0, vetorStr.length-1);
                for(int x=0; x<vetorStr.length; x++) {
                    System.out.println(vetorStr[x]);
                }
                break;
        }
    }

    //1
    public static boolean palindromo(String palavra, int inicio, int fim){
        if(fim<inicio) return true;
        if(palavra.charAt(inicio) == palavra.charAt(fim)) return palindromo(palavra, ++inicio, --fim);
        return false;
    }

   // 2
    public static double somaVetor(double[] vetor, int idx, double var){
        if(idx <= vetor.length-1){
            System.out.println(vetor[idx]);
            var += vetor[idx];
            return somaVetor(vetor, ++idx,var);
        }
        return var;
    }

    //3
    public static int contarChar (String fruta, char letra, int inicio, int cont){
        if(inicio<fruta.length()-1){
            if(fruta.charAt(inicio)==letra) cont ++;
            return contarChar(fruta, letra, ++inicio, cont);
        }
        return cont;
    }

    //4
    public static int fibonacci(int fim){
        if(fim == 0) return 0;
        if(fim == 1) return 1;
        return fibonacci(fim-1) + fibonacci(fim-2);
    }

    //5
    public static int somarDigitos(int num, int soma){
        Math.abs(num);
        if(num>0){
            System.out.println(num);
            soma = soma + num % 10;
            num /= 10;
            return somarDigitos(num, soma);
        }
        return soma;
    }

    //6
    public static String inverterString (String palavra, int comeco, String invertida){
        if(comeco < palavra.length()-1){
            invertida = invertida.concat(String.valueOf(palavra.charAt(palavra.length()-comeco-1)));
            return inverterString(palavra, ++comeco, invertida);
        }
        invertida = invertida.concat(String.valueOf(palavra.charAt(palavra.length()-comeco-1)));
        return invertida;
    }

    //7

}

