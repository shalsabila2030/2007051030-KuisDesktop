package setrika.model;

public class setrika {
    private String id;
    private String nama;
    private String harga;
    private String tgl_produksi;
    private String jenis;
    private String merk;

    public setrika(String id, String nama, String harga, String tgl_produksi, String jenis, String merk) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.tgl_produksi = tgl_produksi;
        this.jenis = jenis;
        this.merk = merk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getTgl_produksi() {
        return tgl_produksi;
    }

    public void setTgl_produksi(String tgl_produksi) {
        this.tgl_produksi = tgl_produksi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
}
