package exerciciosSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class exerciocioLinkedHashSet {
    public static void main (String[] args){
        LinkedHashSet<Integer> setLinkado = new LinkedHashSet<>();

        setLinkado.add(3);
        setLinkado.add(88);
        setLinkado.add(20);
        setLinkado.add(40);
        setLinkado.add(3);//o set não duplica elementos, logo esse add não serve pra nada

        System.out.println(setLinkado);

        for (Integer listaSet : setLinkado){ //for each do LinkedHashSet
            System.out.println("--> " + listaSet);
        }

        Iterator<Integer> iteraSetLinkado = setLinkado.iterator();

        while (iteraSetLinkado.hasNext()){
            System.out.println("==> " + iteraSetLinkado.next());
        }

        System.out.println("Set antes da remoção: " + setLinkado);

        //Aqui foi feita uma gambiarra. O exercicio pedia para remover o primeiro elemento,
        //se eu olhasse o Set saberia que é 3 bastaria usar >>>conjuntoDeNumeros.remove(3);<<<
        //mas sem conhecer o Set a única forma que descobri foi iterar o Set para o proximo elemento
        setLinkado.remove(setLinkado.iterator().next());

        System.out.println("Set depois da remoção: " + setLinkado);

        setLinkado.add(23);

        System.out.println("Set depois do add: " + setLinkado);
        //No set linkado o elemento é adicionado no fim da lista

        System.out.println("O tamanho do Set é: " + setLinkado.size());

        System.out.println("O Set está vazio? A resposta é: " + setLinkado.isEmpty());

    }
}
