package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carros;

public class CarrosTest01 {
    public static void main(String[] args) {
        Carros carro1 = new Carros();
        Carros carro2 = new Carros();
        carro1.nome = "Corolla";
        carro1.modelo = "XEI";
        carro1.ano = 2020;
        carro2.nome = "Civic";
        carro2.modelo = "EXL";
        carro2.ano = 2021;
        
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano:" + carro1.ano);
        System.out.println("------------------------------");   
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano:" + carro2.ano);
    }
}