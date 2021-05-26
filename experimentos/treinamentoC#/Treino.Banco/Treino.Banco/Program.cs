using System;
using System.Collections.Generic;

namespace Treino.Banco
{
    class Program
    {
        static List<Conta> listContas =  new List<Conta>();
        static void Main(string[] args)
        {
            string opcaoUsuario = ObterOpcaoUsuario();

            while((opcaoUsuario.ToUpper() != "X")  && (opcaoUsuario.ToUpper() != "2"))
            {
                System.Console.WriteLine("\nERRO: Nenhuma conta cadastrada.\n\nPor favor, tente outra opção!\n");
                
                opcaoUsuario = ObterOpcaoUsuario();
            }

            while (opcaoUsuario.ToUpper() != "X")
            {
                switch (opcaoUsuario)
                {
                    case "1":
                        ListarConta();
                        break;
                    case "2":
                        InserirConta();
                        break;
                    case "3":
                        Transferir();
                        break;
                    case "4":
                        Sacar();
                        break;
                    case "5":
                        Depositar();
                        break;
                    case "6":
                        OrganizaContasPorNome();
                        break;
                    case "7":
                        OrganizaContasPorSaldo();
                        break;
                    case "C":
                        Console.Clear();
                        break;                
                   
                    default:
                        System.Console.WriteLine("Opção inválida!");
                        System.Console.WriteLine("Voltando ao menu!");
                        break;
                }
                opcaoUsuario = ObterOpcaoUsuario();
            }

            System.Console.WriteLine("Obrigado por usar nossos serviços!");
            Console.ReadLine();            
        }

        private static void Transferir()
        {
            System.Console.Write("Digite o Id da conta de origem: ");
            string entradaBrutaOrigem =  Console.ReadLine();

            int idContaOrigem = VerificaFormato(entradaBrutaOrigem);

            int indiceContaOrigem = BuscaIndiceConta(idContaOrigem);
            
            while(indiceContaOrigem == -1)
            {
                System.Console.WriteLine("\nERRO: O Id não existe.");
                System.Console.Write("Por favor, informe outro Id: ");
                entradaBrutaOrigem =  Console.ReadLine();

                idContaOrigem = VerificaFormato(entradaBrutaOrigem);

                indiceContaOrigem = BuscaIndiceConta(idContaOrigem);
            }

            System.Console.Write("Digite o número da conta de destino: ");
            string entradaBrutaDestino =  Console.ReadLine();

            int idContaDestino = VerificaFormato(entradaBrutaDestino);

            int indiceContaDestino = BuscaIndiceConta(idContaDestino);
            
            while(indiceContaDestino == -1)
            {
                System.Console.WriteLine("\nERRO:O Id não existe.");
                System.Console.Write("Por favor informe outro Id: ");
                entradaBrutaDestino =  Console.ReadLine();

                idContaDestino = VerificaFormato(entradaBrutaDestino);

                indiceContaDestino = BuscaIndiceConta(idContaDestino);
            }

            System.Console.Write("Digite o valor a ser transferido: ");
            string entradaValorTransferencia = Console.ReadLine();

            double valorTransferenciaValidado = validaValor(entradaValorTransferencia);

            listContas[indiceContaOrigem].Transferir(valorTransferenciaValidado, listContas[indiceContaDestino]);
        }

        private static void Depositar()
        {
            System.Console.Write("Digite o número da conta: ");
            string entradaBruta =  Console.ReadLine();

            int idConta = VerificaFormato(entradaBruta);

            int indiceConta = BuscaIndiceConta(idConta);

            while(indiceConta == -1)
            {
                System.Console.WriteLine("O Id não existe.");
                System.Console.Write("Pof favor, informe outro Id: ");
                entradaBruta =  Console.ReadLine();

                idConta = VerificaFormato(entradaBruta);

                indiceConta = BuscaIndiceConta(idConta);
            }

            System.Console.Write("Digite o valor a ser depositado: ");
            string entradaValorDeposito = Console.ReadLine();

            double valorDepositoValidado = validaValor(entradaValorDeposito);

            listContas[indiceConta].Depositar(valorDepositoValidado);
        }

        private static void Sacar()
        {
            System.Console.Write("Digite o Id da conta: ");
            string entradaBruta =  Console.ReadLine();

            int idConta = VerificaFormato(entradaBruta);

            int indiceConta = BuscaIndiceConta(idConta);

            while(indiceConta == -1)
            {
                System.Console.WriteLine("\nERRO: O Id não existe.");
                System.Console.Write("Por favor, informe outro Id: ");
                entradaBruta =  Console.ReadLine();

                idConta = VerificaFormato(entradaBruta);

                indiceConta = BuscaIndiceConta(idConta);
            }

            System.Console.Write("Digite o valor a ser sacado: ");
            string entradaValorSaque = Console.ReadLine();

            double valorSaqueValidado = validaValor(entradaValorSaque);

            listContas[indiceConta].Sacar(valorSaqueValidado);
        }

        private static void ListarConta()
        {
            System.Console.WriteLine("Listar contas");

            for (int i = 0; i < listContas.Count; i++)
            {
                Conta conta = listContas[i];
                System.Console.WriteLine(conta);
            }
        }

        private static void InserirConta()
        {
            System.Console.WriteLine("Insira uma nova conta");

            System.Console.Write("Digite um número para servir como Id da conta: ");
            string entradaBrutaId = Console.ReadLine();            

            int entradaId  = VerificaFormato(entradaBrutaId);
         
            while(BuscaIndiceConta(entradaId) != -1)
            {
                System.Console.WriteLine("\nERRO: O Id informado já está em uso.");
                System.Console.Write("Por favor, informe outro Id: ");
                entradaBrutaId = Console.ReadLine();            

                entradaId  = VerificaFormato(entradaBrutaId);

            }

            System.Console.Write("Digite 1 para Conta Física e 2 para Conta Júridica: ");
            string entradaTipoConta = Console.ReadLine();          

            int entradaTipoContaVerificada  = VerificaFormato(entradaTipoConta);

            while (entradaTipoContaVerificada !=1 && entradaTipoContaVerificada != 2)
            {
                System.Console.WriteLine("\nERRO: Opção inválida.");
                System.Console.Write("Digite 1 para Conta Física e 2 para Conta Júridica: ");                
                entradaTipoConta = Console.ReadLine();

                entradaTipoContaVerificada  = VerificaFormato(entradaTipoConta);
            }

            System.Console.Write("Digite o nome do cliente: ");
            string entradaNome = Console.ReadLine();

            System.Console.Write("Digite o saldo inicial: ");
            string entradaValorSaldo = Console.ReadLine();

            double valorSaldoValidado = validaValor(entradaValorSaldo);

            System.Console.Write("Digite o credito: ");
            string entradaValorCredito = Console.ReadLine();

            double valorCreditoValidado = validaValor(entradaValorCredito);

            Conta novaConta = new Conta(
                id: entradaId,
                tipoConta: (TipoConta)entradaTipoContaVerificada,
                saldo: valorSaldoValidado,
                credito: valorCreditoValidado,
                nome: entradaNome
            );

            listContas.Add(novaConta);
            OrganizaContasPorId();
        }

        private static List<Conta> OrganizaContasPorId()
        {
            listContas.Sort(delegate(Conta x, Conta y) {
            return x.acessaId.CompareTo(y.acessaId);
            });            
            return listContas; 
        }
        private static void OrganizaContasPorNome()
        {
            listContas.Sort(delegate(Conta x, Conta y) {
            return x.acessaNome.CompareTo(y.acessaNome);
            });

            ListarConta();
            OrganizaContasPorId(); 
        }
        private static void OrganizaContasPorSaldo()
        {
            listContas.Sort(delegate(Conta x, Conta y) {
            return y.acessaSaldo.CompareTo(x.acessaSaldo);
            });

            ListarConta();
            OrganizaContasPorId(); 
        }


        private static int BuscaIndiceConta(int id)
        {   
            int indiceConta = -1;
            for (int i = 0; i < listContas.Count; i++)
            {
                if(listContas[i].acessaId == id){
                    indiceConta = i;
                    return indiceConta;
                }

            }
            return indiceConta;
        }

        private static int VerificaFormato (string entradaBruta){
            
            int entradaValidada;

            bool formatoCorreto = Int32.TryParse (entradaBruta, out entradaValidada);

            while (!formatoCorreto)
            {
                System.Console.WriteLine("\nERRO: Formato inválido");
                System.Console.Write("Por favor, tente novamente: ");
                entradaBruta = Console.ReadLine();

                formatoCorreto = Int32.TryParse (entradaBruta, out entradaValidada);
            }

            return entradaValidada; 
        }
        
        private static double validaValor (string entradaBruta){
            
            double valorValidado;

            bool formatoCorreto = Double.TryParse (entradaBruta, out valorValidado);

            bool valorNegativo = valorValidado < 0;

            while (!formatoCorreto || valorNegativo)
            {
            
                if (!formatoCorreto)
                {
                    
                System.Console.WriteLine("\nERRO: Formato inválido.");
                System.Console.Write("Por favor, tente novamente: ");
                entradaBruta = Console.ReadLine();

                formatoCorreto = Double.TryParse (entradaBruta, out valorValidado);

                valorNegativo = valorValidado < 0;

                } else if(valorNegativo){
                    System.Console.WriteLine("\nERRO: Valor negativo.");
                    System.Console.Write("Por favor, tente novamente: ");
                    entradaBruta = Console.ReadLine();

                    formatoCorreto = Double.TryParse (entradaBruta, out valorValidado);

                    valorNegativo = valorValidado < 0;
                }

            }

            return valorValidado; 
        }

        private static string ObterOpcaoUsuario()
        {
            System.Console.WriteLine();
            System.Console.WriteLine("[[Sistema Bancário]]");
            System.Console.WriteLine("Informe a opção desejada:");

            System.Console.WriteLine("1- Listar contas por Id");
            System.Console.WriteLine("2- Inserir nova conta");
            System.Console.WriteLine("3- Transferir");
            System.Console.WriteLine("4- Sacar");
            System.Console.WriteLine("5- Depositar");
            System.Console.WriteLine("6- Listar contas por Nome");
            System.Console.WriteLine("7- Listar contas por Saldo");
            System.Console.WriteLine("C- Limpar tela");
            System.Console.WriteLine("X- Sair");
            System.Console.WriteLine();

            string opcaoUsuario = Console.ReadLine().ToUpper();
            System.Console.WriteLine();
            return opcaoUsuario;

        }
    }
}
