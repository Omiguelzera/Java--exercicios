public class AboutMe {
    public static void main(String[] args) throws Exception {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        
        System.out.println("Olá me chamo " + nome + " " + sobrenome);
        System.out.println("Eu tenho : " + idade + " " + "de idade");
        System.out.println("E tenho : " + altura + " " + "de altura");

    }
}
