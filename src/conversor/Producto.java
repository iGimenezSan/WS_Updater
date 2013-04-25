package conversor;

/** Programa:   Producto.java - (UTF-8)
  * Autor:      McKyavelik
  * 
  * Esta clase es la que define los atributos y cómo construir los
  * objetos de tipo Producto.
  * 
  * Se cogen solo algunos de los datos de cada línea y se crea un objeto nuevo
  *     con esos datos. Cada objeto se guarda en una posición del ArrayList.
  * 
  * Después ya no se acceder a cada uno de los datos (familia, codigo, etc.) de
  *     cada objeto que hay en cada posición del ArrayList.
  * 
  * Puedo acceder al objeto. Usando el método Iterator de la clase ArrayList,
  *     pero lo que visualizo es una lista del mismo tamaño que el CSV con
  *     lo que entiendo que serán los codificadores del objeto: "conversor.Producto@fd0a62"
  *     pero sigo sin entender como acceder a los datos(atributos, creo) de cada objeto.
  * 
**/

public class Producto {

    private String familia;
    private String subfamilia;
    private String codigo;
    private String nombre;
    private String marca;
    private String precio;
    private String stock_disponible;
    private String talla;
    private String iva;
    private String imagenOr;
    private String imagen_grande_1;
    private String imagen_grande_2;
    private String imagen_grande_3;
    private String imagen_grande_4;
    private String imagen_grande_5;
    private String imagen_grande_6;
    private String imagen_grande_7;
    private String imagen_grande_8;
    private String imagen_grande_9;
    private String imagen_grande_10;
    private String descripcionHTML;

    public Producto(String familia, String subfamilia, String codigo, String nombre, String marca, String precio, String stock_disponible, String talla, String iva, String imagenOr, String imagen_grande_1, String imagen_grande_2, String imagen_grande_3, String imagen_grande_4, String imagen_grande_5, String imagen_grande_6, String imagen_grande_7, String imagen_grande_8, String imagen_grande_9, String imagen_grande_10, String descripcionHTML) {
        this.familia = familia;
        this.subfamilia = subfamilia;
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock_disponible = stock_disponible;
        this.talla = talla;
        this.iva = iva;
        this.imagenOr = imagenOr;
        this.imagen_grande_1 = imagen_grande_1;
        this.imagen_grande_2 = imagen_grande_2;
        this.imagen_grande_3 = imagen_grande_3;
        this.imagen_grande_4 = imagen_grande_4;
        this.imagen_grande_5 = imagen_grande_5;
        this.imagen_grande_6 = imagen_grande_6;
        this.imagen_grande_7 = imagen_grande_7;
        this.imagen_grande_8 = imagen_grande_8;
        this.imagen_grande_9 = imagen_grande_9;
        this.imagen_grande_10 = imagen_grande_10;
        this.descripcionHTML = descripcionHTML;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcionHTML() {
        return descripcionHTML;
    }

    public void setDescripcionHTML(String descripcionHTML) {
        this.descripcionHTML = descripcionHTML;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getImagenOr() {
        return imagenOr;
    }

    public void setImagenOr(String imagenOr) {
        this.imagenOr = imagenOr;
    }

    public String getImagen_grande_1() {
        return imagen_grande_1;
    }

    public void setImagen_grande_1(String imagen_grande_1) {
        this.imagen_grande_1 = imagen_grande_1;
    }

    public String getImagen_grande_10() {
        return imagen_grande_10;
    }

    public void setImagen_grande_10(String imagen_grande_10) {
        this.imagen_grande_10 = imagen_grande_10;
    }

    public String getImagen_grande_2() {
        return imagen_grande_2;
    }

    public void setImagen_grande_2(String imagen_grande_2) {
        this.imagen_grande_2 = imagen_grande_2;
    }

    public String getImagen_grande_3() {
        return imagen_grande_3;
    }

    public void setImagen_grande_3(String imagen_grande_3) {
        this.imagen_grande_3 = imagen_grande_3;
    }

    public String getImagen_grande_4() {
        return imagen_grande_4;
    }

    public void setImagen_grande_4(String imagen_grande_4) {
        this.imagen_grande_4 = imagen_grande_4;
    }

    public String getImagen_grande_5() {
        return imagen_grande_5;
    }

    public void setImagen_grande_5(String imagen_grande_5) {
        this.imagen_grande_5 = imagen_grande_5;
    }

    public String getImagen_grande_6() {
        return imagen_grande_6;
    }

    public void setImagen_grande_6(String imagen_grande_6) {
        this.imagen_grande_6 = imagen_grande_6;
    }

    public String getImagen_grande_7() {
        return imagen_grande_7;
    }

    public void setImagen_grande_7(String imagen_grande_7) {
        this.imagen_grande_7 = imagen_grande_7;
    }

    public String getImagen_grande_8() {
        return imagen_grande_8;
    }

    public void setImagen_grande_8(String imagen_grande_8) {
        this.imagen_grande_8 = imagen_grande_8;
    }

    public String getImagen_grande_9() {
        return imagen_grande_9;
    }

    public void setImagen_grande_9(String imagen_grande_9) {
        this.imagen_grande_9 = imagen_grande_9;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock_disponible() {
        return stock_disponible;
    }

    public void setStock_disponible(String stock_disponible) {
        this.stock_disponible = stock_disponible;
    }

    public String getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(String subfamilia) {
        this.subfamilia = subfamilia;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    
}