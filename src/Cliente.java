public class Cliente {
    public String nome;
    public String CPF;
    public String telefone;
    public String endereco;

    public String comprar(){
        return "Compra feita com sucesso";
    }
    public String ler(){
        return "Que livro interessante!";
    }

    public Cliente(String nome, String CPF, String telefone, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
