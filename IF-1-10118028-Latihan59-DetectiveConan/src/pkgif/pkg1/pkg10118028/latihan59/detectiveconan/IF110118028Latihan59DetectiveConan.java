/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan59.detectiveconan;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Detective Conan

 */
public class IF110118028Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Serial Detective Conan");
        System.out.println("\nKarakter Utama");
        Conan conan = new Conan();
        conan.tampilNama();
        conan.Pakaian();
        
        //Team Detektif Cilik
        System.out.println("\nTeam Detektif Cilik");
        TeamDetektifCilik tCilik = new TeamDetektifCilik();
        
        //Team Kogoro Mouri
        System.out.println("\nTeam Kogoro Mouri");
        TeamKogoro tKogoro = new TeamKogoro();
        
        //Sahabat Shinichi
        System.out.println("\nSahabat Shinichi");
        SahabatShinichi sShinici = new SahabatShinichi(); 
    }
    
}
