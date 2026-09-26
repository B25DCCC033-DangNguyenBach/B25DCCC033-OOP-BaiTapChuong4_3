public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("Lan", 8, 7.5, 9);
        Student sv2 = new Student("Nam", 9, 8, 8.5);
        Student sv3 = new Student("Hoa", 5, 4, 4.5);

        System.out.println("--- THÔNG TIN SINH VIÊN ---");
        System.out.println(sv1.getMssv() + " - " + sv1.getName() + " - ĐTB: " + String.format("%.2f", sv1.diemTrungBinh()));
        System.out.println(sv2.getMssv() + " - " + sv2.getName() + " - ĐTB: " + String.format("%.2f", sv2.diemTrungBinh()));
        System.out.println(sv3.getMssv() + " - " + sv3.getName() + " - ĐTB: " + String.format("%.2f", sv3.diemTrungBinh()));

        sv1.setDiemGK(-1);
        sv1.setDiemGK(11);

        System.out.println("\n--- THÔNG TIN CẬP NHẬT & STATIC ---");
        sv1.capNhatEmail("lan@ptit.edu.vn").capNhatSdt("0912345678");
        System.out.println("Email Lan: " + sv1.getEmail() + " | SĐT: " + sv1.getSdt());
        System.out.println("Tổng số sinh viên đã tạo: " + Student.getTotalStudents());

        System.out.println("\n--- QUẢN LÝ LỚP HỌC ---");
        Classroom lop = new Classroom("D21CQCN01");

        lop.addStudent(sv1);
        lop.addStudent(sv2);
        lop.addStudent(sv3);

        try {
            lop.addStudent(sv1);
        } catch (IllegalArgumentException e) {
            System.out.println("Bắt lỗi thành công: " + e.getMessage());
        }

        System.out.println();
        lop.inBangDiem();
    }
}