package exercicioHeranca;

public class Empresa {
    public static void main (String[] args){
        Gerente gerente = new Gerente ("Pedro", 2000.0);
        Supervisor supervisor = new Supervisor ("Tiago", 2000.0);
        Caixa caixa = new Caixa ("Mateus", 2000.0);

        System.out.println("O imposto que o gerente paga é "+ gerente.imposto() + " reais");
        System.out.println("O imposto que o supervisor paga é "+ supervisor.imposto() + " reais");
        System.out.println("O imposto que o caixa paga é "+ caixa.imposto() + " reais");
    }
}
