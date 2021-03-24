import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AbreviaPalavra{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fraseEntrada = new ArrayList<>();
        Map<Character, String> palavrasEscolhidas = new TreeMap<>();
        int quantidadeDeCaracteresNovaPalavra;
        int quantidadeDeAparicoesNovaPalavra;
        int quantidadeDeCaracteresPalavraAtual;
        int quantidadeDeAparicoesPalavraAtual;
        String fraseMontada = "";
        String palavraAtual = "";

        while (!".".equals(br.readLine())){
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()){ //Recebe a frase
                fraseEntrada.add(st.nextToken());//separando a entrada em pedaços menores
            }

            for (String palavra: fraseEntrada){
                quantidadeDeCaracteresNovaPalavra = palavra.length();
                quantidadeDeAparicoesNovaPalavra = Collections.frequency(fraseEntrada, palavra);

                if (quantidadeDeCaracteresNovaPalavra > 2) {//verificando o criterio de tamanho que o exercicio pede
                    if (palavrasEscolhidas.isEmpty()) {//se palavrasEscolhidas estiver vazia pode receber a primeira palavra sem fazer a validação
                        palavrasEscolhidas.put(palavra.charAt(0), palavra);
                    } else {// se a lista não estiver vazia é preciso uma validação pra aumentar a lista palavrasEscolhidas
                        if (palavrasEscolhidas.containsKey(palavra.charAt(0))) {
                            palavraAtual = palavrasEscolhidas.get(palavra.charAt(0));

                            quantidadeDeCaracteresPalavraAtual = palavraAtual.length();// <<<isso tá errado
                            quantidadeDeAparicoesPalavraAtual = Collections.frequency(fraseEntrada, palavraAtual);

                            //Se a nova palavra economiza mais palavras que a antiga a velha é removida e a nova adicionada
                            // se não nada acontece
                            if(((quantidadeDeCaracteresNovaPalavra - 2) * quantidadeDeAparicoesNovaPalavra) >
                                    (quantidadeDeCaracteresPalavraAtual -2) * quantidadeDeAparicoesPalavraAtual){

                                palavrasEscolhidas.remove(palavra.charAt(0));
                                palavrasEscolhidas.put(palavra.charAt(0), palavra);
                            }

                        } else {
                            palavrasEscolhidas.put(palavra.charAt(0), palavra);
                        }
                    }
                }
            }

            // montando frase de saída
            for (var i = 0; i < fraseEntrada.size(); i++){
                if (i < fraseEntrada.size() -1){
                    if (palavrasEscolhidas.containsValue(fraseEntrada.get(i))){
                        fraseMontada = fraseMontada.concat(fraseEntrada.get(i).charAt(0) + ". ");
                    } else {
                        fraseMontada = fraseMontada.concat(fraseEntrada.get(i) + " ");
                    }
                } else {
                    fraseMontada = fraseMontada.concat(fraseEntrada.get(i));
                }
            }

            System.out.println(fraseMontada + "\n" + palavrasEscolhidas.size());
            for (Map.Entry<Character, String> saida : palavrasEscolhidas.entrySet()){
                System.out.println(saida.getKey() + ". = " + saida.getValue());
            }
            fraseMontada = ""; // zerando a rodada anterior
            palavrasEscolhidas.clear();//limpando o map
        }
    }
}

