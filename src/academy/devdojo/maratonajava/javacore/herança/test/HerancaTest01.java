package academy.devdojo.maratonajava.javacore.herança.test;

import academy.devdojo.maratonajava.javacore.herança.domain.Endereco;
import academy.devdojo.maratonajava.javacore.herança.domain.Pessoa;
import academy.devdojo.maratonajava.javacore.herança.domain.Funcionario;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setBairro("Bairro 3");
        Pessoa pessoa = new Pessoa("Antonio");
        pessoa.setNome("Lucas");
        pessoa.setCpf("12345678900");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("servente");
        funcionario.setNome("cachorro doido");
        funcionario.setCpf("12312312312");
        funcionario.setSalario(2000);
        funcionario.setEndereco(endereco);
        System.out.println("------------");
        funcionario.imprime();
    }
}
