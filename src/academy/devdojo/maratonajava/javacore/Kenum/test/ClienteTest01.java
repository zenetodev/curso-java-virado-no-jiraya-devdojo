package academy.devdojo.maratonajava.javacore.Kenum.test;
import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoPagamento;
public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Guilherme", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Antonio", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Maria",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("Ana", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
