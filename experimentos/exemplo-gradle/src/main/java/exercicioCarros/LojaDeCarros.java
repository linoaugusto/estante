package exercicioCarros;

import java.util.Scanner;

public class LojaDeCarros {
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite marca, modelo e ano do carro. Use o ENTER para avançar o atributo");
        Carro carroUsuario = new Carro (scan.nextLine(), scan.nextLine(), scan.nextInt());

        Carro carro = new Carro ("Volkswagen", "Fusca", 1980);
        carro.variante = "teste";

        carro.infos();
        carroUsuario.infos();
    }
}
