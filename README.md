# Manajemen Kegiatan Sosial (Volunteer) 3

![Red and Beige Minimalist Brand Proposal Presentation (1)](https://github.com/user-attachments/assets/9f860c5a-9716-4e6d-8372-8dea1f3f78b2)

Nama : Zahra Aulia Rahmah

NIM : 2409116020

Kelas : A

Post Test 3 Pemograman Berorientasi Objek

# Deskripsi Program 

Program ini adalah Sistem Manajemen Kegiatan Sosial (Volunteer) yang dibuat dengan bahasa Java.
Tujuan program ini untuk membantu mencatat dan mengatur kegiatan sosial atau kegiatan relawan.

Di dalam program, pengguna bisa:

1. Menambahkan kegiatan baru beserta tanggalnya

2. Melihat daftar kegiatan yang sudah ada

3. Mengubah data kegiatan jika ada perubahan

4. Menghapus kegiatan yang tidak diperlukan

5. Mencari kegiatan tertentu berdasarkan nama atau tanggal

6. Mengakhiri program dengan memilih menu keluar

Semua kegiatan disimpan menggunakan ArrayList, dan pilihan menu dikendalikan melalui input dari pengguna. Program akan terus berjalan sampai pengguna memilih keluar.

# Struktur Program

1. Main Class

   <img width="1243" height="828" alt="image" src="https://github.com/user-attachments/assets/c61273aa-083c-40c1-b64f-95fc464dbebc" />

Kelas utama terdapat pada Main.java yang berperan sebagai titik awal eksekusi program. Di dalamnya tersedia menu interaktif yang memungkinkan pengguna melakukan penambahan, penampilan, pembaruan, penghapusan, serta pencarian data barang. Kelas Main juga berfungsi sebagai penghubung langsung dengan kelas Service, sehingga logika aplikasi dapat dijalankan sesuai instruksi dari pengguna.

2. Service

<img width="1024" height="829" alt="image" src="https://github.com/user-attachments/assets/79759408-7d70-4d78-ae76-a20f83b3f4f6" />

Kelas Service.java yang berada pada package service berfungsi sebagai pengelola utama data barang. Di dalam kelas ini terdapat logika untuk menyimpan, menambah data baru, menghapus, mencari, hingga menampilkan daftar barang. Dengan demikian, kelas Service berperan sebagai pusat pengolahan data sekaligus logika bisnis dari aplikasi.

3. Model (Kegiatan)

   <img width="1257" height="831" alt="image" src="https://github.com/user-attachments/assets/51320369-3f2d-4dc3-a761-ca2b82552565" />

Kelas Kegiatan.java yang berada dalam package model didefinisikan sebagai kelas abstrak. Kelas ini menyimpan atribut utama sebuah kegiatan seperti nama, tanggal, lokasi, dan penyelenggara. Selain menyediakan konstruktor dan getter-setter untuk setiap atribut, Kegiatan juga memiliki dua metode abstrak yang wajib diimplementasikan oleh subclass, yaitu getJenisKegiatan() dan getDeskripsiKhusus(). Dengan begitu, kelas ini berfungsi sebagai kerangka dasar (blueprint) bagi kelas turunan seperti KegiatanSosial maupun KegiatanEdukasi.

- Sub Class Kegiatan Edukasi

<img width="1066" height="312" alt="image" src="https://github.com/user-attachments/assets/5b6a9c7e-bb71-42fb-a570-3f21c10c14a5" />

  Kelas KegiatanEdukasi adalah turunan dari Kegiatan yang merepresentasikan aktivitas edukasi. Kelas ini menginisialisasi data kegiatan melalui konstruktor dan meng-override metode untuk menampilkan jenis kegiatan sebagai Edukasi serta deskripsi khususnya.

- Sub Class Kegiatan Sosial 

<img width="1075" height="329" alt="image" src="https://github.com/user-attachments/assets/681e7bc5-8b4f-47af-95d7-c8e1a854b734" />

Kelas KegiatanSosial merupakan turunan dari Kegiatan yang merepresentasikan aktivitas sosial. Kelas ini menginisialisasi data kegiatan lewat konstruktor serta meng-override metode untuk menampilkan jenis kegiatan sebagai Sosial dengan deskripsi khusus membantu masyarakat.

# Penjelasan Program 

1. Encapsulation (Getter dan Setter)
   
<img width="419" height="128" alt="image" src="https://github.com/user-attachments/assets/cee5b2d7-be57-4c5c-9b5b-678f42ada8b0" />

Pada kelas Kegiatan, seluruh atribut ditulis menggunakan akses private seperti private String nama, private String tanggal, dan lain-lain. Modifier private membuat atribut tersebut tidak bisa diakses atau diubah langsung dari luar kelas. Jika ada kode di luar yang mencoba memanggil kegiatan.nama, maka akan terjadi error.

<img width="1061" height="366" alt="image" src="https://github.com/user-attachments/assets/f13ccf9f-157c-4911-99df-7bfb7c6deabd" />

Untuk itu, disediakan metode getter dan setter. Getter berfungsi mengambil nilai dari atribut, misalnya getNama() untuk membaca nama kegiatan. Sedangkan setter digunakan untuk memberikan atau mengubah nilai, contohnya setNama(String nama) untuk memperbarui nama kegiatan.

Dengan teknik ini, programmer dapat menambahkan validasi dalam setter, misalnya memastikan tanggal berformat benar atau nama kegiatan tidak boleh kosong. Konsep ini disebut encapsulation, yang tidak hanya melindungi data tetapi juga menjamin konsistensi serta keabsahan data di dalam program.

2. Inheritance sub class

<img width="1083" height="294" alt="image" src="https://github.com/user-attachments/assets/13f6ed00-f016-4983-8869-53b670ba9425" />

Kelas KegiatanEdukasi adalah subclass yang dibuat dengan kata kunci extends Kegiatan. Artinya, kelas ini otomatis memperoleh semua atribut dan method dari kelas induk Kegiatan. Di dalamnya, method getJenisKegiatan() dan getDeskripsiKhusus() dioverride untuk memberikan identitas khusus sebagai kegiatan edukasi.

<img width="1166" height="278" alt="image" src="https://github.com/user-attachments/assets/8b6a3018-bee2-41ef-bac4-1c82774bdb6e" />

Kelas KegiatanSosial adalah subclass yang dibuat dengan kata kunci extends Kegiatan. Artinya, kelas ini otomatis memperoleh semua atribut dan method dari kelas induk Kegiatan. Di dalamnya, method getJenisKegiatan() dan getDeskripsiKhusus() dioverride untuk memberikan identitas khusus sebagai kegiatan sosial.

# Override 

overriding digunakan agar sistem dapat menampilkan informasi barang secara lebih jelas dan sesuai dengan jenisnya. Secara sederhana, overriding berarti sebuah kelas turunan dapat menimpa atau mengganti perilaku method yang diwarisi dari kelas induk.

1. Superclass

<img width="1113" height="233" alt="image" src="https://github.com/user-attachments/assets/a0d0339e-9c9d-4228-af61-bac935f6ab1e" />

Method toString() menampilkan informasi lengkap kegiatan seperti nama, tanggal, lokasi, penyelenggara, dan deskripsi. Sedangkan getInfoKegiatan() hanya menampilkan nama kegiatan dan lokasi secara singkat untuk gambaran umum.

2. SubClass

<img width="962" height="163" alt="image" src="https://github.com/user-attachments/assets/2e4ac0b8-24a7-4fda-9088-71f0f4378448" />

<img width="1068" height="156" alt="image" src="https://github.com/user-attachments/assets/8cbb737c-eff7-45e0-8491-ff6b354686aa" />

Pada kelas subclass kegiatan edukasi dan kegiatan sosial, method getJenisKegiatan() dan getDeskripsiKhusus() ditulis ulang (override) untuk memberikan nilai spesifik sesuai tipe kegiatannya. Misalnya, kelas edukasi mengembalikan jenis “KEGIATAN EDUKASI” dan deskripsi “Kegiatan edukasi untuk pembelajaran”, sedangkan kelas sosial mengembalikan “KEGIATAN SOSIAL” dan deskripsi “Kegiatan sosial untuk membantu masyarakat”. Dengan cara ini, meskipun method sama dari superclass, output yang dihasilkan lebih spesifik sesuai jenis kegiatan masing-masing.

# Alur Program

Saat program dijalankan, pengguna akan melihat menu utama dengan beberapa pilihan: Tambah, Lihat, Update, Hapus, Cari, dan Keluar.

Menu yang ada pada sistem Manajemen Kegiatan Sosial 

1. Tambah Kegiatan

<img width="545" height="563" alt="image" src="https://github.com/user-attachments/assets/20459642-6300-489a-b6f2-05b317085148" />

Jika pengguna memilih menu 1, maka memilih kegiatan edukasi atau sosial, setelah memilih lalu masukkan tanggal, lokasi dan nama penyelenggara acara kegiatan soial. 

2. Lihat Kegiatan

   <img width="821" height="271" alt="image" src="https://github.com/user-attachments/assets/5b9f4029-38b0-4dce-b4ca-12faf1fcb28b" />

Pada menu 2, program menampilkan semua kegiatan yang sudah tersimpan menggunakan perulangan.

3. Update Kegiatan
   
<img width="828" height="395" alt="image" src="https://github.com/user-attachments/assets/0e377826-895d-47bc-a0d5-6d8015455152" />

Jika memilih menu 3 yaitu Update Kegiatan, program akan menampilkan daftar kegiatan, lalu meminta untuk memasukkan nomor kegiatan yang ingin diubah, kemudian mengganti data lama yaitu nama kegiatan, tanggal, lokasi dengan data baru. Setelah itu, kegiatan berhasil di update.

4. Hapus Kegiatan

<img width="780" height="292" alt="image" src="https://github.com/user-attachments/assets/944df4dc-04e8-4214-94ac-bf9ab03cc1d7" />

Jika memilih Hapus Kegiatan pada menu 4, maka menampilkan daftar kegiatan, lalu meminta nomor kegiatan yang ingin dihapus, kemudian menghapusnya dari daftar kegiatan.

<img width="784" height="248" alt="image" src="https://github.com/user-attachments/assets/4d7e38fd-2147-4225-8fde-05b2d48e8d3e" />

Untuk cek maka pilih no 2, jika tidak ada maka kegiatan berhasil dihapus.

5. Cari Kegiatan 

<img width="760" height="250" alt="image" src="https://github.com/user-attachments/assets/b5a67e72-b812-4108-bed7-7361e590c43a" />

Pada menu 5 yaitu memilih Cari Kegiatan, meminta kata kunci, lalu menampilkan kegiatan yang cocok berdasarkan nama atau tanggal.

6. Keluar
   
<img width="569" height="247" alt="image" src="https://github.com/user-attachments/assets/d87592ff-2871-4eb2-ac77-8fab2714b6e0" />

Jika memilih menu Keluar,  maka program berhenti.
