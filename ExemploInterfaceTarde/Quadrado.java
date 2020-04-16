public class Quadrado implements FiguraGeometrica {

    private String nomeFigura;
    private double lado;
    
    public Quadrado() {
        this.lado = 0.0;
    }

    @Override
    public String getNomeFigura() {
        return this.nomeFigura;
    }
    
    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
    public double getLado() {
        return this.lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }
    
    public String toString() {
        return "\nLado: " + this.lado
             + "\nárea: " + this.calcularArea()
             + "\nperimetro: " + this.calcularPerimetro();
    }
    
}