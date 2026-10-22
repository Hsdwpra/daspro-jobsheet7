import java.util.Scanner;
public class tugas2Parkir {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total= 0;

        do{
            System.out.print("jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis ==2) {
                System.out.print("Durasi parkir (dalam jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total = durasi * 3000;
                } else if (jenis == 2) {
                    total = durasi * 2000;
                }
                else {
                System.out.println("Jenis tidak valid");
                continue;
            }
            }
        }while (jenis != 0);
        System.out.println(total);
        sc.close();
    }
}
