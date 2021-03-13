package exerciciosCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class exerciciosQueue {
    public static void main (String[] args){
        Queue<String> filaDoBanco = new LinkedList<>();
        int contador = 0;

        filaDoBanco.add("Juliana");
        filaDoBanco.add("Pedro");
        filaDoBanco.add("Carlos");
        filaDoBanco.add("Larissa");
        filaDoBanco.add("João");

        System.out.println(filaDoBanco);

        System.out.println("\nIterando com FOR");
        for (String mostre : filaDoBanco) {
            System.out.println("Na posição "+ contador + " da lista está o nome >>> " + mostre);
            contador++;
        }

        Iterator<String> iteraLista = filaDoBanco.iterator();
        contador = 0;
        System.out.println("\nInterando com WHILE");
        while (iteraLista.hasNext()){
            System.out.println("Na posição "+ contador + " da lista está o nome >>> " + iteraLista.next());
            contador++;
        }

        System.out.println("O próximo cliente é " + filaDoBanco.peek());// .peek apenas ESPIA, não tira o elemento da lista

        String proximoCliente = filaDoBanco.poll();
        System.out.println("O próximo cliente é " + proximoCliente + "\nOs clientes seguintes são :" + filaDoBanco);

        filaDoBanco.add("Daniel");
        iteraLista = filaDoBanco.iterator(); //preparando os elementos pra usar no while pra procurar Daniel
        contador = 0; //preparando os elementos pra procurar daniel no while

        // Não encontrei um método como index.of, por isso usei o while
        while (iteraLista.hasNext()){
            String caminhaPelaFila = iteraLista.next();
            if (caminhaPelaFila == "Daniel") {
                System.out.println("Daniel está na posição " + contador);
            }
            contador++;
        }

        System.out.println("O tamanho da lista é " + filaDoBanco.size());

        System.out.println("A lista está vazia? A resposta é " + filaDoBanco.isEmpty());

        System.out.println("Carlos está na fila do banco? A resposta é " + filaDoBanco.contains("Carlos"));

        filaDoBanco.clear();

        System.out.println("A fila do banco está vazia agora? A resposta é " + filaDoBanco.isEmpty());

    }
}
