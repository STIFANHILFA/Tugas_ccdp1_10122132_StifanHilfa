/**
 * Kelas AbsensiKaryawan berfungsi untuk mencatat dan menampilkan
 * data absensi karyawan secara sederhana.
 *
 * Contoh ini dibuat untuk menunjukkan penggunaan JavaDocs
 * dengan tag @param, @return, dan @throws.
 */
public class AbsensiKaryawan {

    /** Nama karyawan. */
    private String nama;

    /** Jam kehadiran karyawan. */
    private String jamKehadiran;

    /**
     * Konstruktor untuk membuat objek AbsensiKaryawan baru.
     *
     * @param nama nama karyawan
     * @param jamKehadiran jam saat karyawan hadir
     */
    public AbsensiKaryawan(String nama, String jamKehadiran) {
        this.nama = nama;
        this.jamKehadiran = jamKehadiran;
    }

    /**
     * Mengambil nama karyawan.
     *
     * @return nama karyawan
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil jam kehadiran karyawan.
     *
     * @return jam kehadiran karyawan
     */
    public String getJamKehadiran() {
        return jamKehadiran;
    }

    /**
     * Menampilkan data absensi karyawan ke layar.
     *
     * @throws NullPointerException jika nama atau jam kehadiran kosong
     */
    public void tampilkanAbsensi() throws NullPointerException {
        if (nama == null || jamKehadiran == null) {
            throw new NullPointerException("Data karyawan belum lengkap!");
        }

        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Jam Kehadiran : " + jamKehadiran);
        System.out.println("---------------------------------");
    }

    /**
     * Method utama untuk menjalankan program absensi karyawan.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        System.out.println("=== Sistem Absensi Karyawan ===");

        AbsensiKaryawan k1 = new AbsensiKaryawan("Andi", "07:45");
        AbsensiKaryawan k2 = new AbsensiKaryawan("Budi", "07:50");
        AbsensiKaryawan k3 = new AbsensiKaryawan("Citra", "08:00");

        k1.tampilkanAbsensi();
        k2.tampilkanAbsensi();
        k3.tampilkanAbsensi();

        System.out.println("Data absensi selesai ditampilkan.");
    }
}
