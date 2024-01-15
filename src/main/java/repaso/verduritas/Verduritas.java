/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package repaso.verduritas;

/**
 *
 * @author miguel
 */
public class Verduritas {

    private String codVerdurita;
    private String nombre;

    public Verduritas(String codVerdurita, String nombre) {
        this.codVerdurita = codVerdurita;
        this.nombre = nombre;
    }

    public Verduritas() {
    } 

    public String getCodVerdurita() {
        return codVerdurita;
    }

    public void setCodVerdurita(String codVerdurita) {
        this.codVerdurita = codVerdurita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
