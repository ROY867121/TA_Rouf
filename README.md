# TA_Rouf

Pseudocode Program Koperasi
Deklarasi Variabel
Buat array list untuk menyimpan data:
listNoInduk, listNama, listKoperasi, listSimpanan, listBunga, listNilai.
Gunakan Scanner untuk input pengguna.
Fungsi Utama
Tampilkan menu utama:
Opsi:
1: Tambah data.
2: Lihat laporan.
3: Edit data.
4: Hapus data.
5: Keluar.
Ambil input pengguna untuk menu.
Berdasarkan pilihan:
Jika 1: Panggil isiData.
Jika 2: Panggil lihatLaporan.
Jika 3: Panggil koreksiData.
Jika 4: Panggil hapusData.
Jika 5: Tampilkan pesan selesai dan keluar.
Jika pilihan tidak valid: Tampilkan pesan error, kembali ke menu utama.
Fungsi isiData
Ambil input:
Nama.
Nomor induk.
Pilihan koperasi dari daftar (1-5).
Jumlah simpanan.
Bunga.
Hitung total simpanan:
makefile
Salin kode
total = simpanan * (1 + bunga / 100)
Simpan data ke masing-masing array list.
Tanyakan apakah ingin menambah data lagi:
Jika ya: Ulangi proses.
Jika tidak: Kembali ke menu utama.
Fungsi lihatLaporan
Tampilkan data per halaman (jika data banyak).
Untuk setiap data, tampilkan:
Nomor induk.
Nama.
Koperasi.
Simpanan.
Bunga.
Total.
Setelah semua data selesai ditampilkan, kembali ke menu utama.
Fungsi koreksiData
Ambil input nomor data yang akan dikoreksi.
Jika nomor valid:
Tampilkan data lama.
Ambil input simpanan baru.
Hitung ulang total simpanan.
Simpan perubahan ke array list.
Jika tidak valid:
Tampilkan pesan error.
Kembali ke menu utama.
Fungsi hapusData
Ambil input nomor data yang akan dihapus.
Jika nomor valid:
Hapus data dari semua array list.
Tampilkan pesan sukses.
Jika tidak valid:
Tampilkan pesan error.
Kembali ke menu utama.
Keluar Program
Jika pengguna memilih keluar, tampilkan pesan selesai dan akhiri program.
Program selesai.
