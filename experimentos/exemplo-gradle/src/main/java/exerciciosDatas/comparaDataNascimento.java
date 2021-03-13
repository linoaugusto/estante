package exerciciosDatas;

import java.util.Date;

public class comparaDataNascimento {
    public static void main (String[] args){
        long horarioNascimentoInMillis = 608612400000L;
        long horarioParaCompararInMillis= 1273892400000L;

        Date horarioNascimentoDate = new Date(horarioNascimentoInMillis);
        Date horarioParaConpararDate = new Date(horarioParaCompararInMillis);

        System.out.println(horarioNascimentoDate);
        System.out.println(horarioParaConpararDate);

        boolean ehAntes = horarioNascimentoDate.before(horarioParaConpararDate);
        boolean ehDepois = horarioNascimentoDate.after(horarioParaConpararDate);

        if (ehAntes) {
            System.out.println("O .before gerou um boolean " + ehAntes + " portanto a data de nascimento É anterior a data a comparar");
        } else{
            System.out.println("O .before gerou um boolean " + ehAntes + " portanto a data de nascimento NÃO É anterior a data a comparar");
        }

        if (ehDepois) {
            System.out.println("O .after gerou um boolean " + ehDepois + " portanto a data de nascimento É posterior a data a comparar");
        } else{
            System.out.println("O .after gerou um boolean " + ehDepois + " portanto a data de nascimento NÃO É posterior a data a comparar");
        }
    }
}
