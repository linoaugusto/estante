package desafiosDioEtapaUm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class multiplicacaoDio {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int total = 0; // Altere o valor da variável com o cálculo esperado
            total = a*b;
            System.out.println("PROD = " + total);
    }
}
