import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Ditite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        terminal.close();
         
        try {

            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosExceptions e) {
            System.out.println("Parametro dois deve ser maior que o parametro um");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptions{
        if(parametroUm >= parametroDois){
            
            throw new ParametrosInvalidosExceptions();
        }
        
        for(int i = parametroUm; i <= parametroDois; i++ ){

            int contagem = parametroDois - i;
            System.out.println("Imprimindo numero : " + contagem);
        }
        
       

    }
}
