public class Validar {

    static boolean validarCpfCliente(String cpf) {
        Sistema sistema = new Sistema();
        for (Cliente cliente : sistema.clientesCadastrados) {
            String cpfAuxiliar = cliente.getCpf();
            if (cpfAuxiliar.equalsIgnoreCase(cpf)) {
                return true;
            } else {
                return  false;
            }
        }
        return false;
    }


    void validarEmail(String email){

    }
}
