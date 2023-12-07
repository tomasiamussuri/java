public class EmpresaPublica extends Empresa {

    @Override
    public boolean cobranca() {
        System.out.println("Cobra metade do valor");
        return false;
    }
}
