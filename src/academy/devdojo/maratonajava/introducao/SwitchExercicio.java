package academy.devdojo.maratonajava.introducao;

public class SwitchExercicio{
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        int dia = 1;
        String diaDaSemana = "";

        switch(dia){
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Dia inválido";
                break;
        }

        if (dia == 1 || dia == 7){
            System.out.println(diaDaSemana + " - Final de semana");
        } else if (dia >= 2 && dia <= 6){
            System.out.println(diaDaSemana + " - Dia útil");;
        } else {
            System.out.println(diaDaSemana);
        }


    }
}