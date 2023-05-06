public class Sach {
    private String tenSach;
    private String tacGia;
    private int soLuong;
    private int NamSx;

    public Sach(String tenSach, String tacGia, int soLuong, int NamSx){
        this.tenSach=tenSach;
        this.tacGia=tacGia;
        this.soLuong=soLuong;
        this.NamSx=NamSx;
    }

    public void display() {
        System.out.println(
                "tenSach : " + tenSach + "\n" + "tacgia : " + tacGia + "\n" + "soLuong : " + soLuong + "\n" + "namSx : " + NamSx);
    }
public static void main(String[] args) {
    Sach s=new Sach(" em yeu anh ", "van dat", 10 , 2003);
    s.display();
}
}