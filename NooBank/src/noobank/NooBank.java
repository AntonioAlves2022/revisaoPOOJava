package noobank;

public class NooBank {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Manoel Coimbra", "000.001-23", "9999999", "NH");
        Pessoa p2 = new Pessoa(1, "Luiza Rezende", "222.101-23", "9999344", "POA");
        Conta c1 = new Conta(10, p1, "0987-x", 2000, 500, "11/11/2021");
        Conta c2 = new Conta(15, p2, "0987-x", 3500, 1000, "11/1/2023");

        System.out.println("C2 Antes da transferencia : "+ c2.getSaldo());
        System.out.println("C1 Antes da transferencia : "+ c1.getSaldo());
        try{
            c2.transferir(c1, 5000);
        }catch(OperacaoException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("C2 depois da transferencia : "+ c2.getSaldo());
        System.out.println("C1 depois da transferencia : "+ c1.getSaldo());
        
        ContasBancarias contasBancarias = new ContasBancarias();
        contasBancarias.adicionarConta(c1);
        contasBancarias.adicionarConta(c2);
        
        contasBancarias.listarContas();

    }

}
