package compras;

public class Producto {

    private int codigo;
    private String nombre;
    String tipo;
    static int totalProductosPedidos;

    public Producto(int codigo, String nombre, String tipo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void imprimirNombre() {
        System.out.print(nombre);
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}
