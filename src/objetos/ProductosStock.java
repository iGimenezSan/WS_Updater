package objetos;

/**
 *
 * @author iGimenezSan
 */
public class ProductosStock {
    
    private String codigo;
    private String cantidad;

    public ProductosStock(String codigo, String cantidad) {
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
