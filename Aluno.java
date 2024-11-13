public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double mediaFinal;

    public Aluno() {
    }

    public Aluno (String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        mediaFinal = (nota1+nota2)/2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }


    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal() {
        this.mediaFinal = (nota1+nota2)/2;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", mediaFinal=" + mediaFinal + "]";
    }
	
        public static void ordenarAlunos(Aluno[] alunos) {	
            for (Aluno aluno : alunos) {
                System.out.println(aluno.toString());
            }
            Aluno auxiliar[] = new Aluno[alunos.length];
            merge(alunos, auxiliar, 0, alunos.length-1);
            System.out.println(" ");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.toString());
            }
        }
            
            private static void merge(Aluno vetor[], Aluno auxiliar[], int inicio, int fim) {
                if(inicio<fim) {
                    int meio = (inicio + fim)/2;
                    merge(vetor,auxiliar,inicio, meio);
                    merge(vetor,auxiliar,meio+1, fim);
                    intercalacao(vetor, auxiliar, inicio, meio, fim);
                }
            }
            private static void intercalacao(Aluno vetor[], Aluno auxiliar[], int inicio, int meio, int fim) {
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
                    else if(auxiliar[esquerda].getMediaFinal()<auxiliar[direita].getMediaFinal()) {
                        vetor[x] = auxiliar[esquerda++];
                    } else {
                        vetor[x] = auxiliar[direita++];
                    }
                }
            
            }
        }