

public class ValidaTelefone {

    public static void validarTelefone(String telefone) throws NumeroInvalidoException {
        // Remove todos os caracteres que não são números
        telefone = telefone.replaceAll("[^0-9]", "");

        // Valida se o número tem 9 ou 10 dígitos
        if (telefone.length() != 9 && telefone.length() != 10) {
            throw new NumeroInvalidoException("Número de telefone inválido! O número deve ter 9 ou 10 dígitos.");
        }

        // Formatação do número de telefone
        if (telefone.length() == 9) {
            // Se o número tem 9 dígitos, coloca o traço no 6º dígito
            telefone = telefone.substring(0, 5) + "-" + telefone.substring(5);
        } else if (telefone.length() == 8) {
            // Se o número tem 8 dígitos, coloca o traço no 5º dígito
            telefone = telefone.substring(0, 4) + "-" + telefone.substring(4);
        }

        // Exibe o número formatado
        System.out.println("Número de telefone formatado: " + telefone);
    }
}
