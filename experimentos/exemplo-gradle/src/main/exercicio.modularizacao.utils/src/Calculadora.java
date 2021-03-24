import internals.FazDivisao;
import internals.FazMultpicacao;
import internals.FazSoma;
import internals.FazSubtracao;

public class Calculadora {
    private FazSoma fazSoma;
    private FazSubtracao fazSubtracao;
    private FazDivisao fazDivisao;
    private FazMultpicacao fazMultpicacao;

    public Calculadora(){
        fazSoma = new FazSoma();
        fazSubtracao = new FazSubtracao();
        fazDivisao = new FazDivisao();
        fazMultpicacao = new FazMultpicacao();
    }

    public int soma (int a, int b){
        return fazSoma.execute(a, b);
    }

    public int subtracao (int a, int b){
        return fazSubtracao.execute(a, b);
    }

    public int divisao (int a, int b){
        return fazDivisao.execute(a, b);
    }

    public int multiplicacao (int a, int b){
        return fazMultpicacao.execute(a, b);
    }
}
