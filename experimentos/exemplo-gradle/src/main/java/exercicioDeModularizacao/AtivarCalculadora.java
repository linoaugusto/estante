package exercicioDeModularizacao;

import exercicio.modularizacao.utils.Calculadora;

public class AtivarCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(6,2));
        System.out.println(calculadora.subtracao(7,5));
        System.out.println(calculadora.divisao(12,3));
        System.out.println(calculadora.multiplicacao(4,8));
    }
}
