package Modelo;

public class Clique extends absPropriedade
{

    public Clique(int count, int countadd)
    {
        super(count, countadd);
    }

    public void executar()
    {
        if (this.countadd ==0)
            this.countadd = 1;
        this.count = this.count + this.countadd;
        this.toString();
    }
}
