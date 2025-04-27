package principal;

import visual.FrmMenuPrincipal;

public class Principal {

    // Deixa o menu acessível para o teste
    public static FrmMenuPrincipal menu;

    public static void main(String[] args) {
        //Abre o Menu Principal
        menu = new FrmMenuPrincipal(); 
        menu.setVisible(true);
    }
}
