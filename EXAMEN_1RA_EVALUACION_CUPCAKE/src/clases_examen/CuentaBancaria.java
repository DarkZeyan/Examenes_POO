package clases_examen;
public class CuentaBancaria {
    private String noCuenta, noCliente;
    private double saldo;

    public  CuentaBancaria(){
        this.noCuenta = "";
        this.noCliente = "";
        this.saldo = 0;
    }

    public CuentaBancaria(String noCuenta, String noCliente, double saldo){
        this.noCuenta = noCuenta;
        this.noCliente = noCliente;
        this.saldo = saldo;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarEnCuenta(double monto){
        this.saldo += monto;
    }
    public void retirarDeCuenta(double retiro){
        if (retiro>this.saldo){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo-=retiro;
            System.out.println("Su saldo actualizado es: "+this.saldo);
        } 
    }
    public void imprimirDatos(){
        System.out.println("Número de cuenta: "+this.noCuenta);
        System.out.println("Número de cuenta: "+this.noCliente);
        System.out.println("Número de cuenta: "+this.saldo);
    }
    
}
