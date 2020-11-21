/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Vehicle
 */
package pbo210116397latihan57vehicle;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Bicycle bcl = new Bicycle();
        bcl.setBrand("Trek Bike");
        bcl.setModel("7.4FX");
        bcl.setGearCount(23);
        System.out.println("Brand : "+bcl.getBrand());
        System.out.println("Model : "+bcl.getModel());
        System.out.println("Jumlah Gear : "+bcl.getGearCount());
        System.out.println("");
        
        Skateboard sktb = new Skateboard();
        sktb.setBrand("Ally Skate");
        sktb.setModel("Rocket");
        sktb.setBoardLeght(54.5);
        System.out.println("Brand : "+sktb.getBrand());
        System.out.println("Model : "+sktb.getModel());
        System.out.println("Panjangnya Board : "+sktb.getBoardLeght());
    }
    
}
