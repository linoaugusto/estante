using System;
using System.Collections.Generic;
using Desafio.Series.Interfaces;
using System.Linq;


namespace Desafio.Series
{
    public class SerieRepositorio : IRepositorio<Series>
    {

        protected List<Series> listaSerie = new List<Series>();
        protected List<int> indicePalavrasEncontradas = new List<int>();
        public void Atualiza(int id, Series objeto)
        {
            listaSerie[id] = objeto;
        }


        public void Exclui(int id)
        {
            listaSerie[id].Excluir();
        }

        public void Insere(Series objeto)
        {
            listaSerie.Add(objeto);
        }

        public List<Series> Lista()
        {
            return listaSerie;
        }

        public List<Series> OrganizaSeriesPorTitulo()
        {
            listaSerie.Sort(delegate(Series x, Series y) {
            return x.acessaTitulo.CompareTo(y.acessaTitulo);
            });
            return listaSerie; 
        }
        public List<Series> OrganizaSeriesPorId()
        {
            listaSerie.Sort(delegate(Series x, Series y) {
            return x.Id.CompareTo(y.Id);
            });            
            return listaSerie; 
        }
        public List<Series> OrganizaSeriesPorAno()
        {
            listaSerie.Sort(delegate(Series x, Series y) {
            return x.acessaAno.CompareTo(y.acessaAno);
            });            
            return listaSerie; 
        }

        public int ProximoId()
        {
            return listaSerie.Count;
        }

        public Series RetornaPorId(int id)
        {
            return listaSerie[id];
        }
        public List<int> BuscaPalavra(string palavra)
        {
            indicePalavrasEncontradas.Clear();

            foreach (var item in listaSerie)
            {
                if (item.acessaTitulo.Contains(palavra))
                {
                    indicePalavrasEncontradas.Add(item.Id);
                }
            }
            return indicePalavrasEncontradas;
        }

    }
}