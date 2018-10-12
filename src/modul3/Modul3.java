/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author windows10
 */
public class Modul3 {
    
    public static void Tugas1()
    {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Number 1 = ");
        num1 = scan.nextInt();
        System.out.print("Number 2 = ");
        num2 = scan.nextInt();
        System.out.print("Number 3 = ");
        num3 = scan.nextInt();
        System.out.println("Rata-Rata = "+ (num1+num2+num3)/3);
    }
    
    public static void Tugas2()
    {
        String number1 = JOptionPane.showInputDialog("Masukkan Number 1 : ");
        String number2 = JOptionPane.showInputDialog("Masukkan Number 2 : ");
        String number3 = JOptionPane.showInputDialog("Masukkan Number 3 : ");
                
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int num3 = Integer.parseInt(number3);
        
        String pesan = "Number 1 = "+ num1+"\nNumber 2 = "+ num2+"\nNumber 3 = "+ num3 +"\nRata-Rata = "+ (num1+num2+num3)/3;
        JOptionPane.showMessageDialog(null, pesan);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Modul3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Modul3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Modul3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Modul3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Tugas1();
        Tugas2();
    }
    
}
