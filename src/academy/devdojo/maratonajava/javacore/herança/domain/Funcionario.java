package academy.devdojo.maratonajava.javacore.herança.domain;

public class Funcionario extends Pessoa {

    private double salario;
    static{
        System.out.println("Inside static block of Funcionario");
    }
    {
        System.out.println("Inside on inicializer block of Funcionario 1");
    }
    {
        System.out.println("Inside on inicializer block of Funcionario 2");
    }


    public Funcionario(String nome){
        super(nome); // Chama o construtor da classe Pessoa
        System.out.println("Inside constructor of Funcionario");
    }

    public void imprime(){
        super.imprime(); // Chama o método imprime da classe Pessoa
        System.out.println("Salario: R$" + this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu sou o " + this.getNome() + " e meu salario é R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
