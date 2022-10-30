import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Luas luas = new Luas();
        double n;
        System.out.println("Masukkan jari jari lingkaran = ");
        n = scan.nextDouble();

        luas.setLuas(n);
        luas.hasil();
    }

}
