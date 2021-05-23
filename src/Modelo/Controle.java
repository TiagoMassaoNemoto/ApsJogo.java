package Modelo;

public class Controle extends absPropriedade
{

    public Controle(int count, int countadd)
    {
        super(count, countadd);
    }
    
    public void executar()
    {
        Clique clique = new Clique(this.count, this.countadd);
        this.count = clique.count;
        this.ponto = clique.ponto;
    }
}
