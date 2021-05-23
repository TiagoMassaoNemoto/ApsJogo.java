package Modelo;

import Apresentação.frmJogo;

public abstract class absPropriedade implements intMetodos
{
    
    public int valorUpgrade;
    public int count;
    public int estagio;
    public String ponto;
    public int countadd;
    public int quantUpgrade;
    public int countUpgrade;
    public String tipoUpgrade;
    
    

    public absPropriedade(int count, int countadd)
    {
        this.count = count;
        this.countadd = countadd;
        executar();
    }

    public absPropriedade(int quantUpgrade, String tipoUpgrade, int count, int countadd)
    {
        this.quantUpgrade = quantUpgrade;
        this.tipoUpgrade = tipoUpgrade;
        this.count = count;
        this.countadd = countadd;
        executar();
    }

    
    
    public String toString()
    {
        return this.ponto = "Moedas:" + this.count;
    }
    
    @Override
    public abstract void executar();
    
}
