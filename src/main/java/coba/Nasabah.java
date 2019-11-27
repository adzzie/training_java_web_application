package coba;

/**
 * Description Nasabah
 *
 * @author aji gojali
 */
public class Nasabah {
    public static Integer jumlahNasabah = 0;
    private String nama;
    private String email;

    public Nasabah() {
        this.nama = nama;
        this.email = email;
        jumlahNasabah = jumlahNasabah + 1;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
