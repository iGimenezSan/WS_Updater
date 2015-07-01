 package toolbox;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import objetos.ProductoParaImportar;
import objetos.ProductosGlobal;


/* 
 * @autor Isaac Giménez Sánchez
 */

public class Procesadores {

    public static Conectores CON = new Conectores();
    public static Utilidades UTIL = new Utilidades();
    public static Parametros PARAM = new Parametros();
    public static Lectores LECT = new Lectores();
    
    public ArrayList<ProductoParaImportar> procesarRegistroProductosGlobal(ArrayList<ProductosGlobal> listaOriginal) {
        
        ArrayList<ProductoParaImportar> retorno = new ArrayList<ProductoParaImportar>();
        String[] imagenesProducto = new String[15];
        
        for (int contador = 0; contador <= listaOriginal.size()-1; contador++) {
            ProductosGlobal producto = listaOriginal.get(contador);
            
            // Variables para la lista de productos
            String valorProductID = null;
            String valorModel = prepararModel(producto.getCodigo());
            String valorName = prepararNombre(producto.getNombre());
            String valorInOutStock = prepararInOutStock(producto.getStock());
            String valorURL = null;
            String valorProductPrice = prepararProductPrice(producto.getPrecio());
            String valorQuantity = prepararQuantity(producto.getStock_disponible());
            String valorCreationDate = prepararFechaNow();
            String valorLastModification = prepararFechaNow();
            String valorDateAvailable = prepararFechaNow();
            String valorManufacturerName = prepararManufacturerName(producto.getMarca());
            String valorCategoriesName = prepararCategoriesName(producto.getFamilia(), producto.getSubfamilia());
            String valorDescription = prepararDescription(producto.getDescripcion_html());
            String valorProductImage = prepararProductImage(producto);
            String valorCategoriesImage = prepararCategoriesImage(producto.getFamilia(), producto.getSubfamilia());;
            String valorSpecialProductPrice = null;
            String valorDateSpecialPriceCreated = null;
            String valorSpecialLastModified = null;
            String valorSpecialExpires = null;
            String valorSpecialChanged = null;
            String valorSpecialStatus = null;
            String valorProductAttributes = prepararProductAttributes(producto.getTalla());
            String valorTaxClassName = prepararTaxClassName(producto.getIva());
            String valorProductsOrdered = null;
            String valorProductsViewed = prepararProductsViewed();
            String valorManufacturersImage = null;
            String valorFeatureDateAdded = null;
            String valorFeaturedLastModified = null;
            String valorFeaturedExpiresDate = null;
            String valorFeaturedDateStatusChange = null;
            String valorFeaturedStatus = null;
            String valorWeight = null;
            String valorProducts_Images = null;
            String valorAttribute1Option = null;
            String valorAttribute1Value = null;
            String valorAttribute1Prefix = null;
            String valorAttribute1Price = null;
            
            // Variables para las imagenes
            imagenesProducto[0] = producto.getImagen_or();
            imagenesProducto[1] = producto.getImagen_grande_1();
            imagenesProducto[2] = producto.getImagen_grande_2();
            imagenesProducto[3] = producto.getImagen_grande_3();
            imagenesProducto[4] = producto.getImagen_grande_4();
            imagenesProducto[5] = producto.getImagen_grande_5();
            imagenesProducto[6] = producto.getImagen_grande_6();
            imagenesProducto[7] = producto.getImagen_grande_7();
            imagenesProducto[8] = producto.getImagen_grande_8();
            imagenesProducto[9] = producto.getImagen_grande_9();
            imagenesProducto[10] = producto.getImagen_grande_10();
            imagenesProducto[11] = producto.getCodigo();
            imagenesProducto[12] = producto.getNombre();
            imagenesProducto[13] = producto.getFamilia();
            imagenesProducto[14] = producto.getSubfamilia();
            
            retorno.add(new ProductoParaImportar(valorProductID, valorModel, valorName, valorInOutStock, valorURL, valorProductPrice, valorQuantity, valorCreationDate, valorLastModification, valorDateAvailable, valorManufacturerName, valorCategoriesName, valorDescription, valorProductImage, valorCategoriesImage, valorSpecialProductPrice, valorDateSpecialPriceCreated, valorSpecialLastModified, valorSpecialExpires, valorSpecialChanged, valorSpecialStatus, valorProductAttributes, valorTaxClassName, valorProductsOrdered, valorProductsViewed, valorManufacturersImage, valorFeatureDateAdded, valorFeaturedLastModified, valorFeaturedExpiresDate, valorFeaturedDateStatusChange, valorFeaturedStatus, valorWeight, valorProducts_Images, valorAttribute1Option, valorAttribute1Value, valorAttribute1Prefix, valorAttribute1Price));
            //LECT.procesarImagenesParaDescarga(imagenesProducto);
        }
        prepararImagenesProducto(imagenesProducto);
        return retorno;
    }


    ////////////////////////////////////
    //////                      ////////
    //////    Procesadores      ////////
    //////                      ////////
    ////////////////////////////////////
    
    public String prepararFechaNow() {
        String resultado;
        
        Date ahora = new Date();
        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy hh:mm:ss");
        
        resultado = formato.format(ahora);
        
        return resultado;
    }
    
    public String prepararModel (String codigo) {
        String retorno = codigo;
        return retorno;
    }
    
    public String prepararNombre (String nombre) {
        String retorno = nombre;
        return retorno;
    }

    public String prepararInOutStock (String InOutStock) {
        String retorno;
        
        if ("SI".equals(InOutStock)) {
            retorno = "1";
        } else if ("NO".equals(InOutStock)) {
            retorno = "0";
        } else {
            retorno = "";
        }
        
        return retorno;        
    }
    
    public String prepararProductPrice (String precio) {
        String retorno = precio;
        return retorno;
    }
    
    public String prepararQuantity (String cantidad) {
        String retorno = cantidad;
        return retorno;
    }

    public String prepararManufacturerName (String fabricante) {
        String retorno = fabricante;
        return retorno;
    }    
    
    public String prepararCategoriesName(String familia, String subfamilia) {
        String separador = "|";
        String retorno;
        
        retorno = familia + separador + subfamilia;
        
        return retorno;
    }    

    public String prepararDescription (String descripcion) {
        String retorno = descripcion;
        return retorno;
    }
    
    public String prepararProductImage (ProductosGlobal producto) {
        String rutaBase = "productos/";
        String extension = ".jpg";
        String nombreProducto = producto.getNombre();
        String familia = producto.getFamilia() + "/";
        String subFamilia = producto.getSubfamilia() + "/";
        
        nombreProducto = formato_TextoMinusculas(nombreProducto);
        nombreProducto = formato_TextoSinEspacios(nombreProducto);
        
        String retorno = rutaBase + familia + subFamilia + nombreProducto + extension;
        
        return retorno;
    }
    
    public String prepararCategoriesImage (String familia, String subfamilia) {
        String rutaBase = "categorias/";
        String separador = "/";
        String extension = ".jpg";
        String retorno;
        
        //Quitar espacios del contenido
        familia = formato_TextoSinEspacios(familia);
        subfamilia = formato_TextoSinEspacios(subfamilia);
        
        //Poner todo en minusculas
        familia = formato_TextoMinusculas(familia);
        subfamilia = formato_TextoMinusculas(subfamilia);
        
        retorno = rutaBase + familia + separador + subfamilia + extension;
        
        return retorno;
    }
    
    public String prepararProductAttributes (String talla) {
        String retorno;
        retorno = talla;
        return retorno;
    }

    public String prepararTaxClassName (String iva) {
        String retorno;
        
        if ("21".equals(iva)) {
            retorno = "IVA (Normal)";
        } else if ("10".equals(iva)) {
            retorno = "IVA (Reducido)";
        } else if ("4".equals(iva)) {
            retorno = "IVA (Superreducido)";
        } else if ("0".equals(iva)){
            retorno = "Exento";
        } else {
            retorno = "";
        }

        return retorno;
    }
    
    public String prepararProductsViewed () {
        String retorno;
        int valor = 0;
        
        //Instanciación de java.Util.Random
        Random r = new Random();
        
        valor = r.nextInt(60);
        retorno = Integer.toString(valor);
        
        return retorno;
    }
    
    
    ////////////////////////////////////
    //////                      ////////
    //////    Formateadores     ////////
    //////                      ////////
    ////////////////////////////////////
    
    public String formato_TextoSinEspacios(String contenido) {
        String retorno = contenido.replaceAll(" ", "_");
        return retorno;
    }
    
    public String formato_TextoMinusculas(String contenido) {
        String retorno = contenido.toLowerCase();
        return retorno;
    }
    
    public String formato_TextoSinEspaciosEnMinusculas(String contenido) {
        String retorno = contenido.toLowerCase();
        retorno = retorno.replaceAll(" ", "_");
        return retorno;
    }
    
    public String formato_TextoSinAsteriscos(String contenido) {
        String retorno = contenido.replaceAll("*", "i");
        return retorno;
    }
    
    public String formato_TextoSinBarras(String contenido) {
        String retorno = contenido.replaceAll("/", "-");
        retorno = retorno.replaceAll("\\", "-");
        return retorno;
    }
    
    public String formato_TextoSinSignos (String contenido) {
        String retorno = contenido.replaceAll("¿", "");
        retorno = retorno.replaceAll("?", "");
        return retorno;
    }
    
    /////////////////////////////////////
    //////                       ////////
    //////  Gestion de imagenes  ////////
    //////                       ////////
    /////////////////////////////////////    
    
    public void prepararImagenesProducto(String[] imagenesProducto) {
        
    }

    
    ////////////////////////////////////
    //////                      ////////
    //////      OLD             ////////
    //////                      ////////
    ////////////////////////////////////
   
    private String cambiarFormato_ImagenOr(String[] referencia) {
        String modelo = referencia[2];
        String nombre = formato_TextoSinEspacios(referencia[3]);
        nombre = ortografia_SustituirEñes(nombre);
        String rutaCorrecta = fabricarDato_RutaImagenOR(modelo, nombre);
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }    

    private String cambiarFormato_DescripcionHTML(String descripcionOriginal) {
        String descripcionOriginalMod1 = ortografia_SustituirEñes(descripcionOriginal);
        String descripcionSalida = ortografia_SustituirAcentos(descripcionOriginalMod1);
        return descripcionSalida;
    }
    
    public String ortografia_SustituirEñes(String contenido) {
        String muestraMinusc = "ñ";
        String minusc = "&ntilde;";
        String muestraMayusc = "Ñ";
        String mayusc = "&Ntilde;";
        contenido = contenido.replaceAll(muestraMinusc, minusc);
        contenido = contenido.replaceAll(muestraMayusc, mayusc);
        return contenido;
    }
    
    private String ortografia_SustituirSeparadorDecimales(String contenido) {
        char malo = ',';
        char bueno = '.';
        contenido = contenido.replace(malo, bueno);
        return contenido;
    }

    private String ortografia_SustituirAcentos(String contenido) {
        contenido = contenido.replaceAll("á", "&atilde;");
        contenido = contenido.replaceAll("Á", "&Atilde;");
        contenido = contenido.replaceAll("é", "&tilde;");
        contenido = contenido.replaceAll("É", "&Etilde;");
        contenido = contenido.replaceAll("í", "&itilde;");
        contenido = contenido.replaceAll("Í", "&Itilde;");
        contenido = contenido.replaceAll("ó", "&otilde;");
        contenido = contenido.replaceAll("Ó", "&Otilde;");
        contenido = contenido.replaceAll("ú", "&utilde;");
        contenido = contenido.replaceAll("Ú", "&Utilde;");
        return contenido;
    }

    private String fabricarDato_RutaImagenOR(String modelo, String nombre) {
        String salida = "products/" + modelo + "-" + nombre + ".jpg";
        return salida;
    }

    private String fabricarDato_RutaImagenSecundaria(String modelo, String nombre) {
        String salida = "products/" + modelo + "-" + nombre;
        return salida;
    }



}