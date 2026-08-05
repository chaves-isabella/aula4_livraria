public class Vendedor {
    public String nome;
    public String CPF;
    public String telefone;
    public String email;
    public String idVendedor;

    public String vender(){
        return "Aproveite seu novo livro";
    }
    public String organizarLivros(){
        return "Livros em seus devidos lugares";
    }

    public Vendedor(String nome, String CPF, String telefone, String email, String idVendedor) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
        this.idVendedor = idVendedor;
    }
}
