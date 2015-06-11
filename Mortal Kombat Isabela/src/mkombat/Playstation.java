package mkombat;
public class Playstation {
    public static void main(String[] args) {
        //Criando a instância da classe(Objeto)
        Reptile pp1 = new Reptile();
        //Atribuindo valores aos atributos da classe
        
        pp1.setAgarra("R1");
        pp1.setChutebaixo("○");
        pp1.setChutealto("▲");
        pp1.setSocoalto("■");
        pp1.setSocobaixo("×");
        pp1.setDefesa("");
        pp1.setEspecial("L2 + R2");
        
        //exibir na tela os valores atribuidos
        System.out.println("\t-------Configuração dos Botões---------");
        System.out.println("\n");
        System.out.println("Agarra: \t"           +pp1.getAgarra());
        System.out.println("Soco Alto:  \t"        +pp1.getSocoalto());
        System.out.println("Soco Baixo: \t"       +pp1.getSocobaixo());
        System.out.println("Chute Alto: \t"       +pp1.getChutealto());
        System.out.println("Chute Baixo: \t"      +pp1.getChutebaixo());
        System.out.println("Defesa: \t"           +pp1.getDefesa());
        System.out.println("Especial: \t"         +pp1.getEspecial());
        System.out.println("\n");
        
        System.out.println("\t---------Comandos Especiais------------");
        System.out.println("\n");
        System.out.println("Ácido: \t\t\t"            +pp1.acid_spit());
        System.out.println("Fast Forceball: \t"   +pp1.fast_forceball());
        System.out.println("Slow Forceball: \t"   +pp1.slow_forceball());
        System.out.println("Slide: \t\t\t"            +pp1.slide());
        System.out.println("Invisivel: \t\t"        +pp1.invisibility());
        System.out.println("Run and Elbow: \t\t"    +pp1.run_and_elbow());
        System.out.println("\n");
        
        System.out.println("\t--------------Combos-------------------");
        System.out.println("\n");
        System.out.println("Combo 1: \t"          +pp1.combo1());
        System.out.println("Combo 2: \t"          +pp1.combo2());
        System.out.println("Combo 3: \t"          +pp1.combo3());
        System.out.println("\n");
        
        System.out.println("\t---------------FATALITY's-----------------");
        System.out.println("\n");
        System.out.println("Fatality 1: \t"       +pp1.fatality1());
        System.out.println("Fatality 2: \t"       +pp1.fatality2());
        System.out.println("\n");
        
        System.out.println("\t---------------DLC's-----------------");
        System.out.println("\n");
        
        Scorpion pp2 = new Scorpion();
        
        //Atribuindo valores aos atributos da classe
        
       
        pp2.setAgarra("R1");
        pp2.setChutebaixo("○");
        pp2.setChutealto("▲");
        pp2.setSocoalto("■");
        pp2.setSocobaixo("×");
        pp2.setDefesa("");
        pp2.setEspecial("L2 + R2");
        
        
        //exibir na tela os valores atribuidos
        System.out.println("\t-------Configuração dos Botões Scorpion---------");
        System.out.println("\n");
        System.out.println("Agarra: \t"           +pp2.getAgarra());
        System.out.println("Soco Alto:  \t"       +pp2.getSocoalto());
        System.out.println("Soco Baixo: \t"       +pp2.getSocobaixo());
        System.out.println("Chute Alto: \t"       +pp2.getChutealto());
        System.out.println("Chute Baixo: \t"      +pp2.getChutebaixo());
        System.out.println("Defesa: \t"           +pp2.getDefesa());
        System.out.println("Especial: \t"         +pp2.getEspecial());
        System.out.println("\n");
        
        System.out.println("\t---------Comandos Especiais Scorpion------------");
        System.out.println("\n");
        System.out.println("Spear: \t\t\t"            +pp2.spear());
        System.out.println("Teleport Punch: \t"       +pp2.teleport_punch());
        System.out.println("Flying Punch: \t\t"         +pp2.flying_punch());
        System.out.println("Air Throw: \t\t"        +pp2.air_throw());
        System.out.println("\n");
        
        System.out.println("\t--------------Combos Scorpion-------------------");
        System.out.println("\n");
        System.out.println("Combo 1: \t"          +pp2.combo1());
        System.out.println("Combo 2: \t"          +pp2.combo2());
        System.out.println("Combo 3: \t"          +pp2.combo3());
        System.out.println("\n");
        
        System.out.println("\t---------------FATALITY's Scorpion-----------------");
        System.out.println("\n");
        System.out.println("Fatality 1: \t"       +pp2.fatality1());
        System.out.println("Fatality 2: \t"       +pp2.fatality2());
        System.out.println("\n");
    
        System.out.println("\t---------------DLC's Scorpion-----------------");
        System.out.println("\n");
        
        Subzero pp3 = new Subzero();
        
        //Atribuindo valores aos atributos da classe
        
        pp3.setAgarra("R1");
        pp3.setChutebaixo("○");
        pp3.setChutealto("▲");
        pp3.setSocoalto("■");
        pp3.setSocobaixo("×");
        pp3.setDefesa("");
        pp3.setEspecial("L2 + R2");
        
        //exibir na tela os valores atribuidos
        System.out.println("\t-------Configuração dos Botões Subzero---------");
        System.out.println("\n");
        System.out.println("Agarra: \t"           +pp3.getAgarra());
        System.out.println("Soco Alto:  \t"       +pp3.getSocoalto());
        System.out.println("Soco Baixo: \t"       +pp3.getSocobaixo());
        System.out.println("Chute Alto: \t"       +pp3.getChutealto());
        System.out.println("Chute Baixo: \t"      +pp3.getChutebaixo());
        System.out.println("Defesa: \t"           +pp3.getDefesa());
        System.out.println("Especial: \t"         +pp3.getEspecial());
        System.out.println("\n");
        
        System.out.println("\t---------Comandos Especiais Subzero------------");
        System.out.println("\n");
        System.out.println("Freeze: \t\t\t"            +pp3.freeze());
        System.out.println("Slide: \t"       +pp3.slide());
        System.out.println("Ice Clone: \t\t"         +pp3.ice_clone());
        System.out.println("Ice Shower: \t\t"        +pp3.ice_shower());
        System.out.println("\n");
        
        System.out.println("\t--------------Combos Subzero-------------------");
        System.out.println("\n");
        System.out.println("Combo 1: \t"          +pp3.combo1());
        System.out.println("Combo 2: \t"          +pp3.combo2());
        System.out.println("\n");
        
        System.out.println("\t---------------FATALITY's Scorpion-----------------");
        System.out.println("\n");
        System.out.println("Fatality 1: \t"       +pp3.fatality1());
        System.out.println("Fatality 2: \t"       +pp3.fatality2());
        System.out.println("\n");
    
        System.out.println("\t---------------DLC's Scorpion-----------------");
        System.out.println("\n");
        
    }
    
}
