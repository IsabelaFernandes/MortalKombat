/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mkombat;

/**
 *
 * @author root
 */
public class LutaReptileKitana {
    private String cenario;
    private Reptile personagem1;
    private Kitana personagem2;
    
    //Os danos cauados na luta
    private Integer dano;
    private Integer danocombo1;
    private Integer danocombo2;

    public Integer getDanocombo1() {
        return danocombo1;
    }

    public void setDanocombo1(Integer danocombo1) {
        this.danocombo1 = danocombo1;
    }

    public Integer getDanocombo2() {
        return danocombo2;
    }

    public void setDanocombo2(Integer danocombo2) {
        this.danocombo2 = danocombo2;
    }
    

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public Reptile getPersonagem1() {
        return personagem1;
    }

    public void setPersonagem1(Reptile personagem1) {
        this.personagem1 = personagem1;
    }

    public Kitana getPersonagem2() {
        return personagem2;
    }

    public void setPersonagem2(Kitana personagem2) {
        this.personagem2 = personagem2;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDanocombo() {
        return danocombo1;
    }

    public void setDanocombo(Integer danocombo1) {
        this.danocombo1 = danocombo1;
    }

    //Construtor
    public LutaReptileKitana()
    {
        this.cenario = "Caverna";
        this.personagem1 = new Reptile();
        this.personagem2 = new Kitana();
        this.dano = 5;
        this.danocombo1 = 20;
        this.danocombo2 = 25;
    }
    
    
    /*
        recebe como parâmetro o lutador que ACERTOU o golpe
        deve tirar vida do que foi acertado, considerando o
        dano que foiestipulado na classe
        Se lutador = p1 tira vida do p2
        
    */
    public boolean AcertaGolpe(String lutador)
    {
        
        if(lutador.equals("p1"))
        {
        //Tira vida do personagem 2 considerando dano normal
            this.personagem2.setVida((this.personagem2.getVida()-this.dano));
        }
        else
        {
            this.personagem1.setVida((this.personagem1.getVida()-this.dano));
        }  
        return false;
        
    }
    
    public boolean AcertaCombo(String lutador)
    {
        if(lutador.equals("p1"))
        {
        //Tira vida do personagem 2 considerando dano normal
            this.personagem2.setVida((this.personagem2.getVida()-this.danocombo1));
        }
        else
        {
            this.personagem1.setVida((this.personagem1.getVida()-this.danocombo1));
        }
        return false;
    }
    public boolean AcertaCombo2(String lutador)
    {
        if(lutador.equals("p1"))
        {
        //Tira vida do personagem 2 considerando dano normal
            this.personagem2.setVida((this.personagem2.getVida()-this.danocombo2));
        }
        else
        {
            this.personagem1.setVida((this.personagem1.getVida()-this.danocombo2));
        }
        return false;
    }
    
    
}
