public class ResultadoEscolar {

    public static void  main(String[]args) {
            
        int nota = 5;

        String resultado = nota >=7 ? "aprovado" : nota >=5 && nota <=7 ? "Exame" : "Reprovado";

        System.out.println(resultado);
    }
}