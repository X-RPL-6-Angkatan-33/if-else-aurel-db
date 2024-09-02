//Driver Class
import java.util.Scanner;

public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();
        
        Siswa ari = new Siswa(id, nama, ipk);
        //Nilai di atas 75 lulus 
        if (ari.getIpk() >= 75){
            System.out.println(ari.getNama() + "Lulus");

        } else {
            System.out.println(ari.getNama() + "Tidak lulus");

        }
        
        //Nilai Huruf
        if(ari.getIpk() < 60){
            System.out.println("E");
        } else if (ari.getIpk() > 60 && ari.getIpk() <= 70){
            System.out.println("D");
        } else if (ari.getIpk() > 71 && ari.getIpk() <= 80){
            System.out.println("C");
        } else if (ari.getIpk() > 81 && ari.getIpk() <= 90){
            System.out.println("B");
        } else if (ari.getIpk() > 91 && ari.getIpk() <= 100){
            System.out.println("A");
        }

        if(ari.getIpk() <-0)
        
        in.close();
    }
    
}
