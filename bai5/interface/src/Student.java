public class Student extends Person implements Readable, Playable{
    private String className;
    private double grade;
    // comment

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public void hoc() {
        System.out.println("Tham khao cac giao trinh o truong hoc");
    }

    @Override
    public void readBook() {
        System.out.println("Sinh vien doc sach ve khoa hoc");
    }



    public void playGame() {

    }
}
