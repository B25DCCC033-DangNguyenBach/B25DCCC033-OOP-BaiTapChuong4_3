public class Student {
    private static int counter = 0;

    private String mssv;
    private String name;
    private double diemCC;
    private double diemGK;
    private double diemCK;
    private String email;
    private String sdt;

    public Student(String name, double diemCC, double diemGK, double diemCK) {
        counter++;
        this.mssv = String.format("B21DCCN%03d", counter);
        this.name = name;
        setDiemCC(diemCC);
        setDiemGK(diemGK);
        setDiemCK(diemCK);
    }

    public static int getTotalStudents() {
        return counter;
    }

    public String getMssv() { return mssv; }
    public void setMssv(String mssv) { this.mssv = mssv; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getDiemCC() { return diemCC; }
    public void setDiemCC(double diem) {
        if (diem >= 0 && diem <= 10) {
            this.diemCC = diem;
        }
    }

    public double getDiemGK() { return diemGK; }
    public void setDiemGK(double diem) {
        if (diem >= 0 && diem <= 10) {
            this.diemGK = diem;
        }
    }

    public double getDiemCK() { return diemCK; }
    public void setDiemCK(double diem) {
        if (diem >= 0 && diem <= 10) {
            this.diemCK = diem;
        }
    }

    public String getEmail() { return email; }
    public String getSdt() { return sdt; }

    public Student capNhatEmail(String email) {
        this.email = email;
        return this;
    }

    public Student capNhatSdt(String sdt) {
        this.sdt = sdt;
        return this;
    }

    public double diemTrungBinh() {
        return (diemCC * 0.1) + (diemGK * 0.3) + (diemCK * 0.6);
    }
}