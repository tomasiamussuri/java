public class Funcionario {
    private String nome;
    private String departamento;
    private float salario;
    private String dataEntrada;
    private String rg;
    private boolean status;

    public Funcionario() {
        this.status = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void bonifica(float adicionalSalario) {
        if (status == true && adicionalSalario > 0) {
            setSalario(getSalario() + adicionalSalario);
            System.out.println("Aumento realizado!");
        } else if (status == true && adicionalSalario <= 0) {
            System.out.println("Só é permitido bonificação maior que 0 (zero).");
        } else {
            System.out.println("Não pode ser dado bonificação para funcionário inativo.");
        }
    }

//    public void demite(boolean status) {
//        if(isStatus() == true && status == false) {
//            setStatus(false);
//        } else {
//            System.out.println("Funcionário já inativo.");
//        }
//    }

    public void demite() {
        if(isStatus() == true) {
            setStatus(false);
        } else {
            System.out.println("Funcionário já inativo.");
        }
    }
    public void mostrarDados() {
        System.out.println("_________________________________________________________");
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRg());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário: R$ " + getSalario());
        System.out.println("Status: " + (isStatus() ? "Ativo" : "Inativo"));
        System.out.println("_________________________________________________________");
    }
}