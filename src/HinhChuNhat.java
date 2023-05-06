public class HinhChuNhat {
    private float chieuDai, chieuRong;

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;

    }

    public float dienTich() {
        return chieuRong * chieuDai;

    }

    public float chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public String toString() {
        return "chieu dai: " + chieuDai + "\n" + "chieuRong: " + chieuRong + "\n" + "dientich: " + dienTich() + "\n"
                + "chuVi: " + chuVi();
    }

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(10, 20);
        System.out.println(hcn.toString());
    }

}
