package conversor;

/* 
 * @autor Isaac Giménez Sánchez
 */

public class Procesador {

//    public ArrayList<Producto> listaProductosConTalla (String ruta) {
//        try {
//            // Inicializo el ArrayList y el lector de CSV (biblioteca añadida manualmente).
//            ArrayList producto = new ArrayList();
//            CsvReader fila_reader = new CsvReader(ruta);
//            
//            //Especificación del separador
//            fila_reader.setDelimiter(',');
//
//            // recogida de los datos de cada línea
//            while (fila_reader.readRecord()) {
//                String familia = fila_reader.get(0);                            //familia
//                String subfamilia = fila_reader.get(1);                         //subfamilia
//                String codigo = fila_reader.get(2);                             //codigo
//                String nombre = fila_reader.get(3);                             //nombre
//                String marca = fila_reader.get(5);                              //marca
//                String precio = fila_reader.get(8);                             //precio
//                String stock_disponible = fila_reader.get(11);                  //stock_disponible
//                String talla = fila_reader.get(13);                             //talla    
//                String iva = fila_reader.get(14);                               //iva
//                String imagen_or = fila_reader.get(17);                         //imagen_or
//                String imagen_grande_1 = fila_reader.get(18);                   //imagen_grande_1
//                String imagen_grande_2 = fila_reader.get(19);                   //imagen_grande_2
//                String imagen_grande_3 = fila_reader.get(20);                   //imagen_grande_3
//                String imagen_grande_4 = fila_reader.get(21);                   //imagen_grande_4
//                String imagen_grande_5 = fila_reader.get(22);                   //imagen_grande_5
//                String imagen_grande_6 = fila_reader.get(23);                   //imagen_grande_6
//                String imagen_grande_7 = fila_reader.get(24);                   //imagen_grande_7
//                String imagen_grande_8 = fila_reader.get(25);                   //imagen_grande_8
//                String imagen_grande_9 = fila_reader.get(26);                   //imagen_grande_9
//                String imagen_grande_10 = fila_reader.get(27);                  //imagen_grande_10
//                String descripcion_html = fila_reader.get(30);                  //descripcion_html
//                
//                // Añadir el producto recibido (a dónde? no lo se... per add es añadir, no? XD)
//                //producto.add(new Producto(familia,subfamilia,codigo,nombre,marca,precio,stock_disponible,talla,iva,imagen_or,imagen_grande_1,imagen_grande_2,imagen_grande_3,imagen_grande_4,imagen_grande_5,imagen_grande_6,imagen_grande_7,imagen_grande_8,imagen_grande_9,imagen_grande_10,descripcion_html));
//                producto.add(new Producto(familia, subfamilia, codigo, nombre, marca, precio, stock_disponible, talla, iva, imagen_or, imagen_grande_1, imagen_grande_2, imagen_grande_3, imagen_grande_4, imagen_grande_5, imagen_grande_6, imagen_grande_7, imagen_grande_8, imagen_grande_9, imagen_grande_10, descripcion_html));
//                
//            }
//            fila_reader.close();
//            return producto;
//            
//        // Nunca he hecho un tratamiento de excepciones ni he estudiado como hacerlos, 
//        //  asi que a esto casi que ni caso, está hecho por deducción ;)
//        } catch (FileNotFoundException e) {
//            System.out.println("Parece que no se encuentra el fichero.");
//            ArrayList<Producto> filas = null;
//            return filas;
//        } catch (IOException e) {
//            System.out.println("Fallo desconocido en entrada/salida.");
//            System.out.println("Tendrá algo que ver esto?: " + e);
//            ArrayList<Producto> filas = null;
//            return filas;
//        }
//    }
    
    public String[] goesArray (String familia, String subfamilia, String codigo, String nombre, String marca, String precio, String stock_disponible, String talla, String iva, String imagen_or, String imagen_grande_1, String imagen_grande_2, String imagen_grande_3, String imagen_grande_4, String imagen_grande_5, String imagen_grande_6, String imagen_grande_7, String imagen_grande_8, String imagen_grande_9, String imagen_grande_10, String descripcion_html)  {
        String[] array = new String[21];
        array[0] = familia;
        array[1] = subfamilia;
        array[2] = codigo;
        array[3] = nombre;
        array[4] = marca;
        array[5] = precio;
        array[6] = stock_disponible;
        array[7] = talla;
        array[8] = iva;
        array[9] = imagen_or;
        array[10] = imagen_grande_1;
        array[11] = imagen_grande_2;
        array[12] = imagen_grande_3;
        array[13] = imagen_grande_4;
        array[14] = imagen_grande_5;
        array[15] = imagen_grande_6;
        array[16] = imagen_grande_7;
        array[17] = imagen_grande_8;
        array[18] = imagen_grande_9;
        array[19] = imagen_grande_10;
        array[20] = descripcion_html;
        return array;
    }
    
    public boolean trueSiTieneTalla (String dato) {
        String sinTalla = "ST", Unica = "U", unicaPlus = "UP";
        if (dato.equalsIgnoreCase(sinTalla) || dato.equalsIgnoreCase(Unica) || dato.equalsIgnoreCase(unicaPlus)) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean trueSiTieneImagen (String dato) {
        String muestra = "Sin Imagen";
        if (muestra.equals(dato)) {
            return false;
        } else {
            return true;
        }
    }

    public String[] procesoSimple(String[] producto) {
        String[] referencia = producto.clone();
        producto[1] = cambiarFormato_Subfamilia(producto[1]);
        producto[3] = cambiarFormato_Nombre(producto[3]);
        producto[4] = cambiarFormato_Marca(producto[4]);
        producto[5] = cambiarFormato_Precio(producto[5]);
        producto[8] = cambiarFormato_Iva(producto[8]);
        producto[9] = cambiarFormato_ImagenOr(referencia);
        if (trueSiTieneImagen(producto[10])) {
            producto[10] = cambiarFormato_ImagenGrande1(referencia);
        }
        if (trueSiTieneImagen(producto[11])) {
            producto[11] = cambiarFormato_ImagenGrande2(referencia);
        }
        if (trueSiTieneImagen(producto[12])) {
            producto[12] = cambiarFormato_ImagenGrande3(referencia);
        }
        if (trueSiTieneImagen(producto[13])) {
            producto[13] = cambiarFormato_ImagenGrande4(referencia);
        }
        if (trueSiTieneImagen(producto[14])) {
            producto[14] = cambiarFormato_ImagenGrande5(referencia);
        }
        if (trueSiTieneImagen(producto[15])) {
            producto[15] = cambiarFormato_ImagenGrande6(referencia);
        }
        if (trueSiTieneImagen(producto[16])) {
            producto[16] = cambiarFormato_ImagenGrande7(referencia);
        }
        if (trueSiTieneImagen(producto[17])) {
            producto[17] = cambiarFormato_ImagenGrande8(referencia);
        }
        if (trueSiTieneImagen(producto[18])) {
            producto[18] = cambiarFormato_ImagenGrande9(referencia);
        }
        if (trueSiTieneImagen(producto[19])) {
            producto[19] = cambiarFormato_ImagenGrande10(referencia);
        }
        producto[20] = cambiarFormato_DescripcionHTML(producto[20]);
        return producto;
    }

//    public String[] procesoComplejo(String[] producto) {
//        String[] productoFormatoProcesado = procesoSimple(producto);
//        fabricarDato_CodificarTallas(productoFormatoProcesado);
//        return producto;
//    }

    private String cambiarFormato_Subfamilia(String subfamiliaOrigen) {
        String subfamiliaSalida = ortografia_SustituirEñes(subfamiliaOrigen);
        return subfamiliaSalida;
    }

    private String cambiarFormato_Nombre(String nombreOrigen) {
        String nombreSalida = ortografia_SustituirEñes(nombreOrigen);
        return nombreSalida;
    }

    private String cambiarFormato_Marca(String marcaOrigen) {
        String marcaSalida = ortografia_SustituirEñes(marcaOrigen);
        return marcaSalida;
    }
    
    public String cambiarFormato_Precio(String precioOrigen) {
        String precioSalida = ortografia_SustituirSeparadorDecimales(precioOrigen);
        precioSalida = precioSalida + "00";
        return precioSalida;
    }    
    
    private String cambiarFormato_Iva(String ivaOrigen) {
        String normal = "IVA (Normal)";
        String reduc = "IVA (Reducido)";
        String superreduc = "IVA (Superreducido)";
        String ivaSalida = ivaOrigen;
        if ("21".equals(ivaOrigen)) {
            ivaSalida = normal;
        } else if ("10".equals(ivaOrigen)) {
            ivaSalida = reduc;
        } else if ("4".equals(ivaOrigen)) {
            ivaSalida = superreduc;
        }
        return ivaSalida;
    }
    
    private String cambiarFormato_ImagenOr(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        nombre = ortografia_SustituirEñes2(nombre);
        String rutaCorrecta = fabricarDato_RutaImagenOR(modelo, nombre);
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }    

    private String cambiarFormato_ImagenGrande1(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        String rutaCorrecta = fabricarDato_RutaImagenSecundaria(modelo, nombre) + "_0" + ".jpg";
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }
    
    private String cambiarFormato_ImagenGrande2(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        String rutaCorrecta = fabricarDato_RutaImagenSecundaria(modelo, nombre) + "_1" + ".jpg";
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }
    
    private String cambiarFormato_ImagenGrande3(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        String rutaCorrecta = fabricarDato_RutaImagenSecundaria(modelo, nombre) + "_2" + ".jpg";
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }
    
    private String cambiarFormato_ImagenGrande4(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        String rutaCorrecta = fabricarDato_RutaImagenSecundaria(modelo, nombre) + "_3" + ".jpg";
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }
    
    private String cambiarFormato_ImagenGrande5(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        String rutaCorrecta = fabricarDato_RutaImagenSecundaria(modelo, nombre) + "_4" + ".jpg";
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }    
    
    private String cambiarFormato_ImagenGrande6(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        String rutaCorrecta = fabricarDato_RutaImagenSecundaria(modelo, nombre) + "_5" + ".jpg";
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }
    
    private String cambiarFormato_ImagenGrande7(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        String rutaCorrecta = fabricarDato_RutaImagenSecundaria(modelo, nombre) + "_6" + ".jpg";
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }    
    
    private String cambiarFormato_ImagenGrande8(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        String rutaCorrecta = fabricarDato_RutaImagenSecundaria(modelo, nombre) + "_7" + ".jpg";
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }    
    
    private String cambiarFormato_ImagenGrande9(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        String rutaCorrecta = fabricarDato_RutaImagenSecundaria(modelo, nombre) + "_8" + ".jpg";
        rutaCorrecta = rutaCorrecta.toLowerCase();
        return rutaCorrecta;
    }    
    
    private String cambiarFormato_ImagenGrande10(String[] referencia) {
        String modelo = referencia[2];
        String nombre = ortografia_NombreSinEspacios(referencia[3]);
        String rutaCorrecta = fabricarDato_RutaImagenSecundaria(modelo, nombre) + "_9" + ".jpg";
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
    
    public String ortografia_NombreSinEspacios(String contenido) {
        String contenidoSalida = contenido.replaceAll(" ", "_");
        return contenidoSalida;
    }    

    public String ortografia_SustituirEñes2(String contenido) {
        String muestraMinusc = "ñ";
        String minusc = "n";
        String muestraMayusc = "Ñ";
        String mayusc = "N";
        contenido = contenido.replaceAll(muestraMinusc, minusc);
        contenido = contenido.replaceAll(muestraMayusc, mayusc);
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