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

---

✨ Terima kasih telah melihat project ini!
```


tinggal bilang, aku rapikan lagi 👌
