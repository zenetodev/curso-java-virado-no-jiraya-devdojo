package academy.devdojo.maratonajava.javacore.associacao.test;
import academy.devdojo.maratonajava.javacore.associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.domain.Time;
public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("zeneto");
        Time time = new Time("Santos");
        Jogador[] jogadores = {jogador, jogador2};

        jogador2.setTime(time);
        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---jogador---");

        jogador.imprime();

        System.out.println("---time---");

        time.imprime();
    }
}
