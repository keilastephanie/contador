import java.util.Scanner;

public class Contador {
    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }
	private static String mensagem;
    public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
            	//chamando o método contendo a lógica de contagem
            	contar(parametroUm, parametroDois);
            
            }catch (  ParametrosInvalidosException e )  {
            	System.out.println("Error:" +e.getMessage());
            }
        }
     
	}

    
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroDois <= parametroUm){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        }
		 System.out.println("contagem entre" + parametroUm + "e" + parametroDois + ":");
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i = parametroUm; i <= parametroDois; i++){
            System.out.println(i);
        }
	}

}


        
