// Main.java
package ecoembes;

import ecoembes.facade.*;

public class EcoembesAplication {
    public static void main(String[] args) {
        EcoembesFacade eco = new EcoembesFacade();

        eco.crearContenedor("C001", "Dendariñe ibilbidea 3", "48477", 1200);
        eco.actualizarContenedor("C001", 980, "ROJO");

        var resp = eco.listarContenedoresZona("48477");
        System.out.println(resp.mensaje);
        System.out.println(resp.datos);
    }
}
