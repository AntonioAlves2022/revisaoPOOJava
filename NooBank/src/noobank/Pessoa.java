
package noobank;

public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String cidade;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String cpf, String telefone, String cidade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void imprimriDetalhes(){
        System.out.println("Nome: "+ nome);
        System.out.println("CPF: "+ cpf);
    }
    
    
}
