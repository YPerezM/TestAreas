package superficiestest;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {
        Vista view = new Vista();
        Main m = new Main();
        String fig = view.pedirFigura();

        if (fig.equals("Cuadrado")) {
            view.imprimir(m.calcC(new Cuadrado()));
        } else {
            if (fig.equals("Rectangulo")) {
                view.imprimir(m.calcR(new Rectangulo()));
            } else {
                if (fig.equals("Triangulo")) {
                    view.imprimir(m.calcT(new Triangulo()));
                } else {
                    if (fig.equals("Circulo")) {
                        view.imprimir(m.calcCir(new Circulo()));
                    } else {
                        JOptionPane.showMessageDialog(null, fig + " no es una figura válida");
                    }
                }
            }
        }
    }

    public float calcC(Cuadrado c) {

        Vista v = new Vista();
        c.setArea(c.getLado() * c.getLado());
        return c.getArea();
    }

    public float calcR(Rectangulo r) {

        Vista v = new Vista();
        r.setArea(r.getAlto() * r.getAncho());
        return r.getArea();
    }

    public float calcT(Triangulo t) {

        Vista v = new Vista();
        t.setArea((t.getBase() * t.getAltura()) / 2);
        return t.getArea();
    }

    public float calcCir(Circulo ci) {

        Vista v = new Vista();
        ci.setArea((ci.getRadio() * ci.getRadio()) * 3.14f);
        return ci.getArea();
    }
}
