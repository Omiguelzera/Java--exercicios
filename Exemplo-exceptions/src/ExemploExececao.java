public class ExemploExececao {
    public static void main(String[] args) throws Exception {
        try {
            String cepFormatado = FormatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExceptions e) {
            System.out.println("Cep invalido !");
        }
    }

    static String FormatarCep(String cep) throws CepInvalidoExceptions{
        if(cep.length() != 8)
        throw new CepInvalidoExceptions();

        return "23.765-064";
    }
}
