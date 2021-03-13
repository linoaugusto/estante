package exerciciosSet;

import java.util.Iterator;
import java.util.TreeSet;

public class exercicioTreeSet {
    public static void main(String[] args){
        TreeSet<Integer> listaArvore = new TreeSet<>();

        listaArvore.add(3);
        listaArvore.add(88);
        listaArvore.add(20);
        listaArvore.add(40);
        listaArvore.add(3);

        System.out.println("O que temos no TreeSet é " + listaArvore);

        for (Integer exibeTreeSet : listaArvore){
            System.out.println("-->>" + exibeTreeSet);
        }

        Iterator<Integer> iteratorTreeSet = listaArvore.iterator();

        while (iteratorTreeSet.hasNext()){
            System.out.println("==>> " + iteratorTreeSet.next());
        }

        System.out.println("TreeSet antes da remoção: " + listaArvore);

        //listaArvore.remove(listaArvore.iterator().next()); a forma que eu usava para remover o 1º elemento
        //mas na linha seguinte há outra forma que também funciona com a árvore
        listaArvore.remove(listaArvore.first());//listaArvore.first() retorna o primeiro elemento da arvore

        System.out.println("TreeSet depois da remoção: " + listaArvore);

        System.out.println("Set antes do add: " + listaArvore);
        //No set linkado o elemento é adicionado no fim da lista

        listaArvore.add(23); //adicionando outro elemento

        System.out.println("Set depois do add: " + listaArvore);
        //No set linkado o elemento é adicionado no fim da lista

        System.out.println("O tamanho do Set é: " + listaArvore.size());

        System.out.println("O Set está vazio? A resposta é: " + listaArvore.isEmpty());
    }
}
