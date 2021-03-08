package exercicioHeranca;

public class Funcionario {
    protected String nome;
    protected Double salario;

    public Funcionario() {// construtor padrão
    }

    protected String  nomeFuncionario(){ //função/metodo simples
        return "Meu nome é "+ nome;
    }

    protected String trabalha() {
        return "Estou trabalhando";
    }

    protected Double imposto(){
        return salario * 0.1;
    }


}
