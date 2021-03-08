package exercicioCarros;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    public String variante;

   /* public Carro () {
        //Construtor que não exige parametros
    }; */

    public Carro (String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    };

    void infos (){
        System.out.println("As informações do carro são: \nMarca => "+ marca + "\n" +
                "Modelo => " + modelo + "\nAno => "+ ano + "\nVariante => "+ variante + "\n");
    };
}
