package uaslp.objetos.figuras;

public class Cuadrado implements Figura {
    private double lado;
    private double area;
    private String name;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
        name = "Cuadrado";
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return (lado);
    }

    public double getArea() throws LadoNoProvistoException {
        if (lado==0)
            throw new LadoNoProvistoException();
        else
            return (lado * lado);
    }

    @Override
    public String getName() {
        return name;
    }
}
