package Ex01_09;
public  class  Caballo {
  String nombre ="Platero";
  String perigrie = "Caballo Aleman";
  int edad = 6;
  int size = 80;
  int velocidad = (int)(Math.random()*50);

  public void presenta() {
    this.nombre = nombre;
    this.perigrie = perigrie;
    System.out.println("El caballo se llama " + this.nombre + " y su raza es un " + this.perigrie);
    return;
  }

  public void velocidad() {
    this.velocidad = velocidad;
    System.out.println("La velocidad de tu caballo es de " + this.velocidad + " km/h");
  }
}