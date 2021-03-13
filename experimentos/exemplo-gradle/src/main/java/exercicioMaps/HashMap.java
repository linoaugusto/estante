package exercicioMaps;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, String> estadoDoBrasil = new java.util.HashMap<>();

        estadoDoBrasil.put("AC", "Acre");
        estadoDoBrasil.put("AL", "Alagoas");
        estadoDoBrasil.put("AP", "Amapá");
        estadoDoBrasil.put("AM", "Amazonas");
        estadoDoBrasil.put("BA", "Bahia");
        estadoDoBrasil.put("CE", "Ceará");
        estadoDoBrasil.put("ES", "Espirito Santo");
        estadoDoBrasil.put("GO", "Goiás");
        estadoDoBrasil.put("MA", "Maranhão");
        estadoDoBrasil.put("MT", "Mato Grosso");
        estadoDoBrasil.put("MS", "Mato Groso do Sul");
        estadoDoBrasil.put("MG", "Minas Gerais");
        estadoDoBrasil.put("PA", "Pará");
        estadoDoBrasil.put("PB", "Paraíba");
        estadoDoBrasil.put("PR", "Paraná");
        estadoDoBrasil.put("PE", "Pernambuco");
        estadoDoBrasil.put("PI", "Piaui");
        estadoDoBrasil.put("RR", "Roraima");
        estadoDoBrasil.put("Rondonia", "Rondonia");
        estadoDoBrasil.put("RJ", "Rio de Janeiro");
        estadoDoBrasil.put("RN", "Rio Grande do Norte");
        estadoDoBrasil.put("RS", "Rio Grande do Sul");
        estadoDoBrasil.put("SC", "Santa Catarina");
        estadoDoBrasil.put("SP", "São Paulo");
        estadoDoBrasil.put("SE", "Sergipe");
        estadoDoBrasil.put("TO", "Tocantins");

        System.out.println(estadoDoBrasil);

        estadoDoBrasil.remove("MG");

        System.out.println(estadoDoBrasil);

        estadoDoBrasil.put("DF", "Distrito Federal");

        System.out.println(estadoDoBrasil);

        System.out.println("O tamanho da estrutura MAP é " + estadoDoBrasil.size());

        estadoDoBrasil.remove("MS");

        //Esse é o for each do MAP
        for (Map.Entry<String, String> estados : estadoDoBrasil.entrySet()){
            System.out.println(estados.getValue()+" (" + estados.getKey() + ")");
        }

        System.out.println("O HashMap contém SC? A resposta é " + estadoDoBrasil.containsKey("SC"));

        System.out.println("O HashMap contém Maranhão? A resposta é " + estadoDoBrasil.containsValue("Maranhão"));
    }
}
