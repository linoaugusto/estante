package exercicioHeranca;

public class Caixa extends Funcionario{
    protected Caixa(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public Double imposto(){
        System.out.println(nomeFuncionario());
        System.out.println(trabalha());
        return salario * 0.001;
    }

}
