import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empresa empresaPrivada = new EmpresaPrivada();
        empresaPrivada.setNome("Senai");
        empresaPrivada.setCnpj("99009008000123");

        Empresa empresaPublica = new EmpresaPublica();
        empresaPublica.setNome("Sabesp");
        empresaPublica.setCnpj("01001002000134");

        ArrayList<Empresa> empresas = new ArrayList<>();
        empresas.add(empresaPublica);
        empresas.add(empresaPrivada);

        for (int i = 0 ; i < empresas.size() ; i++) {
            System.out.println(empresas.get(i));
            System.out.println(empresas.get(i).cobranca());
            System.out.println("*********");
        }

    }
}