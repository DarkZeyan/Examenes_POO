package clases_examen;

public class TestCovid {
    private int edad;
    private double peso, estatura;
    private boolean tieneEnfermedadCronica;


    public void calcularPersonaRiesgo(){
        if(edad>=65||tieneEnfermedadCronica==true||calcularIMC()>30) System.out.println("PERSONA DE RIESGO");
        else System.out.println("PERSONA SIN RIESGO");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean getTieneEnfermedadCronica() {
        return tieneEnfermedadCronica;
    }

    public void setTieneEnfermedadCronica(boolean tieneEnfermedadCronica) {
        this.tieneEnfermedadCronica = tieneEnfermedadCronica;
    }
    private double calcularIMC(){        
        return peso/Math.pow(estatura,2);
    }

}
