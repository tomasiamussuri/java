public class EmpresaPrivada extends Empresa {
    @Override
    public boolean cobranca() {
        System.out.println("Cobra o dobro do valor");
        return false;
    }
}
