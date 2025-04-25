package academy.devdojo.maratonajava.javacore.polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repository;

public class RepositorioArquivo implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo...");
    }
    
}
