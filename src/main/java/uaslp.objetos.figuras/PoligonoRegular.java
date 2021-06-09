package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura {
    private double lado;
    private double numeroDeLados;
    private String name;

    public PoligonoRegular(){
        name = "Poligono Regular";
    }
    public PoligonoRegular(double numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
        name = "Poligono Regular";
    }

    public PoligonoRegular(double numeroDeLados, double lado) {
        this.lado = lado;
        this.numeroDeLados = numeroDeLados;
        name = "Poligono Regular";
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return (lado);
    }

    public double getArea() {
        return ((lado * numeroDeLados) * (Math.sqrt(Math.pow(lado, 2) - Math.pow(lado / 2, 2))) / 2);
    }

    public String getName() {
        return name;
    }
}
