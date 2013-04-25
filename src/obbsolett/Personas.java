package obbsolett;



/* Descripció de la classe:
 * 
 * 
 * @autor Isaac Giménez Sánchez
 */

public class Personas {
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nickname;
    
    public Personas (String nombre, String apellido1, String apellido2, String nickname) {
        setNombre(nombre);
        setApellido1(apellido1);
        setApellido2(apellido2);
        setNickname(nickname);
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}