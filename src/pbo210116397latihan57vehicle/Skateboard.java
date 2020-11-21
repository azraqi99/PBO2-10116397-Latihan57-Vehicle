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
public class Skateboard extends Vehicle {
    private double myBoardLeght;
    public Skateboard(){
        System.out.println("Skateboard");
    }

    public double getBoardLeght() {
        return myBoardLeght;
    }

    public void setBoardLeght(double myBoardLeght) {
        this.myBoardLeght = myBoardLeght;
    }
}
