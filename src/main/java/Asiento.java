public class Asiento {
    private String color;
    private int precio;
    private int registro;

    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    public Asiento() {
        this.color = "default"; 
        this.precio = 0;        
        this.registro = 0;      
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }
}
