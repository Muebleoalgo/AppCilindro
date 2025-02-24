package Models;

public class Cilindro {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
    
    public double CalcularVolumen(){
        
        return Math.PI*(Math.pow(radio, 2))*altura;    
    }

    @Override
    public String toString() {
        return "Cilindro de radio =" + radio + " y altura =" + altura + " tiene volumen = " + CalcularVolumen();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
