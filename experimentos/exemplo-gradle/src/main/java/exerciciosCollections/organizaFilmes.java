package exerciciosCollections;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class organizaFilmes {
    public static void main(String[] args) {
        List<Filmes> listaFilmes = new ArrayList<>();

        Filmes filme1 = new Filmes("Matrix", 9.5, 4);
        Filmes filme2 = new Filmes("Velozes e Furioso", 3.5, 17);
        Filmes filme3 = new Filmes("Cats", 1.2, 849);
        Filmes filme4 = new Filmes("Titanic", 9.0, 4);
        Filmes filme5 = new Filmes("5 centimentos por segundo", 10.0, 90);

        listaFilmes.add(filme1);
        listaFilmes.add(filme2);
        listaFilmes.add(filme3);
        listaFilmes.add(filme4);
        listaFilmes.add(filme5);


        System.out.println("Antes de organizar");
        for (Filmes informacoesFilme: listaFilmes){
            System.out.println("Filme: "+informacoesFilme.getNomeFilme() +" Nota: "+ informacoesFilme.getNotaFilme() +" Ranking: "+ informacoesFilme.getRankingFilme());
        }

        Collections.sort(listaFilmes);

        System.out.println("\nDepois de organizar");
        for (Filmes informacoesFilme: listaFilmes){
            System.out.println("Filme: "+informacoesFilme.getNomeFilme() +" Nota: "+ informacoesFilme.getNotaFilme() +" Ranking: "+ informacoesFilme.getRankingFilme());
        }

        System.out.println(listaFilmes.toString());
    }
}
