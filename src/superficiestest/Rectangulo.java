

package superficiestest;

/**
 *
 * @author Administrador
 */
public class Rectangulo {
    private float alto;
    private float ancho;
    private float area;

    public Rectangulo() {
    }

    public Rectangulo(float alto, float largo, float area) {
        this.alto = alto;
        this.ancho = largo;
        this.area = area;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

}
