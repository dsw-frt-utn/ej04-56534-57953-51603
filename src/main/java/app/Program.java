package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.ListarVehiculosView;
import views.MenuPrincipalView;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        data.Persistencia.inicializar();
        MenuPrincipalView menu = new MenuPrincipalView();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
}
