package Modelo;

public class Upgrades extends absPropriedade
{

    public Upgrades(int quantUpgrade, String tipoUpgrade, int count, int countadd)
    {
        super(quantUpgrade, tipoUpgrade, count, countadd);
    }

    public void executar()
    {
        //Inicio Codigo Upgrade1
                       
        if (this.countadd ==0)
                this.countadd = 1;
        
        if (this.tipoUpgrade == "Upgrade1")
            this.valorUpgrade = 1 * (int)Math.pow(2,(double)this.quantUpgrade); //Valor do Upgrade1
        
        if (this.tipoUpgrade == "Upgrade1" && this.count >= this.valorUpgrade)
        {
            this.count = count - valorUpgrade;
            this.countadd = this.countadd + 1;  //Quantidade que adiciona no click
            this.quantUpgrade++;
            this.toString();
        }
        //Fim Codigo Upgrade 1
        
        //Inicio Codigo Upgrade2
        
                
        if (this.countadd ==0)
                this.countadd = 1;
        
        if (this.tipoUpgrade == "Upgrade2")
            this.valorUpgrade = 10 * (int)Math.pow(2,(double)this.quantUpgrade); //Valor do Upgrade2
        
        if (this.tipoUpgrade == "Upgrade2" && this.count >= this.valorUpgrade)
        {
            this.count = count - valorUpgrade;
            this.countadd = this.countadd + 10;  //Quantidade que adiciona no click
            this.quantUpgrade++;
            this.toString();
        }
        //Fim Codigo Upgrade 2
        
        else
        {
            this.toString();
        }
    }
}
