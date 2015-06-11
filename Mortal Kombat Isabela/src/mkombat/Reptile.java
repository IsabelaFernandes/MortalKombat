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
public class Reptile {
    //Atributos
    private String socoalto;
    private String socobaixo;
    private String chutealto;
    private String chutebaixo;
    private String defesa;
    private String agarra;
    private String especial;
    private Integer vida;
    
    
    public Integer getVida() {    
        return vida;
    }

    //Metedos Getter e Setter
    //GET e SET -- GET
    //Get = Pega(retorna) o valor do meu atributo
    //Set = Atribui um novo valor ao Atributo
    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getSocoalto() {
        return socoalto;
    }

    public void setSocoalto(String socoalto) {
        this.socoalto = socoalto;
    }

    public String getSocobaixo() {
        return socobaixo;
    }

    public void setSocobaixo(String socobaixo) {
        this.socobaixo = socobaixo;
    }

    public String getChutealto() {
        return chutealto;
    }

    public void setChutealto(String chutealto) {
        this.chutealto = chutealto;
    }

    public String getChutebaixo() {
        return chutebaixo;
    }

    public void setChutebaixo(String chutebaixo) {
        this.chutebaixo = chutebaixo;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }
    
    //Metodo Construtor
    public Reptile()
    {
        this.agarra = null;
        this.chutealto = null;
        this.chutebaixo = null;
        this.defesa = null;
        this.especial = null;
        this.socoalto = null;
        this.socobaixo = null;
        this.vida = 100;
    }
    
    
    
    //Métodos
    //-------------Golpes Especiais-----------
    public String acid_spit()
    {
        return "baixo, frente, "+socobaixo;
    };
    
    public String fast_forceball()
    {
        return "frente, frente, "+socobaixo;  
    };
    
    public String slow_forceball()
    {
        return "atrás, atrás, "+socobaixo;
    };
    
    public String slide()
    {
      return socobaixo + ", "+ chutebaixo;  
    };
    
    public String invisibility()
    {
        
        return "baixo, cima, "+chutealto; 
    };
    
    public String run_and_elbow()
    {
        return "atrás, frente, "+chutebaixo;
    }
    
    //-----------Combos----------
    public String combo1()
    {
      return chutealto + ", " + chutealto + ", Atrás, " + chutealto;   
    };
    
    public String combo2()
    {
        return socoalto + ", " + socoalto + ", " + socoalto + ", " + socoalto;
    };
    
    public String combo3()
    {
        return chutealto + ", " + chutealto + ", " + socoalto + ", " + socoalto + ", " + socoalto;
       
    }
    
    //----------Fatality---------
    
    public String fatality1()
    {
        return "baixo, cima \t (A um passo do inimigo)";
    };
    public String fatality2()
    {
        return "cima, cima, baixo, cima, atrás \t (A um passo do inimigo)";
    };
    
    //----------DLC's----------
     private String megatality()
    {
        return ", " + "cima, baixo, atrás, frente " + socoalto + socobaixo + ", frente";
    };
}

