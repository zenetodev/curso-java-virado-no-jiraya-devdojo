package academy.devdojo.maratonajava.javacore.exercicio.domain;

public class Local{
    private String local;
    public Local(String local) {
        this.local = local;
    }

    

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public char[] getEndereco() {
        throw new UnsupportedOperationException("Unimplemented method 'getEndereco'");
    }


    
}