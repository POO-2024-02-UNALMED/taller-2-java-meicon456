package main;

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
