using System;
using System.Collections.Generic;
using System.Linq;


namespace Desafio.Series
{
    class Program
    {
        static SerieRepositorio repositorio = new SerieRepositorio();
        static List<int> indicePalavrasEncontradas = new List<int>();
        
        static void Main(string[] args)
        {
            string opcaoUsuario = ObterOpcaoUsuario();

            while(opcaoUsuario.ToUpper() != "X" )
            {
                switch (opcaoUsuario)
                {
                    case "1":
                        ListarSeries();
                        break;
                    case "2":
                        InserirSeries();
                        break;
                    case "3":
                        AtualizarSerie();
                        break;
                    case "4":
                        ExcluirSerie();
                        break;
                    case "5":
                        VisualizarSerie();
                        break;
                    case "6":
                        OrganizarSeriesPorTitulo();
                        break;
                    case "7":
                        OrganizarSeriesPorAno();
                        break;
                    case "8":
                        BuscarSerie();
                        break;
                    case "C":
                        Console.Clear();
                        break;

                    default:
                        throw new ArgumentOutOfRangeException();
                }

                opcaoUsuario = ObterOpcaoUsuario();    
            }

            System.Console.WriteLine("Obrigado por utilizar nossos serviços!");
            Console.ReadLine();
        }

        private static void ListarSeries()
        {
            System.Console.WriteLine("Listar séries");

            var lista = repositorio.Lista();

            if (lista.Count == 0)
            {
                System.Console.WriteLine("Nenhuma série cadastrada.");
                return;
            }

            foreach(var serie in lista)
            {
                var excluido = serie.retornaExcluido();
                Console.WriteLine("#ID: {0} - Título: {1} - Ano:{2} - Estado: {3}", serie.retornaId(), serie.retornaTitulo(), serie.retornaAno(), (excluido ? "Excluido" : ""));
            }
        }
        private static void InserirSeries()
        {
            System.Console.WriteLine("Inserir nova série");

            foreach (int i in Enum.GetValues(typeof(Genero)))
            {
                System.Console.WriteLine("{0} - {1}", i, Enum.GetName(typeof(Genero), i));
            }

            System.Console.WriteLine("Digite o Gênero entre as opções acima: ");
            int entradaGenero =  int.Parse(Console.ReadLine());

            System.Console.WriteLine("Digite o Título da série");
            string entradaTitulo = Console.ReadLine();

            System.Console.WriteLine("Digite o Ano de início da série");
            int entradaAno =  int.Parse(Console.ReadLine());

            System.Console.WriteLine("Digite a Descrição da série");
            string entradaDescricao = Console.ReadLine();

            Series novaSerie = new Series(
                id: repositorio.ProximoId(),
                genero: (Genero)entradaGenero,
                titulo: entradaTitulo,
                ano: entradaAno,
                descricao: entradaDescricao
                );

            repositorio.Insere(novaSerie);
        }

        private static void AtualizarSerie()
        {
            System.Console.WriteLine("Digite o Id da série");
            int indiceSerie = int.Parse(Console.ReadLine());

            foreach (int i in Enum.GetValues(typeof(Genero)))
            {
                System.Console.WriteLine("{0} - {1}", i, Enum.GetName(typeof(Genero), i));
            }

            System.Console.WriteLine("Digite o Gênero entre as opções acima: ");
            int entradaGenero =  int.Parse(Console.ReadLine());

            System.Console.WriteLine("Digite o Título da série");
            string entradaTitulo = Console.ReadLine();

            System.Console.WriteLine("Digite o Ano de início da série");
            int entradaAno =  int.Parse(Console.ReadLine());

            System.Console.WriteLine("Digite a Descrição da série");
            string entradaDescricao = Console.ReadLine();

            Series atualizaSerie = new Series(
                id: indiceSerie,
                genero: (Genero)entradaGenero,
                titulo: entradaTitulo,
                ano: entradaAno,
                descricao: entradaDescricao
                );

            repositorio.Atualiza(indiceSerie, atualizaSerie);
        }

        private static void ExcluirSerie()
        {
            System.Console.WriteLine("Digite o id da série:");
            int indiceSerie = int.Parse(Console.ReadLine());

            repositorio.Exclui(indiceSerie);
        }

        private static void VisualizarSerie()
        {
            System.Console.WriteLine("Digite o id da série:");
            int indiceSerie = int.Parse(Console.ReadLine());

            var serie = repositorio.RetornaPorId(indiceSerie);

            System.Console.WriteLine(serie);
        }

        private static void BuscarSerie()
        {
            System.Console.WriteLine("Digite uma palavra presente no título da série");
            string palavraChave = Console.ReadLine();

            var indicePalavrasEncontradas = repositorio.BuscaPalavra(palavraChave);

            if (indicePalavrasEncontradas.Count == 0)
            {
                System.Console.WriteLine("Nenhuma série com a palavra >{0}< foi encontrada", palavraChave);
                return;
            }
            
            System.Console.WriteLine("Séries encontradas:");
            foreach (var item in indicePalavrasEncontradas)
            {
                var serie = repositorio.RetornaPorId(item);
                System.Console.WriteLine("ID: {0} - Título: {1}", serie.Id, serie.acessaTitulo);
            }
        }

        private static void OrganizarSeriesPorTitulo()
        {
            repositorio.OrganizaSeriesPorTitulo();
            ListarSeries();
            repositorio.OrganizaSeriesPorId();
        }

        private static void OrganizarSeriesPorAno()
        {
            repositorio.OrganizaSeriesPorAno();
            ListarSeries();
            repositorio.OrganizaSeriesPorId();
        }
     
        private static string ObterOpcaoUsuario(){

            System.Console.WriteLine();
            System.Console.WriteLine("Gerenciador de Séries v.0.1 Funcionando");
            System.Console.WriteLine("Informe a opção desejada:");

            System.Console.WriteLine("1- Listar séries por Id");
            System.Console.WriteLine("2- Inserir no série");
            System.Console.WriteLine("3- Atualizar série");
            System.Console.WriteLine("4- Excluir série");
            System.Console.WriteLine("5- Visualizar série");
            System.Console.WriteLine("6- Listar séries em ordem alfabética ");
            System.Console.WriteLine("7- Listar séries em ordem crescente por ano");
            System.Console.WriteLine("8- Buscar séries por Título");
            System.Console.WriteLine("C- Limpar tela");
            System.Console.WriteLine("X- Sair");
            System.Console.WriteLine();

            string opcaoUsuario =  Console.ReadLine().ToUpper();
            Console.WriteLine();
            return opcaoUsuario;
        }
    }
}
