package src;

public class MenuHeladosAdapter implements Menu {
    private MenuHelados menuHelados;

    public MenuHeladosAdapter(MenuHelados menuHelados) {
        this.menuHelados = menuHelados;
    }

    @Override
    public void showMenu() {
        menuHelados.mostrarMenu();
    }
}
