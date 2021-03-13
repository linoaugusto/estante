package exerciciosSet;

import java.util.HashSet;
import java.util.Iterator;

public class exercicioHashSet {
    public static void main (String[] args){
        HashSet<Integer> conjuntoDeNumeros = new HashSet<>();

        conjuntoDeNumeros.add(3);
        conjuntoDeNumeros.add(88);
        conjuntoDeNumeros.add(20);
        conjuntoDeNumeros.add(40);
        conjuntoDeNumeros.add(3);

        System.out.println(conjuntoDeNumeros);

        for (Integer exibeNumero: conjuntoDeNumeros){// for each para exibir cada elemento do Set
            System.out.println("==> " + exibeNumero);
        };

        Iterator<Integer> numerosParaExibicao = conjuntoDeNumeros.iterator();

        while (numerosParaExibicao.hasNext()){ // navegando no Set com um while e iterator
            System.out.println("--> " + numerosParaExibicao.next());
        }

        //Aqui foi feita uma gambiarra. O exercicio pedia para remover o primeiro elemento,
        //se eu olhasse o Set saberia que é 3 bastaria usar >>>conjuntoDeNumeros.remove(3);<<<
        //mas sem conhecer o Set a única forma que descobri foi iterar o Set para o proximo elemento
        conjuntoDeNumeros.remove(conjuntoDeNumeros.iterator().next());

        System.out.println(conjuntoDeNumeros);

        conjuntoDeNumeros.add(23);

        System.out.println(conjuntoDeNumeros);

        System.out.println("O tamanho do Set é: " + conjuntoDeNumeros.size());

        System.out.println("O Set está vazio? A resposta é: " + conjuntoDeNumeros.isEmpty());
    }
}
