package academy.devdojo.maratonajava.javacore.associacao.domain;

public class Jogador {
    private String nome;
    private Time time; // Jogador tem um time, ou seja, o jogador é dependente do time
    public void imprime(){
        System.out.println(this.nome);
        if(time != null){
            System.out.println("Time: " + time.getNome());
        }
    }
    public Jogador(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }

}
