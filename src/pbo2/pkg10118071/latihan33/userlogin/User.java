/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan33.userlogin;

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
public class User {
    //syarat class = nama class, attribut dan method
    
    //attribut
    private String username;
    private String password;
    private boolean statusAkun;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatusAkun() {
        return statusAkun;
    }

    public void setStatusAkun(boolean statusAkun) {
        this.statusAkun = statusAkun;
    }
    
    //method
    private boolean cekAkun(String parUserName, String parPassword){
        statusAkun = parUserName.equals("RizkiAdam") && parPassword.equals("terbaikselalu");
        return statusAkun;
    }
    
    private void hasilLogin(boolean status, String parUserName){
        if(statusAkun){
            System.out.println("\n*****HALLO RIZKIADAM*****");
            System.out.println("Selamat Datang di Aplikasi Ini");
        } else {
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword){
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}
