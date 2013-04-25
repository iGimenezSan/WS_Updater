package obbsolett;



/* Descripció de la classe:
 * 
 * 
 * @autor Isaac Giménez Sánchez
 */

public class ProductosWS {
    
    private String modelo;
    private String estado;
    private String nombre;
    private String descripcion;
    private String imagenMain;
    private String precio;
    private String cantidad;
    private String nombreCategoria;
    private String imagenSubCategoria;
    private String nombreSubCategoria;
    private String fabricante;
    private String iva;
    
    public ProductosWS(String modelo, String estado, String nombre, String descripcion, String imagenMain, String precio, String cantidad, String nombreCategoria, String imagenSubCategoria, String nombreSubCategoria, String fabricante, String iva) {
        setModelo(modelo);
        setEstado(estado);
        setNombre(nombre);
        setDescripcion(descripcion);
        setImagenMain(imagenMain);
        setPrecio(precio);
        setCantidad(cantidad);
        setNombreCategoria(nombreCategoria);
        setImagenSubCategoria(imagenSubCategoria);
        setNombreSubCategoria(nombreSubCategoria);
        setFabricante(fabricante);
        setIva(iva);
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getImagenMain() {
        return imagenMain;
    }

    public void setImagenMain(String imagenMain) {
        this.imagenMain = imagenMain;
    }

    public String getImagenSubCategoria() {
        return imagenSubCategoria;
    }

    public void setImagenSubCategoria(String imagenSubCategoria) {
        this.imagenSubCategoria = imagenSubCategoria;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreSubCategoria() {
        return nombreSubCategoria;
    }

    public void setNombreSubCategoria(String nombreSubCategoria) {
        this.nombreSubCategoria = nombreSubCategoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}