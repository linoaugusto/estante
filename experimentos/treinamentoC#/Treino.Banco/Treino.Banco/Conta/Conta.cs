namespace Treino.Banco
{
    public class Conta
    {   
        private int Id { get; set; }
        private TipoConta TipoConta { get; set; }
        private double Saldo { get; set; }
        private double Credito { get; set; }
        private string Nome { get; set; }

        public Conta (int id, TipoConta tipoConta, double saldo, double credito, string nome)
        {
            this.Id = id;
            this.TipoConta = tipoConta;
            this.Saldo = saldo;
            this.Credito = credito;
            this.Nome = nome;

        }        

        public bool Sacar (double valorSaque)
        {
            if((this.Saldo - valorSaque) < (this.Credito*-1)){
                System.Console.WriteLine("Saldo Insuficiente");
                return false;
            }

            this.Saldo -= valorSaque;
            System.Console.WriteLine("Saldo atual da conta é de {0} é {1}", this.Nome, this.Saldo);
            return true;
        }

        public void Depositar(double valorDeposito)
        {
            this.Saldo += valorDeposito;
            System.Console.WriteLine("O saldo atual da conta de {0} é {1}", this.Nome, this.Saldo);
        }

        public void Transferir(double valorTransferencia, Conta contaDestino)
        {
            if(this.Sacar(valorTransferencia)){
                contaDestino.Depositar(valorTransferencia);
            }
        }

        public int acessaId {
            get {return Id;}
        }
        public double acessaSaldo {
            get {return Saldo;}
        }
        public string acessaNome {
            get {return Nome;}
        }
        public TipoConta acessaTipoConta {
            get {return TipoConta;}
        }

        public override string ToString()
        {
            string retorno = "";
            retorno += "Id: " + this.Id + " | ";
            retorno += "TipoConta: " + this.TipoConta + " | ";
            retorno += "Nome: " + this.Nome + " | ";
            retorno += "Saldo: " + this.Saldo + " | ";
            retorno += "Crédito: " + this.Credito;
            return retorno;
        }
    }
}