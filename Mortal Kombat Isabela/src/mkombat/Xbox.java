package mkombat;
public class Xbox {
    public static void main(String[] args) {
        //Criando a instância da classe(Objeto)
        Reptile p1 = new Reptile();
        //Atribuindo valores aos atributos da classe
        
       
        p1.setAgarra("LT");
        p1.setChutebaixo("B");
        p1.setChutealto("Y");
        p1.setSocoalto("X");
        p1.setSocobaixo("A");
        p1.setDefesa("RT");
        p1.setEspecial("LB + RB");
        
        
        //exibir na tela os valores atribuidos
        System.out.println("\t-------Configuração dos Botões Reptile---------");
        System.out.println("\n");
        System.out.println("Agarra: \t"           +p1.getAgarra());
        System.out.println("Soco Alto:  \t"        +p1.getSocoalto());
        System.out.println("Soco Baixo: \t"       +p1.getSocobaixo());
        System.out.println("Chute Alto: \t"       +p1.getChutealto());
        System.out.println("Chute Baixo: \t"      +p1.getChutebaixo());
        System.out.println("Defesa: \t"           +p1.getDefesa());
        System.out.println("Especial: \t"         +p1.getEspecial());
        System.out.println("\n");
        
        System.out.println("\t---------Comandos Especiais Reptile------------");
        System.out.println("\n");
        System.out.println("Ácido: \t\t\t"            +p1.acid_spit());
        System.out.println("Fast Forceball: \t"   +p1.fast_forceball());
        System.out.println("Slow Forceball: \t"   +p1.slow_forceball());
        System.out.println("Slide: \t\t\t"            +p1.slide());
        System.out.println("Invisivel: \t\t"        +p1.invisibility());
        System.out.println("Run and Elbow: \t\t"    +p1.run_and_elbow());
        System.out.println("\n");
        
        System.out.println("\t--------------Combos Reptile-------------------");
        System.out.println("\n");
        System.out.println("Combo 1: \t"          +p1.combo1());
        System.out.println("Combo 2: \t"          +p1.combo2());
        System.out.println("Combo 3: \t"          +p1.combo3());
        System.out.println("\n");
        
        System.out.println("\t---------------FATALITY's Reptile-----------------");
        System.out.println("\n");
        System.out.println("Fatality 1: \t"       +p1.fatality1());
        System.out.println("Fatality 2: \t"       +p1.fatality2());
        System.out.println("\n");
    
        System.out.println("\t---------------DLC's Reptile-----------------");
        System.out.println("\n");
        
//        Scorpion p2 = new Scorpion();
//        
//        //Atribuindo valores aos atributos da classe
//        
//       
//        p2.setAgarra("LT");
//        p2.setChutebaixo("B");
//        p2.setChutealto("Y");
//        p2.setSocoalto("X");
//        p2.setSocobaixo("A");
//        p2.setDefesa("RT");
//        p2.setEspecial("LB + RB");
//        
//        
//        //exibir na tela os valores atribuidos
//        System.out.println("\t-------Configuração dos Botões Scorpion---------");
//        System.out.println("\n");
//        System.out.println("Agarra: \t"           +p2.getAgarra());
//        System.out.println("Soco Alto:  \t"       +p2.getSocoalto());
//        System.out.println("Soco Baixo: \t"       +p2.getSocobaixo());
//        System.out.println("Chute Alto: \t"       +p2.getChutealto());
//        System.out.println("Chute Baixo: \t"      +p2.getChutebaixo());
//        System.out.println("Defesa: \t"           +p2.getDefesa());
//        System.out.println("Especial: \t"         +p2.getEspecial());
//        System.out.println("\n");
//        
//        System.out.println("\t---------Comandos Especiais Scorpion------------");
//        System.out.println("\n");
//        System.out.println("Spear: \t\t\t"            +p2.spear());
//        System.out.println("Teleport Punch: \t"       +p2.teleport_punch());
//        System.out.println("Flying Punch: \t\t"         +p2.flying_punch());
//        System.out.println("Air Throw: \t\t"        +p2.air_throw());
//        System.out.println("\n");
//        
//        System.out.println("\t--------------Combos Scorpion-------------------");
//        System.out.println("\n");
//        System.out.println("Combo 1: \t"          +p2.combo1());
//        System.out.println("Combo 2: \t"          +p2.combo2());
//        System.out.println("Combo 3: \t"          +p2.combo3());
//        System.out.println("\n");
//        
//        System.out.println("\t---------------FATALITY's Scorpion-----------------");
//        System.out.println("\n");
//        System.out.println("Fatality 1: \t"       +p2.fatality1());
//        System.out.println("Fatality 2: \t"       +p2.fatality2());
//        System.out.println("\n");
//    
//        System.out.println("\t---------------DLC's Scorpion-----------------");
//        System.out.println("\n");
//        
//        Subzero p3 = new Subzero();
//        
//        //Atribuindo valores aos atributos da classe
//        
//        p3.setAgarra("LT");
//        p3.setChutebaixo("B");
//        p3.setChutealto("Y");
//        p3.setSocoalto("X");
//        p3.setSocobaixo("A");
//        p3.setDefesa("RT");
//        p3.setEspecial("LB + RB");
//        
//        
//        //exibir na tela os valores atribuidos
//        System.out.println("\t-------Configuração dos Botões Subzero---------");
//        System.out.println("\n");
//        System.out.println("Agarra: \t"           +p3.getAgarra());
//        System.out.println("Soco Alto:  \t"       +p3.getSocoalto());
//        System.out.println("Soco Baixo: \t"       +p3.getSocobaixo());
//        System.out.println("Chute Alto: \t"       +p3.getChutealto());
//        System.out.println("Chute Baixo: \t"      +p3.getChutebaixo());
//        System.out.println("Defesa: \t"           +p3.getDefesa());
//        System.out.println("Especial: \t"         +p3.getEspecial());
//        System.out.println("\n");
//        
//        System.out.println("\t---------Comandos Especiais Subzero------------");
//        System.out.println("\n");
//        System.out.println("Freeze: \t\t\t"            +p3.freeze());
//        System.out.println("Slide: \t"       +p3.slide());
//        System.out.println("Ice Clone: \t\t"         +p3.ice_clone());
//        System.out.println("Ice Shower: \t\t"        +p3.ice_shower());
//        System.out.println("\n");
//        
//        System.out.println("\t--------------Combos Subzero-------------------");
//        System.out.println("\n");
//        System.out.println("Combo 1: \t"          +p3.combo1());
//        System.out.println("Combo 2: \t"          +p3.combo2());
//        System.out.println("\n");
//        
//        System.out.println("\t---------------FATALITY's Subzero-----------------");
//        System.out.println("\n");
//        System.out.println("Fatality 1: \t"       +p3.fatality1());
//        System.out.println("Fatality 2: \t"       +p3.fatality2());
//        System.out.println("\n");
//    
//        System.out.println("\t---------------DLC's Subzero-----------------");
//        System.out.println("\n");
//        
        Kitana p4 = new Kitana();
        
        //Atribuindo valores aos atributos da classe
        
        p4.setAgarra("LT");
        p4.setChutebaixo("B");
        p4.setChutealto("Y");
        p4.setSocoalto("X");
        p4.setSocobaixo("A");
        p4.setDefesa("RT");
        p4.setEspecial("LB + RB");
        
        
        //exibir na tela os valores atribuidos
        System.out.println("\t-------Configuração dos Botões Kitana---------");
        System.out.println("\n");
        System.out.println("Agarra: \t"           +p4.getAgarra());
        System.out.println("Soco Alto:  \t"       +p4.getSocoalto());
        System.out.println("Soco Baixo: \t"       +p4.getSocobaixo());
        System.out.println("Chute Alto: \t"       +p4.getChutealto());
        System.out.println("Chute Baixo: \t"      +p4.getChutebaixo());
        System.out.println("Defesa: \t"           +p4.getDefesa());
        System.out.println("Especial: \t"         +p4.getEspecial());
        System.out.println("\n");
        
        System.out.println("\t---------Comandos Especiais Kitana------------");
        System.out.println("\n");
        System.out.println("Fan Toss: \t\t\t"            +p4.fan_toss());
        System.out.println("Fan Lift: \t"       +p4.fan_lift());
        System.out.println("Square Wave Punch: \t\t"         +p4.square_wave_punch());
        System.out.println("Swipe: \t\t"        +p4.swipe());
        System.out.println("\n");
        
        System.out.println("\t--------------Combos Kitana-------------------");
        System.out.println("\n");
        System.out.println("Combo 1: \t"          +p4.combo1());
        System.out.println("Combo 2: \t"          +p4.combo2());
        System.out.println("Combo 3: \t"          +p4.combo3());
        System.out.println("\n");
        
        System.out.println("\t---------------FATALITY's Kitana-----------------");
        System.out.println("\n");
        System.out.println("Fatality 1: \t"       +p4.fatality1());
        System.out.println("Fatality 2: \t"       +p4.fatality2());
        System.out.println("\n");
    
        System.out.println("\t---------------DLC's Kitana-----------------");
        System.out.println("\n");
        
        KungLao p5 = new KungLao();
        
        //Atribuindo valores aos atributos da classe
        
        p5.setAgarra("LT");
        p5.setChutebaixo("B");
        p5.setChutealto("Y");
        p5.setSocoalto("X");
        p5.setSocobaixo("A");
        p5.setDefesa("RT");
        p5.setEspecial("LB + RB");
        
        
        //exibir na tela os valores atribuidos
        System.out.println("\t-------Configuração dos Botões Kung Lao---------");
        System.out.println("\n");
        System.out.println("Agarra: \t"           +p5.getAgarra());
        System.out.println("Soco Alto:  \t"       +p5.getSocoalto());
        System.out.println("Soco Baixo: \t"       +p5.getSocobaixo());
        System.out.println("Chute Alto: \t"       +p5.getChutealto());
        System.out.println("Chute Baixo: \t"      +p5.getChutebaixo());
        System.out.println("Defesa: \t"           +p5.getDefesa());
        System.out.println("Especial: \t"         +p5.getEspecial());
        System.out.println("\n");
        
        System.out.println("\t---------Comandos Especiais Kung Lao------------");
        System.out.println("\n");
        System.out.println("Hat Toss: \t\t\t"            +p5.hat_toss());
        System.out.println("Drop Kick: \t"       +p5.drop_kick());
        System.out.println("Spin: \t\t"         +p5.spin());
        System.out.println("Teleport: \t\t"        +p5.teleport());
        System.out.println("\n");
        
        System.out.println("\t--------------Combos Kung Lao-------------------");
        System.out.println("\n");
        System.out.println("Combo 1: \t"          +p5.combo1());
        System.out.println("Combo 2: \t"          +p5.combo2());
        System.out.println("Combo 3: \t"          +p5.combo3()); 
        System.out.println("\n");
        
        System.out.println("\t---------------FATALITY's Kung Lao-----------------");
        System.out.println("\n");
        System.out.println("Fatality 1: \t"       +p5.fatality1());
        System.out.println("Fatality 2: \t"       +p5.fatality2());
        System.out.println("\n");
    
        System.out.println("\t---------------DLC's Kung Lao-----------------");
        System.out.println("\n");
        
        Raiden p6 = new Raiden();
        
        //Atribuindo valores aos atributos da classe
        
        p6.setAgarra("LT");
        p6.setChutebaixo("B");
        p6.setChutealto("Y");
        p6.setSocoalto("X");
        p6.setSocobaixo("A");
        p6.setDefesa("RT");
        p6.setEspecial("LB + RB");
        
        
        //exibir na tela os valores atribuidos
        System.out.println("\t-------Configuração dos Botões Raiden---------");
        System.out.println("\n");
        System.out.println("Agarra: \t"           +p6.getAgarra());
        System.out.println("Soco Alto:  \t"       +p6.getSocoalto());
        System.out.println("Soco Baixo: \t"       +p6.getSocobaixo());
        System.out.println("Chute Alto: \t"       +p6.getChutealto());
        System.out.println("Chute Baixo: \t"      +p6.getChutebaixo());
        System.out.println("Defesa: \t"           +p6.getDefesa());
        System.out.println("Especial: \t"         +p6.getEspecial());
        System.out.println("\n");
        
        System.out.println("\t---------Comandos Especiais Raiden------------");
        System.out.println("\n");
        System.out.println("Lightning: \t\t\t"            +p6.lightning());
        System.out.println("Reverse Lightning: \t"       +p6.reverse_lightning());
        System.out.println("Superman: \t\t"         +p6.superman());
        System.out.println("Shocker: \t\t"        +p6.shoker());
        System.out.println("Teleport: \t\t"       +p6.teleport());
        System.out.println("\n");
        
        System.out.println("\t--------------Combos Kung Lao-------------------");
        System.out.println("\n");
        System.out.println("Combo 1: \t"          +p6.combo1());
        System.out.println("Combo 2: \t"          +p6.combo2());
        System.out.println("Combo 3: \t"          +p6.combo3()); 
        System.out.println("\n");
        
        System.out.println("\t---------------FATALITY's Raiden-----------------");
        System.out.println("\n");
        System.out.println("Fatality 1: \t"       +p6.fatality1());
        System.out.println("\n");
    
        System.out.println("\t---------------DLC's Raiden-----------------");
        System.out.println("\n");
        
        
        
//        //Luta entre reptile e Scorpion
//        System.out.println("\n\t---------------LUTA---------------");
//        LutaReptileScorpion lutars = new LutaReptileScorpion();
//        lutars.setCenario("Inferno");
//        lutars.setPersonagem1(p1); //Reptile
//        lutars.setPersonagem2(p2); //Scorpion
//        
//        lutars.AcertaGolpe("p1");
//        System.out.println("\n\tPersonagem 1 - Acertou Golpe");
//        System.out.println("\nReptile(Personagem1): "+lutars.getPersonagem1().getVida()
//                    + "\nScorpion(Personagem1): "+lutars.getPersonagem2().getVida());
//        
//        lutars.AcertaCombo("p1");
//        System.out.println("\n\tPersonagem 1 - Acertou Combo");
//        System.out.println("\nReptile(Personagem1): "+lutars.getPersonagem1().getVida()
//                    + "\nScorpion(Personagem2): "+lutars.getPersonagem2().getVida());
//        
//        lutars.AcertaGolpe("p2");
//        System.out.println("\n\tPersonagem 2 - Acertou Golpe");
//        System.out.println("\nReptile(Personagem1): "+lutars.getPersonagem1().getVida()
//                    + "\nScorpion(Personagem2): "+lutars.getPersonagem2().getVida());
        
        //Luta entre Reptile e Kitana
        System.out.println("\n\t---------------LUTA Reptile x Kitana---------------");
        LutaReptileKitana lut1 = new LutaReptileKitana();
        lut1.setCenario("Banheiro Público");
        lut1.setPersonagem1(p1); //Reptile
        lut1.setPersonagem2(p4); //Kitana
        
                lut1.AcertaGolpe("p1");
        System.out.println("\n\tPersonagem 1 - Acertou Golpe");
        System.out.println("\nReptile(Personagem1): "+lut1.getPersonagem1().getVida()
                    + "\nKitana(Personagem2): "+lut1.getPersonagem2().getVida());
        
        
        lut1.AcertaCombo("p2");
        System.out.println("\n\tPersonagem 2 - Acertou Combo");
        System.out.println("\nKitana(Personagem2): "+lut1.getPersonagem2().getVida()
                    + "\nReptile(Personagem1): "+lut1.getPersonagem1().getVida());
        
        lut1.AcertaCombo2("p2");
        System.out.println("\n\tPersonagem 2 - Acertou Combo1");
        System.out.println("\nKitana(Personagem2): "+lut1.getPersonagem2().getVida()
                    + "\nReptile(Personagem1): "+lut1.getPersonagem1().getVida());
        
        //Luta entre Kunglao e Riden
        System.out.println("\n\t---------------LUTA Kung Lao x Raiden---------------");
        LutaKunglaoRaiden lut2 = new LutaKunglaoRaiden();
        lut2.setCenario("Cozinha com Louça Suja");
        lut2.setPersonagem1(p5); //Kung Lao 
        lut2.setPersonagem2(p6); //Raiden
        
        
                
                lut2.AcertaGolpe("p6");
        System.out.println("\n\tPersonagem 2 - Acertou Golpe");
        System.out.println("\nRaiden(Personagem2): "+lut2.getPersonagem2().getVida()
                    + "\nKung Lao(Personagem1): "+lut1.getPersonagem1().getVida());
        
                lut2.AcertaGolpe13("p6");
        System.out.println("\n\tPersonagem 2 - Acertou Golpe");
        System.out.println("\nRaiden(Personagem2): "+lut2.getPersonagem2().getVida()
                    + "\nKung Lao(Personagem1): "+lut1.getPersonagem1().getVida());
        
        lut2.AcertaCombo2("p6");
        System.out.println("\n\tPersonagem 2 - Acertou Golpe");
        System.out.println("\nRaiden(Personagem2): "+lut2.getPersonagem2().getVida()
                    + "\nKung Lao(Personagem1): "+lut1.getPersonagem1().getVida());
        
        lut2.AcertaCombo2("p5");
        System.out.println("\n\tPersonagem 1 - Acertou Golpe");
        System.out.println("\nKungLao(Personagem1): "+lut2.getPersonagem1().getVida()
                    + "\nRaiden(Personagem2): "+lut1.getPersonagem2().getVida());
        
    }   
    
}
