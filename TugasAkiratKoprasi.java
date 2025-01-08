package tugas.akirat.koprasi;

import java.util.Scanner;
import java.util.ArrayList;
public class TugasAkiratKoprasi {

    static ArrayList<String> listNoInduk = new ArrayList<>();
    static ArrayList<String> listNama = new ArrayList<>();
    static ArrayList<String> listKoperasi = new ArrayList<>();
    static ArrayList<Double> listSimpanan = new ArrayList<>();
    static ArrayList<Double> listBunga = new ArrayList<>();
    static ArrayList<Double> listNilai = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        tampilkanMenuUtama();
    }

    static void tampilkanMenuUtama() {
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("                           PROGRAM KOPERASI SIMPAN PINJAM AL-QOHOL                                       ");
        System.out.println("                       NIM : 24.240.0079 NAMA : ABDUL ROUF AL-HUSAIBY                                ");
        System.out.println("------------------------------------------------------------------------------------------------");

        System.out.println("========================= KOPERASI SIMPAN PINJAM AL-QOHOL ================================");
        System.out.println(" 1. Isikan data ");
        System.out.println(" 2. Lihat Laporan ");
        System.out.println(" 3. Koreksi/edit data ");
        System.out.println(" 4. Hapus Data ");
        System.out.println(" 5. Selesai ");
        System.out.print("PILIH MENU > ");
        int pilihanMenu = input.nextInt();

        switch (pilihanMenu) {
            case 1:
                isiData();
                break;
            case 2:
                lihatLaporan();
                break;
            case 3:
                koreksiData();
                break;
            case 4:
                hapusData();
                break;
            case 5:
                System.out.println("Terima kasih. Program selesai.");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                tampilkanMenuUtama();
        }
    }

    static void isiData() {
        System.out.println("");
        System.out.print("Masukkan Nama : ");
        String nama = input.next();
        System.out.print("Masukkan No Induk : ");
        String noInduk = input.next();

        System.out.println("\t\t\t----------------------------------");
        System.out.println("\t\t\t\tDAFTAR KOPERASI AL-QOHOL");
        System.out.println("\t\t\t----------------------------------\n");
         System.out.println("\t1. KOPERASI SEJAHTERA \n" +
                "\t\t Tabungan harian dengan bunga kompetitif.\n" +
                "\t\t Minimal setoran awal Rp50.000.\n");
        System.out.println("\t2. KOPERASI EDUKASI ANAK BANGSA \n" +
                "\t\t Tabungan pendidikan untuk anak sekolah.\n" +
                "\t\t Memberikan hadiah buku setiap bulan.\n");
        System.out.println("\t3. KOPERASI INVESTASI MUDA \n" +
                "\t\t Tabungan dengan tujuan investasi masa depan.\n" +
                "\t\t Dilengkapi fitur asuransi investasi.\n");
        System.out.println("\t4. KOPERASI QURBAN BERKAH \n" +
                "\t\t Tabungan untuk qurban yang direncanakan sejak dini.\n" +
                "\t\t Bekerja sama dengan berbagai lembaga qurban terpercaya.\n");
        System.out.println("\t5. KOPERASI UMROH DAN HAJI BAROKAH \n" +
                "\t\t Simpanan khusus untuk persiapan perjalanan ibadah.\n" +
                "\t\t Gratis biaya administrasi pembukaan rekening.\n");
        System.out.print("Isikan Data [1-5] : ");
        int daftarKoperasi = input.nextInt();
        String koperasi = null;

        switch (daftarKoperasi) {
            case 1:
                koperasi = "KOPERASI SEJAHTERA";
                break;
            case 2:
                koperasi = "KOPERASI EDUKASI ANAK BANGSA";
                break;
            case 3:
                koperasi = "KOPERASI INVESTASI MUDA";
                break;
            case 4:
                koperasi = "KOPERASI QURBAN BERKAH";
                break;
            case 5:
                koperasi = "KOPERASI UMROH DAN HAJI BAROKAH";
                break;
        }

        System.out.print("Masukkan Jumlah Simpanan : Rp. ");
        double simpanan = input.nextDouble();
        System.out.print("Masukkan Bunga (%): ");
        double bunga = input.nextDouble();

        double total = simpanan * (1 + bunga / 100);

        listNoInduk.add(noInduk);
        listNama.add(nama);
        listKoperasi.add(koperasi);
        listSimpanan.add(simpanan);
        listBunga.add(bunga);
        listNilai.add(total);

        System.out.println("DATA BERHASIL DISIMPAN.");
        System.out.print("Apakah Anda ingin mengisi data lagi? [y/t] : ");
        String jawab = input.next();
        if ("y".equalsIgnoreCase(jawab)) {
            isiData();
        } else {
            tampilkanMenuUtama();
        }
    }

    static void lihatLaporan() {
        int JUMLAH_DATA_PER_HALAMAN = 3; // Jumlah data per halaman
        int totalData = listNoInduk.size(); // Total data
        int totalHalaman = (int) Math.ceil((double) totalData / JUMLAH_DATA_PER_HALAMAN); // Total halaman
        int dataDitampilkan = 0;

        for (int halamanSaatIni = 1; halamanSaatIni <= totalHalaman; halamanSaatIni++) {
            System.out.println("\nLAPORAN SIMPANAN KOPERASI - HALAMAN " + halamanSaatIni);
            System.out.println(" ________________________________________________________________________________________________________________________________");
            System.out.println("| No |    NO INDUK   |      NAMA     |               KOPERASI               |        SIMPANAN      |   BUNGA    |      TOTAL      |");
            System.out.println("|----|---------------|---------------|--------------------------------------|----------------------|------------|-----------------|");

            double subtotal = 0;

            for (int i = 0; i < JUMLAH_DATA_PER_HALAMAN && dataDitampilkan < totalData; i++) {
                String noInduk = listNoInduk.get(dataDitampilkan);
                String nama = listNama.get(dataDitampilkan);
                String koperasi = listKoperasi.get(dataDitampilkan);
                double simpanan = listSimpanan.get(dataDitampilkan);
                double bunga = listBunga.get(dataDitampilkan);
                double total = listNilai.get(dataDitampilkan);

                subtotal += total;

                System.out.printf("| %-2d | %-13s | %-13s | %-36s | %-20.2f | %-10.2f | %-15.2f |\n",
                        dataDitampilkan + 1, noInduk, nama, koperasi, simpanan, bunga, total);
                dataDitampilkan++;
            }

            System.out.println("|_________________________________________________________________________________________________________________________________|");
            System.out.printf("|           %-76s | %-20s | %-15.2f |\n", "", "SUBTOTAL HALAMAN " + halamanSaatIni, subtotal);
            System.out.println("|_________________________________________________________________________________________________________________________________|");


            if (halamanSaatIni < totalHalaman) {
                System.out.print("\nTekan Enter untuk melihat halaman berikutnya...");
                input.nextLine(); // Menunggu pengguna menekan Enter
                input.nextLine(); // Untuk menghindari bug karena nextLine() setelah nextInt()
            }
        }

        System.out.println("\nSemua data telah ditampilkan.");
        tampilkanMenuUtama();
    }

    static void koreksiData() {
        System.out.print("Masukkan Nomor Data Yang Akan Dikoreksi\t: ");
        int nomorData = input.nextInt();

        if (nomorData >= 1 && nomorData <= listNoInduk.size()) {
            System.out.println("Data saat ini: Koperasi\t\t: " + listKoperasi.get(nomorData - 1) + "\t\tSimpanan: " + listSimpanan.get(nomorData - 1));
            System.out.print("Masukkan Jumlah Simpanan Baru\t: ");
            double simpananBaru = input.nextDouble();

            // Menghitung kembali nilai dan menyimpan perubahan
            double bunga = listBunga.get(nomorData - 1);
            double total = simpananBaru * (1 + bunga / 100);
            listSimpanan.set(nomorData - 1, simpananBaru);
            listNilai.set(nomorData - 1, total);

            System.out.println("Data berhasil dikoreksi.");
          } else {
            System.out.println("Nomor data tidak valid.");
        }

            tampilkanMenuUtama();
    }

    static void hapusData() {
        System.out.print("Masukkan Nomor Data Yang Akan Dihapus\t: ");
        int nomorData = input.nextInt();

        if (nomorData >= 1 && nomorData <= listNoInduk.size()) {
            System.out.println("Data Yang Dihapus: Koperasi\t\t: " + listKoperasi.get(nomorData - 1) + "\t\tSimpanan: " + listSimpanan.get(nomorData - 1));
            listKoperasi.remove(nomorData - 1);
            listSimpanan.remove(nomorData - 1);
            listBunga.remove(nomorData - 1);
            listNoInduk.remove(nomorData - 1);
            listNama.remove(nomorData - 1);
            listNilai.remove(nomorData - 1);
            System.out.println("Data Berhasil Dihapus.");
        } else {
            System.out.println("Nomor Data Tidak Valid.");
        }

        tampilkanMenuUtama();
    }
}