package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repository;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repository repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        System.out.println(list);
    }
}
