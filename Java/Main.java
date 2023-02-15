import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // deklarasi objek
        Mahasiswa m = new Mahasiswa();

        // deklarasi variabel temp data
        String name, gender, univ, email, fakultas, prodi;
        int nik, nim;

        // deklarasi array list objek
        ArrayList<Mahasiswa> list = new ArrayList<>();

        // inisialisasi variabel main
        int cekMenu = 0;
        int n = 0;
        int delete = 0;
        int update = 0;
        String menu = null;

        // scanner
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n===== Menu Data =====");
            System.out.println("1)Add -- 2)Delete -- 3)Update");
            System.out.print("Masukkan pilihan menu : ");

            // input dan cek integer
            try {
                cekMenu = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Input bukan integer!");
            }

            /* menu */
            if (cekMenu == 1) {
                /* add data */

                // input dan cek integer
                System.out.print("Masukkan banyaknya data : ");
                try {
                    n = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Input bukan integer!");
                }

                /* loop input */
                for (int j = 0; j < n; j++) {

                    // input
                    nik = sc.nextInt();
                    name = sc.next();
                    gender = sc.next();
                    univ = sc.next();
                    email = sc.next();
                    nim = sc.nextInt();
                    fakultas = sc.next();
                    prodi = sc.next();

                    // set input
                    m = new Mahasiswa();
                    m.setNik(nik);
                    m.setName(name);
                    m.setGender(gender);
                    m.setUniv(univ);
                    m.setEmail(email);
                    m.setNim(nim);
                    m.setFakultas(fakultas);
                    m.setProdi(prodi);

                    // masukkan data ke dalam list
                    list.add(m);
                }
            } else if (cekMenu == 2) {
                /* delete data */

                // input index
                System.out.print("Masukkan no data yang ingin di hapus : ");
                try {
                    delete = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Input bukan integer!");
                }

                // cek index
                if (delete > list.size()) {
                    System.out.println("\nIndex tidak ditemukan!!");
                } else {
                    // delete list
                    list.remove((delete - 1));
                }
            } else if (cekMenu == 3) {
                /* update data */

                // input index
                System.out.print("Masukkan no data yang ingin di ganti : ");
                try {
                    update = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Input bukan integer!");
                }

                // cek index
                if (update > list.size()) {
                    System.out.println("\nIndex tidak ditemukan!!");
                } else {
                    // input data
                    System.out.println("Masukan data yang ingin diganti : ");
                    nik = sc.nextInt();
                    name = sc.next();
                    gender = sc.next();
                    univ = sc.next();
                    email = sc.next();
                    nim = sc.nextInt();
                    fakultas = sc.next();
                    prodi = sc.next();

                    // set update data
                    m = new Mahasiswa();
                    m.setNik(nik);
                    m.setName(name);
                    m.setGender(gender);
                    m.setUniv(univ);
                    m.setEmail(email);
                    m.setNim(nim);
                    m.setFakultas(fakultas);
                    m.setProdi(prodi);

                    // masukkan data ke dalam list
                    list.set((update - 1), m);
                }

            } else {
                System.out.println("Menu tidak ada!");
            }

            /* output */
            if (list.size() == 0) {
                System.out.println("\nList kosong!!");
            } else {
                System.out.println("\n----------------------- Data Mahasiswa -------------------------");
                for (int j = 0; j < list.size(); j++) {
                    System.out.println("\nMahasiswa ke-" + Integer.toString(j + 1));
                    System.out.println("Data Human : " + list.get(j).getNik() + " --- " + list.get(j).getName()
                            + " ---- " + list.get(j).getGender());
                    System.out.println("Data Civitas : " + list.get(j).getUniv() + " --- " + list.get(j).getEmail());
                    System.out.println("Data Human : " + list.get(j).getNim() + " --- " + list.get(j).getFakultas()
                            + " ---- " + list.get(j).getProdi());
                }
                System.out.println("\n----------------------------------------------------------------");
            }

            /* loop menu */
            System.out.print("\nKetik 't' lanjut atau ketik apa saja untuk keluar dari menu : ");
            menu = sc.next();
        } while (menu.equals("t"));

        sc.close();
    }
}

/*
 * 327324
 * Muhammad_Aditya
 * L
 * UPI
 * mdhstama@upi.edu
 * 2000360
 * FPMIPA
 * Ilmu_Komputer
 * 327325
 * Fahreza_Priyatna
 * L
 * UPI
 * maxap14@upi.edu
 * 20004222
 * FPTK
 * Teknik_Elektro
 */