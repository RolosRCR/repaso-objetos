package uaslp.objetos.figuras;

public class Triangulo implements Figura {
    protected double base;
    protected double altura;
    protected String description;
    protected String name;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
        description = "Cualquier triangulo";
        name = "Triangulo";
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return (base);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return (altura);
    }

    public double getArea() throws DatoFaltanteException {
        if (base == 0)
            throw new BaseNoProvistaException();
        else if (altura == 0)
            throw new AlturaNoProvistaException();
        else
            return base * altura / 2;
    }

    public String getDescription() {
        return (description);
    }

    public String getName() {
        return name;
    }

}
