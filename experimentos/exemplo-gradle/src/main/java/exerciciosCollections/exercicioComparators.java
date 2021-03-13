package exerciciosCollections;

//Usando comparators para organizar(to sort) uma TreeMap
import java.util.*;

// Custom class
class Estudante {

    private String nomeDoEstudante;
    private int notaDoEstudante;

    public Estudante(String nomeDoEstudante, Integer notaDoEstudante)
    {
        this.nomeDoEstudante = nomeDoEstudante;
        this.notaDoEstudante = notaDoEstudante;
    }

    public String getNomeDoEstudante() { return this.nomeDoEstudante; }

    public Integer getNotaDoEstudante() { return this.notaDoEstudante; }
    // override toString method
    public String toString()
    {
        return this.nomeDoEstudante + ": " + notaDoEstudante;
    }
}

// Comparator that sort elements according to notaDoEstudante in
// Accending order
class OrganizaPorNotas implements Comparator<Estudante> {
    public int compare(Estudante s1, Estudante s2)
    {
        return s1.getNomeDoEstudante().compareTo(s2.getNomeDoEstudante());
        //Aqui é onde a organização ocorre, se for usado getNomeDoEstudante é por ordem alfabetica
        //se for usado getNotaDoEstudante é por valor da nota
    }
}

// Driver Code
public class exercicioComparators {
    public static void main(String[] args)
    {

        // New TreeMap of custom class Estudante
        TreeMap<Estudante, Integer> listaDeEstudantes = new TreeMap<>(new OrganizaPorNotas());

        // Add elementos no TreeMap
        listaDeEstudantes.put(new Estudante("Marcos", 400), 1);
        listaDeEstudantes.put(new Estudante("Bela", 500), 2);
        listaDeEstudantes.put(new Estudante("João", 300), 3);


        //MODIFIQUEI PARA ORGANIZAR POR ORDEM ALFABETICA
        System.out.println("TreeMap keys sorting in Accending order of the notaDoEstudante:");

        // Print map using Entry
        for (Map.Entry<Estudante, Integer> entry : listaDeEstudantes.entrySet()) {
            System.out.println("Key : (" + entry.getKey()
                    + "), Value : "
                    + entry.getValue());
        }
    }
}
