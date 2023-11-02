import java.util.Scanner;

public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;
        String[][] penonton = new String[4][2];
        boolean isExit = false;

        while (!isExit) {
            System.out.println("\n=====================================");
            System.out.println("=                Menu               =");
            System.out.println("=====================================");
            System.out.println("1. Input daftar penonton.");
            System.out.println("2. Tampilkan daftar penonton.");
            System.out.println("3. Exit");

            System.out.print("\nPilih menu (1/2/3): ");
            menu = sc15.nextInt();
            sc15.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("\nMasukan nama: ");
                    nama = sc15.nextLine();

                    int maxPercobaan = 3;
                    int percobaan = 0;
                    Boolean isValid = false;
                    while (!isValid) {
                        System.out.print("Masukan jumlah baris: ");
                        baris = sc15.nextInt();
                        System.out.print("Masukan jumlah kolom: ");
                        kolom = sc15.nextInt();
                        sc15.nextLine();
                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("\nData penonton berhasil ditambahkan.");
                                isValid = true;
                            } else {
                                System.out
                                        .println(
                                                "\nKursi sudah terisi oleh penonton, masukan baris dan kolom kembali!\n");
                            }
                        } else {
                            System.out.println("Kolom kursi tidak tersedia!");
                        }
                        percobaan++;
                        if (percobaan >= maxPercobaan) {
                            System.out.println("Batas percobaan anda telah habis!");
                            isValid = true;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nDaftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("\nNama Penonton: %s\nBaris ke-%d\nKolom ke-%d\n", penonton[i][j],
                                        i + 1, j + 1);
                            } else {
                                System.out.printf("\nNama Penonton: ***\nBaris ke-%d\nKolom ke-%d\n", i + 1, j + 1);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Anda keluar dari menu!");
                    isExit = true;
                    break;
                default:
                    System.out.println("Input yang anda masukkan salah, silahkan mencoba kembali!");
                    break;
            }
        }
    }
}
