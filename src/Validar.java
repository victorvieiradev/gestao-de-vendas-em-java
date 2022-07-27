public class Validar extends Sistema {

    boolean validarCpf(String cpf) {
        for (Cliente cliente : clientesCadastrados) {
            cpf = cliente.getCpf();
            if (cpf.equalsIgnoreCase(cliente.getCpf())) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
};