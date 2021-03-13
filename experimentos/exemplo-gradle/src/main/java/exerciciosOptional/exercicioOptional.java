package exerciciosOptional;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Optional;

public class exercicioOptional {
    public static void main(String[] args) {
        Optional<String> campoDeTesteOpitional = Optional.of("Está CHEIO");
        campoDeTesteOpitional.ifPresentOrElse(System.out::println, () -> System.out.println("Está VAZIO"));

        campoDeTesteOpitional = Optional.empty();//  <<<<<<< ESVAZIEI O CAMPO PRA PODER TESTAR A CONDICAO VAZIO
        campoDeTesteOpitional.ifPresentOrElse(System.out::println, () -> System.out.println("Está VAZIO"));

        campoDeTesteOpitional = Optional.of("Está CHEIO OUTRA VEZ");
        campoDeTesteOpitional.ifPresentOrElse(System.out::println, () -> System.out.println("Está VAZIO"));

        campoDeTesteOpitional = Optional.ofNullable(null); // Sem o .ofNullable DAH ERRO (NÃO USAR o .of)
        campoDeTesteOpitional.ifPresentOrElse(System.out::println, () -> System.out.println("Está VAZIO, verdade está NULL, mas é parecido"));


        campoDeTesteOpitional = Optional.of("Está CHEIO OUTRA VEZ");
        campoDeTesteOpitional = Optional.empty();

        //ESSE comando também não funciona no teste do tutor
        //System.out.println(campoDeTesteOpitional.orElseThrow(IllegalStateException::new));

        campoDeTesteOpitional = Optional.of("CEHIO");

        if (campoDeTesteOpitional.isPresent()){
            String conteudo = campoDeTesteOpitional.get();
            System.out.println(conteudo);
        }

    }
}
