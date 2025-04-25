package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento{
    DEBITO(1) {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO(2){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };
    

    public final int VALOR;
    TipoPagamento(int valor){
        this.VALOR = valor;
    }

    public double calcularDesconto(double valor){
        return 0;
    }
}
