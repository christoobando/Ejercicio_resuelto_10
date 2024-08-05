/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_resuelto_10;

/**
 *
 * @author Christopher
 */
import java.util.Scanner;
public class Ejercicio_resuelto_10 {
    double Patrimonio;
    int EstratoSocial;
    double Pago;
    
    Ejercicio_resuelto_10(double Patrimonio,int EstratoSocial){
        this.Patrimonio = Patrimonio;
        this.EstratoSocial = EstratoSocial;
    }
    
    double PagoMatricula(){
        Pago = 50000;
        if (Patrimonio > 2000000 && EstratoSocial > 3) {
            Pago += 0.03 * Patrimonio;
        }
        return Pago;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    VentanaR10 ventana = new VentanaR10();
    ventana.show(true);

    }
    
}
