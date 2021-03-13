package exerciciosDatas;

import java.util.Calendar;

public class calculaDataDePagamento {
    public static void main (String[] args){
        Calendar dataAtual = Calendar.getInstance();

        dataPagamento (dataAtual);
    }

    public static void dataPagamento (Calendar dataAtual){
        Calendar dataPagamento = dataAtual;

        dataPagamento.add(Calendar.DATE, 10);

        if (dataPagamento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            dataPagamento.add(Calendar.DATE, 1);
            System.out.println("A data de pagamento caiu em um domingo e foi mudada para segunda-feira >> " + dataPagamento.getTime());

        } else if (dataPagamento.get(Calendar.DAY_OF_WEEK) < 7 ) {
                System.out.println("A data de pagamento é >> " + dataPagamento.getTime());

            //System.out.println(dataPagamento.getTime());
            } else if (dataPagamento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                dataPagamento.add(Calendar.DATE, 2);
                System.out.println("A data de pagamento caiu num sábado e foi mudada para segunda-feira >> " + dataPagamento.getTime());
        }
    }

}
