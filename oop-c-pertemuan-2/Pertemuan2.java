package pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
        
        
/**
 *
 * @author Rambu intan
 * TGL: 15 Maret 2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String mhs="Rambu intan Tenga Lunga";
      long nim=2301010317L;
      String kelas="C";
      
      BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
      try{
          System.out.print("Input Nama Mahasiswa:");
          mhs = dtIN.readLine(); 
          
           System.out.print("Input Nim:");
           nim = Long.parseLong(dtIN.readLine() ); 
          
           
      }catch(IOException e){
          System.out.println("Errol!");
      }
      
      kelas = JOptionPane.showInputDialog("Input Kelas");
              
      System.out.println("Data "+mhs+" dengan NIM "+nim+ "berada di kelas "+kelas);
      System.out.print(nim);
    }
    
}
