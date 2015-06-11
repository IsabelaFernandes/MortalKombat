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
public class Scorpion {
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
    public Scorpion()
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
    public String spear()
    {
        return "atrás, atrás, "+socobaixo;
    };
    
    public String teleport_punch()
    {
        return "baixo, atrás, "+socoalto;  
    };
    
    public String flying_punch()
    {
        return "baixo, frente, "+socoalto;
    };
    
    public String air_throw()
    {
      return "defesa quando o outro personagem estiver em um pulo";  
    };
    

    
    
    //-----------Combos----------
    public String combo1()
    {
      return chutealto + ", " + chutealto + ", baixo, " + chutealto;   
    };
    
    public String combo2()
    {
        return socoalto + ", " + socoalto + ", " + chutealto + ", " + chutealto + ", baixo," + chutealto;
    };
    
    public String combo3()
    {
        return chutebaixo + ", " + chutebaixo + ", " + chutebaixo + ", " + chutebaixo;
       
    }
    
    //----------Fatality---------
    
    public String fatality1()
    {
        return "Defesa, cima,cima \t (A distância de um pulo do inimigo)";
    };
    public String fatality2()
    {
        return "cima, frente, baixo, atrás, atrás \t (A um abaixo do inimigo)";
    };
    
    //----------DLC's----------
     private String Airdeamon()
    {
        return "baixo, cima, frente, frente " + chutealto + socobaixo + ", baixo";
    };
}

