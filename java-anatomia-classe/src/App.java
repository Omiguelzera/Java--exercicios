public class App {
    

    public static void main(String[] args) {
        String primeiroNome = "Miguel";
        String segundoNome = "Gonçalves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);


        int a, b;

        a=4;
        b=5;

        String resultado = a==b? "verdadeiro" : "falso";

        System.out.println(resultado);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado : " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
