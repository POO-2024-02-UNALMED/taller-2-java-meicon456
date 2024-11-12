package test;

class Motor {
  private int numCilindros;
  private String tipo;
  private int registro;

  public Motor(int numeroCilindros, String tipo, int registro) {
      this.numCilindros = numeroCilindros;
      this.tipo = tipo;
      this.registro = registro;
  }

  public void cambiarRegistro(int registro) {
      this.registro = registro;
  }

  public void asignarTipo(String tipo) {
      if (tipo.equals("gasolina") || tipo.equals("electrico")) {
          this.tipo = tipo;
      }
  }

  public int getRegistro() {
      return registro;
  }
}

class Asiento {
  private String color;
  private int precio;
  private int registro;

  public Asiento(String color, int precio, int registro) {
      this.color = color;
      this.precio = precio;
      this.registro = registro;
  }

  public void cambiarColor(String color) {
      if (color.equals("rojo") || color.equals("amarillo") || color.equals("verde") ||
          color.equals("negro") || color.equals("blanco")) {
          this.color = color;
      }
  }

  public int getRegistro() {
      return registro;
  }
}

class Auto {
  public static int cantidadCreados = 0;
  private String marca;
  private String modelo;
  private int precio;
  private Asiento[] asientos;
  private Motor motor;
  private int registro;

  public Auto(String marca, String modelo, int precio, Object[][] asientosData, Motor motor, int registro) {
      this.marca = marca;
      this.modelo = modelo;
      this.precio = precio;
      this.motor = motor;
      this.registro = registro;

      this.asientos = new Asiento[asientosData.length];
      for (int i = 0; i < asientosData.length; i++) {
          String color = (String) asientosData[i][0];
        int asientoPrecio = Integer.parseInt((String) asientosData[i][1]);          
          this.asientos[i] = new Asiento(color, asientoPrecio, registro);
      }

      cantidadCreados++;
  }

  public int cantidadAsientos() {
      return asientos.length;
  }

  public String verificarIntegridad() {
      if (motor.getRegistro() != registro) {
          return "Las piezas no son originales";
      }

      for (Asiento asiento : asientos) {
          if (asiento.getRegistro() != registro) {
              return "Las piezas no son originales";
          }
      }

      return "Auto original";
  }
}
