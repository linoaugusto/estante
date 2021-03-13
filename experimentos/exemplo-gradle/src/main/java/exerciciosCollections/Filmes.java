package exerciciosCollections;

import java.util.Objects;

public class Filmes implements Comparable<Filmes>{
    private String nomeFilme;
    private Double notaFilme;
    private Integer rankingFilme;

    public Filmes(String nomeFilme, Double notaFilme, Integer rankingFilme) {
        this.nomeFilme = nomeFilme;
        this.notaFilme = notaFilme;
        this.rankingFilme = rankingFilme;
    }

    @Override //É importante sobrescrever o toString para assegurar a correta impressao dos objetos complexos como esse
    public String toString() {
        return String.format("Filme: " + this.nomeFilme + " Rank: " + this.rankingFilme + " Nota: " + this.notaFilme + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filmes filmes = (Filmes) o;
        return Objects.equals(nomeFilme, filmes.nomeFilme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeFilme);
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public Double getNotaFilme() {
        return notaFilme;
    }

    public void setNotaFilme(Double notaFilme) {
        this.notaFilme = notaFilme;
    }

    public Integer getRankingFilme() {
        return rankingFilme;
    }

    public void setRankingFilme(Integer rankingFilme) {
        this.rankingFilme = rankingFilme;
    }

    @Override
    public int compareTo(Filmes outroFilme) {
        return this.nomeFilme.compareTo(outroFilme.getNomeFilme());//organiza por nome
        //return this.notaFilme.compareTo(outroFilme.getNotaFilme());//organiza por nota
    }
}
