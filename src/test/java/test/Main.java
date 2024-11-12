package test;

public class Motor {
    private int numeroCilindros;
    private String tipo;
    private int registro;

    public Motor(int numeroCilindros, String tipo, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

    public int getNumeroCilindros() {
        return numeroCilindros;
    }

    public void setNumeroCilindros(int numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo) {
        this.tipo = nuevoTipo;
    }
}

public class Asiento {
    private String color;
    private int precio;
    private int registro;

    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
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

public class Auto {
    private String marca;
    private String modelo;
    private int precio;
    private Asiento[] asientos;
    private Motor motor;
    private int registro;

    public Auto(String marca, String modelo, int precio, Asiento[] asientos, Motor motor, int registro) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.motor = motor;
        this.registro = registro;
    }

    public int cantidadAsientos() {
        int count = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) count++;
        }
        return count;
    }

    public String verificarIntegridad() {
        if (motor.getRegistro() != registro) return "Las piezas no son originales";
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.getRegistro() != registro) return "Las piezas no son originales";
        }
        return "Auto original";
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setAsientos(Asiento[] asientos) {
        this.asientos = asientos;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public int getRegistro() {
        return registro;
    }
}
