public class Estado {
    public static void validarEstado(String estado) throws EstadoInvalidoException {
        String[] estadosValidos = {
            "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", 
            "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", 
            "RO", "RR", "SC", "SP", "TO", "DF"
        };

        // Verifica se o estado tem exatamente 2 caracteres
        if (estado.length() != 2) {
            throw new EstadoInvalidoException("Estado inválido. A sigla do estado deve ter exatamente 2 caracteres.");
        }

        // Flag para verificar se o estado é válido
        boolean estadoValido = false;

        // Loop para verificar se o estado está presente no array de estados válidos
        for (String sigla : estadosValidos) {
            if (sigla.equalsIgnoreCase(estado)) {
                estadoValido = true;
                break; // Se o estado for encontrado, sai do loop
            }
        }

        // Se o estado não for válido, lança a exceção
        if (!estadoValido) {
            throw new EstadoInvalidoException("Estado inválido.");
        }
        
    }

}
