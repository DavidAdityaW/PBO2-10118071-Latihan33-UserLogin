/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan33.userlogin;

import java.util.Scanner;

/**
*
* @author 
* NAMA              : David Aditya Winarto
* KELAS             : PBO2
* NIM               : 10118071
* Deskripsi Program : Program ini berisi program untuk login
*                     dengan konsep pendekatan objek
* 
*/
public class PBO210118071Latihan33UserLogin {

    private static String usName;
    private static String passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User user = new User();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName = input.next();
        
        System.out.print("Masukkan Password = ");
        passWord = input.next();
        
        user.pengecekkanLogin(usName, passWord);
    }
    
}
