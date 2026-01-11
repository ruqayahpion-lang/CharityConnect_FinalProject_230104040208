# Charity Connect 📱  
**Platform Donasi Digital Transparan dengan Donasi Mikro dan Laporan Real-Time**

Charity Connect adalah aplikasi Android berbasis **Jetpack Compose** yang dirancang sebagai **prototype aplikasi donasi digital**. Aplikasi ini memudahkan pengguna untuk berdonasi secara digital dengan alur yang sederhana, transparan, dan aman, serta mendukung konsep **donasi mikro**.

---

## 🎯 Tujuan Proyek

Proyek ini dikembangkan untuk:

- Menerapkan konsep **aplikasi donasi digital** berbasis mobile
- Mengimplementasikan **UI modern Android (Material Design 3)**
- Menguji alur donasi dari awal hingga bukti transaksi
- Menjadi **prototype fungsional** yang dapat dikembangkan lebih lanjut

---

## 🧠 Metodologi Pengembangan

Menggunakan pendekatan **ATM (Amati – Tiru – Modifikasi)**:

1. **Amati**  
   Menganalisis aplikasi donasi digital populer dan pola UI/UX-nya.

2. **Tiru**  
   Mengadopsi fitur inti seperti login, daftar program, donasi, dan riwayat.

3. **Modifikasi**  
   Menambahkan konsep:
   - Donasi mikro
   - Timeline laporan
   - Alur donasi yang lebih ringkas

---

## 📱 Fitur Utama

### Pengguna
- Splash Screen
- Onboarding
- Login
- Home (Daftar Program Donasi)
- Detail Program Donasi (dengan scroll)
- Pilih Nominal Donasi
- Konfirmasi Donasi
- Bukti Donasi
- Riwayat Donasi
- Profil Pengguna

### Sistem
- Navigasi menggunakan **Navigation Compose**
- UI berbasis **Material Design 3**
- Dummy data untuk simulasi donasi
- Alur aplikasi tidak crash dan dapat dijalankan

---

## 🔁 User Flow

```

Splash
→ Onboarding
→ Login
→ Home
→ Detail Program
→ Pilih Nominal
→ Konfirmasi
→ Bukti Donasi
→ Home

```

---

## 🛠️ Teknologi yang Digunakan

- **Bahasa**: Kotlin
- **UI**: Jetpack Compose
- **Design System**: Material Design 3
- **Navigation**: Navigation Compose
- **State Management**: Compose State
- **Minimum SDK**: 24
- **Target SDK**: 36

---

## 📂 Struktur Folder (Ringkas)

```

ui/
├─ splash/
├─ onboarding/
├─ auth/
├─ home/
├─ program/
├─ donation/
├─ donate/
├─ history/
└─ profile/

navigation/
├─ AppNav.kt
└─ NavRoute.kt

ui/theme/
├─ Color.kt
├─ Theme.kt
└─ Type.kt

```

---

## ✅ Status Proyek

✔️ Aplikasi **dapat di-run dan build**  
✔️ Alur utama donasi **berjalan dengan baik**  
✔️ Navigasi antar layar **stabil**  
✔️ Cocok sebagai **prototype / final project / UAS**

> Catatan:  
> Tahap selanjutnya (opsional) adalah **perapihan styling UI** agar semakin presisi dengan desain Figma.

---

## 🚀 Cara Menjalankan Project

1. Clone repository ini
2. Buka dengan **Android Studio**
3. Pastikan SDK & Gradle sudah sinkron
4. Jalankan di emulator atau device Android

---

## 👤 Developer

- Nama: Ruqayah
- Program Studi: Teknologi Informasi
- Tahun: 2026

---

## 📌 Catatan Akhir

Project ini difokuskan pada:
- Struktur aplikasi
- Alur pengguna
- Implementasi teknis Jetpack Compose

Bukan sebagai produk komersial, melainkan **prototype akademik dan pembelajaran**.
![WhatsApp Image 2026-01-12 at 07 14 11](https://github.com/user-attachments/assets/cb230ecb-43de-4c7d-a47e-520299aa76a2)
![WhatsApp Image 2026-01-12 at 07 14 11 (1)](https://github.com/user-attachments/assets/25838fa4-74c2-4d0c-85f5-441b8d7ed49c)
![WhatsApp Image 2026-01-12 at 07 14 12](https://github.com/user-attachments/assets/dde3cb51-cfac-4623-aa21-a8a0cd7fb2b0)
![WhatsApp Image 2026-01-12 at 07 14 12 (1)](https://github.com/user-attachments/assets/7473cf66-16e7-48c2-9b23-eb12597f98b0)
![WhatsApp Image 2026-01-12 at 07 14 12 (2)](https://github.com/user-attachments/assets/056a0e7d-a648-4279-a6fe-938b4d3e176c)
![WhatsApp Image 2026-01-12 at 07 14 13](https://github.com/user-attachments/assets/891724af-6c23-4cc3-a4be-fca89f9b4c88)
![WhatsApp Image 2026-01-12 at 07 14 13 (1)](https://github.com/user-attachments/assets/8bda333f-0bc7-41a1-a813-c759c3450969)
![WhatsApp Image 2026-01-12 at 07 14 13 (2)](https://github.com/user-attachments/assets/290f4040-15db-49ab-a1e8-9f02fed055f8)
![WhatsApp Image 2026-01-12 at 07 14 14](https://github.com/user-attachments/assets/6aaf7b41-5ef5-48dd-93fc-77513fa070a4)
![WhatsApp Image 2026-01-12 at 07 14 14 (1)](https://github.com/user-attachments/assets/fa41bc11-3305-49d8-b894-c08ffe147ba2)
![WhatsApp Image 2026-01-12 at 07 14 14 (2)](https://github.com/user-attachments/assets/b21ba848-36c8-4375-9ac9-b8c732390204)
![WhatsApp Image 2026-01-12 at 07 14 15](https://github.com/user-attachments/assets/566c587a-129e-4a37-b58e-0e961718bdfc)

✨ Terima kasih telah melihat project ini!
```



