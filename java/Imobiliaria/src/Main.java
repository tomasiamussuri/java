/*
IMOBILIÁRIA
1 -> Tendo como base o contexto de uma imobiliária, defina pelo menos um objeto com cinco características;
2 -> Nas características identificadas, você consegue enxergar quais regras deveriam ser aplicadas a elas, para que não
ocorra a "inconsistência do estado", isto é, informações sobre o objeto definido que não correspondem a realidade?
 */

public class Main {
    public static void main(String[] args) {

        Imovel imovel = new Imovel();

        imovel.setTipoContrato("Aluguel");
        imovel.setTipoImovel("Apartamento");
        imovel.setTamanhoImovel(59.0f);
        imovel.setQtdeQuartos(2);
        imovel.setQtdeBanheiros(1);
        imovel.setQtdeGaragem(0);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Avenida Paulista");
        endereco.setNumero("77");
        endereco.setComplemento("Apt 31");
        endereco.setBairro("Paraíso");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        imovel.setEndereco(endereco);

        imovel.setValorImovel(3000f);
        imovel.setValorCondominio(1200f);
        imovel.setValorIPTU(150f);

        System.out.println("IMOBILIÁRIA SÃO PAULO");
        System.out.println("_______________________________________________________________________");
        imovel.dadosImovel();
    }
}