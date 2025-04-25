package academy.devdojo.maratonajava.javacore.associacao.test;
import academy.devdojo.maratonajava.javacore.associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.domain.Time;
public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
