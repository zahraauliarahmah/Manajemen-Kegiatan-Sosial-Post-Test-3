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

