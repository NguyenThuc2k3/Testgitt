public class Student extends Person {
    private Double dtb;
    private String classRoom;

    @Override
    public void talk() {
    }

    public Student() {
        super();
    }

    public Student(String name, String age, String address, Double dtb, String classRoom) {
        super(name, age, address);
        this.dtb = dtb;
        this.classRoom = classRoom;
    }
}
