/**
 *
 * @author Keinner Ramos
 */

public class CuentaBancaria {
    int numeroCuenta;
    double saldoCuenta;
    String tipoCuenta;
    
    public CuentaBancaria(int numeroCuenta, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
    }
    
    public CuentaBancaria(int numeroCuenta, double saldoCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    CuentaBancaria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
