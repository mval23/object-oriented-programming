package Ejercicio1;
public class Animal {
    String nombre;
    String genero = "M";
    double peso;
    Animal pareja;
    static int totalAnimales;

    void setPareja(Animal pareja) {
        this.pareja = pareja;
    }

    static Animal tenerHijo(String nombre) {
        Animal hijo = new Animal();
        totalAnimales++;
        hijo.nombre = nombre;
        hijo.peso = 1;
        double random = Math.random();
        if (random < 0.5) {
            hijo.genero = "F";
        } else
            hijo.genero = "M";

        return hijo;
    }

    Familia procrear(String nombreHijo) {

        if (pareja == null) {
            System.out.println(this.nombre + " no tiene pareja");
            return null;
        }

        if (pareja.genero.equals(genero)) {
            System.out.println(this.nombre + " y " + this.pareja.nombre + " son del mismo genero");
            return null;
        }

        System.out.println(this.nombre + " y " + this.pareja.nombre + " van a tener un hijo");

        Familia f = new Familia();

        if (this.genero.equals("M")) {
            f.mama = this.pareja;
            f.papa = this;
        } else {
            f.mama = this;
            f.papa = this.pareja;
        }

        Animal hijo = f.mama.tenerHijo(nombreHijo);
        f.hijo = hijo;
        System.out.println(hijo.nombre + " ha llegado al mundo");
        return f;
    }

    void morir(Animal animal) {
        System.out.println(animal.nombre + " ha muerto");
        --totalAnimales;
    }

    public String toString() {
        return "Me llamo " + this.nombre + " y peso " + this.peso;
    }
}

