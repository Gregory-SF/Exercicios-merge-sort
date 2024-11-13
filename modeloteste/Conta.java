package modeloteste;

public class Conta {
    private String cpf = "145.382.206-20";

    public String getCpfCorrentista() {
        return cpf;
    }
    public void validarCpf(Conta conta) {
		int soma = 0;
		int cal = 10;
		for(int i = 0; i<11;i++) {
			if(i == 3 || i ==7) continue;
			soma += (conta.getCpfCorrentista().charAt(i)-'0')*cal--;
		}
		int res =(soma*10)%11;
		if (res > 9) res = 0; 
		if(res != conta.getCpfCorrentista().charAt(12)-'0') System.out.println();//return null;
		else {
			cal = 11;
            soma = 0;
			for(int i = 0; i<13;i++) {
				if(i == 3 || i ==7 || i==11) continue;
				soma += (conta.getCpfCorrentista().charAt(i)-'0')*cal--;
			}
			res =(soma*10)%11;
			if (res > 9) res = 0; 
			if(res != conta.getCpfCorrentista().charAt(13)-'0') System.out.println("CPF inválido"); //return null;
			else System.out.println("CPF válido");//return conta;
		}

    }
	
}

