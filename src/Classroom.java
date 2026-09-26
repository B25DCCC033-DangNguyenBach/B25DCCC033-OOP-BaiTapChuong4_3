import java.util.ArrayList;

public class Classroom {
    private String tenLop;
    private ArrayList<Student> danhSach = new ArrayList<>();

    public Classroom(String tenLop) {
        this.tenLop = tenLop;
    }

    public void addStudent(Student sv) {
        for (Student s : danhSach) {
            if (s.getMssv().equalsIgnoreCase(sv.getMssv())) {
                throw new IllegalArgumentException("MSSV " + sv.getMssv() + " đã tồn tại trong lớp!");
            }
        }
        danhSach.add(sv);
    }

    public String xepLoai(Student sv) {
        double dtb = sv.diemTrungBinh();
        if (dtb >= 8.0) {
            return "Giỏi";
        } else if (dtb >= 6.5) {
            return "Khá";
        } else if (dtb >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public void inBangDiem() {
        System.out.println("=== BẢNG ĐIỂM LỚP " + tenLop + " ===");
        for (Student s : danhSach) {
            System.out.println(s.getMssv() + " - " + s.getName() + " - ĐTB: " + String.format("%.2f", s.diemTrungBinh()) + " - Xếp loại: " + xepLoai(s));
        }
        System.out.println("Sĩ số lớp: " + danhSach.size() + " sinh viên.");
    }
}