using System.Collections.Generic;

namespace Desafio.Series.Interfaces
{
    public interface IRepositorio<T>
    {
         List<T> Lista();
         T RetornaPorId(int id);

         List<int> BuscaPalavra(string palavra);

         void Insere(T entidade);

         void Exclui(int id);

         void Atualiza(int id, T entidade);

         int ProximoId();

         List<T> OrganizaSeriesPorTitulo();

         List<T> OrganizaSeriesPorId();

         List<T> OrganizaSeriesPorAno();
    }
}