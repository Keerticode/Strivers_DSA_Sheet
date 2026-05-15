import java.util.Objects;

public class student {

    int rollNo;
    String name;

    public student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        student stud = (student) o;

        return rollNo == stud.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}