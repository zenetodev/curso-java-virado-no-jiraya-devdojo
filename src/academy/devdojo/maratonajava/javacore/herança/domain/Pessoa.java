package academy.devdojo.maratonajava.javacore.herança.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static{
        System.out.println("Inside static block of Pessoa");
    }
    {
        System.out.println("Inside on inicializer block of Pessoa 1");
    }
    {
        System.out.println("Inside on inicializer block of Pessoa 2");
    }
    public Pessoa(String nome){
        System.out.println("Inside constructor of Pessoa");
        this.nome = nome;
    }

    
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if (this.endereco != null) {
            System.out.println("Rua: " + this.endereco.getRua());
            System.out.println("Bairro: " + this.endereco.getBairro());
        } else {
            System.out.println("Endereco não informado");
        }
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    

    
}
