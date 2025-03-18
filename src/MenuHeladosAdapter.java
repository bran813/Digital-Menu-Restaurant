package src;

/**
 * Clase MenuHeladoAdapter, que implementa Menu.
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
public class MenuHeladosAdapter implements Menu {
    private MenuHelados menuHelados;

    /**
     * Método MenuHeladosAdapter
     * 
     * @param menuHelados el menú de los helados
     */
    public MenuHeladosAdapter(MenuHelados menuHelados) {
        this.menuHelados = menuHelados;
    }

    @Override
    public void showMenu() {
        menuHelados.mostrarMenu();
    }
}
