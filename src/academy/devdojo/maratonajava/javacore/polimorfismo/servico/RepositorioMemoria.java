package academy.devdojo.maratonajava.javacore.polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repository;

public class RepositorioMemoria implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando na memória...");
    }
    
}
