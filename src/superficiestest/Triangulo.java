

package superficiestest;

/**
 *
 * @author Administrador
 */
public class Triangulo {
    private float base;
    private float altura;
    private float area;

    /**
     *
     */
    public Triangulo() {
    }

    public Triangulo(float base, float altura, float area) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

}
