package thigk2.tranducviet;

public class DuLich {
    private String tenDiaDiem;
    private String diaChi;
    private int idAnh;

    public DuLich(String tenDiaDiem, String diaChi, int idAnh) {
        this.tenDiaDiem = tenDiaDiem;
        this.diaChi = diaChi;
        this.idAnh = idAnh;
    }

    // Getter cho Adapter dùng
    public String getTenDiaDiem() { return tenDiaDiem; }
    public String getDiaChi() { return diaChi; }
    public int getIdAnh() { return idAnh; }
}