package exerciciosDatas;

import java.time.LocalDateTime;

public class adicionaTempo {
    public static void main (String[] args){
        LocalDateTime horaAtual = LocalDateTime.now();
        LocalDateTime diaEspeficifico = LocalDateTime.of(2010,5,15,10,0,0);

        System.out.println(horaAtual);

        LocalDateTime futuro = diaEspeficifico.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(diaEspeficifico);
        System.out.println(futuro);
    }
}
