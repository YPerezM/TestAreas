

package superficiestest;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Vista {
    public String pedirFigura() {
        String respuesta;
        respuesta = JOptionPane.showInputDialog("¿De que figura quieres saber el area?: Cuadrado,Circulo,Triangulo o Rectangulo");
        JOptionPane.showMessageDialog(null, "Has dicho: " + respuesta);
        return respuesta;
    }

    public void pedirDatosC(Cuadrado c) {
        float lado = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto mide el lado?"));
        c.setLado(lado);
    }

    public void pedirDatosR(Rectangulo r) {
        float alto = Float.parseFloat(JOptionPane.showInputDialog("¿Cual es la altura de el rectangulo?"));
        float ancho = Float.parseFloat(JOptionPane.showInputDialog("¿Cual es el ancho del rectangulo?"));
        r.setAlto(alto);
        r.setAncho(ancho);
    }

    public void pedirDatosT(Triangulo t) {
        float base = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto mide la base de el triangulo?"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto mide la altura de el triangulo?"));
        t.setBase(base);
        t.setAltura(altura);
    }

    public void pedirDatosCir(Circulo c) {
        float radio = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto mide el radio de el circulo?"));
        c.setRadio(radio);
    }

    public void imprimir(float area) {
        JOptionPane.showMessageDialog(null, "Area= " + area);
    }

}
