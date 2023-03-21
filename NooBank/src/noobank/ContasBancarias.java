
package noobank;

import java.util.ArrayList;

public class ContasBancarias {
    private ArrayList<Conta> contas;
    
    public ContasBancarias(){
        contas = new ArrayList<>();
    }
    
    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
    
    public void listarContas(){
        for(Conta conta: contas){
            conta.imprimirDetalhes();
        }
    }
}
