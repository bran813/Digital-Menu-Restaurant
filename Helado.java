package src;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un Helado con nombre, precio y lista de sabores.
 */
public class Helado {
    private String nombre; // Tipo de helado.
    private double precio; // Precio del producto.
    private List<String> sabores; // Lista de sabores.

    /**
     * Constructor que inicializa un Helado con su nombre y precio.
     */
    public Helado(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.sabores = new ArrayList<>();
    }

    /**
     * Agrega un sabor a la lista de sabores del helado.
     *
     * @param sabor El sabor que se va agregar.
     */
    public void agregarSabor(String sabor) {
        sabores.add(sabor);
    }

    /**
     * Obtiene el nombre del helado.
     *
     * @return nombre El nombre del helado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del helado.
     *
     * @return precio El precio del helado.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la lista de sabores.
     *
     * @return List La lista de sabores de los helados.
     */
    public List<String> getSabores() {
        return sabores;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " | Sabores: " + String.join(", ", sabores);
    }
}