package academy.devdojo.maratonajava.javacore.associacao.test;
import academy.devdojo.maratonajava.javacore.associacao.domain.Jogador;
public class JogadorTest01 {
    public static void main(String[] args) {
        
    Jogador jogador1 = new Jogador("Neymar Jr");
    Jogador jogador2 = new Jogador("Cristiano Ronaldo");
    Jogador jogador3 = new Jogador("Lionel Messi");
    Jogador[] jogadores = {jogador1, jogador2, jogador3};
    for (Jogador jogador : jogadores){
        jogador.imprime();
    }
    }
}
