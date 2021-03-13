package exerciciosDatas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class formataDataAtual {
    public static void main (String[] args) {
        Date dataAtual = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mmm");

        String dataFormatada = formato.format(dataAtual);

        System.out.println("A data atual é: " + dataFormatada);
    }
}
