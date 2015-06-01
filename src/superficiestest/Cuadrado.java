

package superficiestest;

/**
 *
 * @author Administrador
 */
public class Cuadrado {
    private float lado;
    private float area;

    /**
     *
     */
    public Cuadrado() {
    }

    public Cuadrado(float lado, float area) {
        this.lado = lado;
        this.area = area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

}
