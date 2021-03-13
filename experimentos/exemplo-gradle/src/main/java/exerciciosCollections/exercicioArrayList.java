package exerciciosCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class exercicioArrayList {
    public static void main (String[] args){
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<String> outraListaDeNomes = new ArrayList<String>();
        int contador = 0;

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        outraListaDeNomes.add("Ismael");
        outraListaDeNomes.add("Rodrigo");

        System.out.println(nomes);

        System.out.println("\nIterando com FOR");
        for (String mostre : nomes) {
            System.out.println("Na posição "+ contador + " da lista está o nome >>> " + mostre);
            contador++;
        }

        Iterator<String> iteraLista = nomes.iterator();
        contador = 0;

        System.out.println("\nInterando com WHILE");
        while (iteraLista.hasNext()){
            System.out.println("Na posição "+ contador + " da lista está o nome >>> " + iteraLista.next());
            contador++;
        }

        nomes.set(nomes.indexOf("Carlos"), "Roberto");
        /* Há varias formas de fazer isso, mas a algumas delas envolvem olhar a lista pra saber qual
        a posição de carlos para substituir por roberto, até da pra dar .remove("carlos"), mas não dá pra saber
        a posição que roberto deve ser adicionado. Como .set pede um índice e um elemento, aproveitando isso
        dá pra usar o .indexOf("carlos") pra saber qual o elemento sem olhar a lista
        */

        System.out.println(nomes);
        System.out.println(nomes.get(1));// .get() permite escolher qual elemento será usado

        nomes.remove(4);
        System.out.println(nomes);

        nomes.add("João"); /*o nome joão foi adicionado novamente porque o exercicio pedia para excluí-lo
        usando o nome como argumento*/
        System.out.println(nomes);
        nomes.remove("João");
        System.out.println(nomes);

        System.out.println("A quantidade de elementos na lista é " + nomes.size());
        System.out.println("Juliano está na lista? Resposta: " + nomes.contains("Juliano"));
        //A lista tem JulianA

        nomes.addAll(outraListaDeNomes); //add todos os elementos de uma coleção em outra
        System.out.println(nomes);

        Collections.sort(nomes);// Collections.sort() organiza uma coleção
        System.out.println(nomes);

        System.out.println("A lista está vazia? A resposta é " + nomes.isEmpty());



    }
}
