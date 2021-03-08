package exercicios;

public class Porto {
    public static void main (String[] args){
        Barco barco = new Barco();
        System.out.println(barco.qualOTipo());

        System.out.println(mare());
    }

    public static String mare() {
        int rand = (int) (Math.random()*10);
        if (rand < 5){
            return "A maré está baixa";
        } else {
            return "A maré está alta";
        }
    }
}