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
public class LutaReptileScorpion {
    private String cenario;
    private Reptile personagem1;
    private Scorpion personagem2;
    
    //Os danos cauados na luta
    private Integer dano;
    private Integer danocombo;

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

    public Scorpion getPersonagem2() {
        return personagem2;
    }

    public void setPersonagem2(Scorpion personagem2) {
        this.personagem2 = personagem2;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDanocombo() {
        return danocombo;
    }

    public void setDanocombo(Integer danocombo) {
        this.danocombo = danocombo;
    }

    //Construtor
    public LutaReptileScorpion()
    {
        this.cenario = "Caverna";
        this.personagem1 = new Reptile();
        this.personagem2 = new Scorpion();
        this.dano = 5;
        this.danocombo = 20;
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
            this.personagem2.setVida((this.personagem2.getVida()-this.danocombo));
        }
        else
        {
            this.personagem1.setVida((this.personagem1.getVida()-this.danocombo));
        }
        return false;
    }
    
    
}
