package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

import academy.devdojo.maratonajava.javacore.herança.domain.Endereco;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }
        for (double salario : this.salarios) {
            System.out.println(salario + " "); 
        }
        mediaSalarial();
    }


    public void mediaSalarial() {
        if (salarios == null){
            return;
        }
        
        
        for (double salario : salarios) {
                media += salario;
            }
        media /= salarios.length;   
    
        System.out.println("\nMedia salarial " + media);
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public double[] getSalarios() {
        return salarios;
    }


    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public double getMedia() {
        return media;
    }


    public void setCpf(String string) {
        throw new UnsupportedOperationException("Unimplemented method 'setCpf'");
    }


    public void setEndereco(Endereco endereco) {

        throw new UnsupportedOperationException("Unimplemented method 'setEndereco'");
    }


    public void setSalario(int i) {

        throw new UnsupportedOperationException("Unimplemented method 'setSalario'");
    }

}



