import java.util.*;

class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " - " + age;
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(10, "Abhi", 19));
        list.add(new Student(11, "Ram", 18));
        list.add(new Student(12, "Shreesh", 20));

        System.out.println("Before Sorting:");
        for (Student s : list) {
            System.out.println(s);
        }

        Collections.sort(list, new AgeComparator());

        System.out.println("\nAfter Sorting by Age:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
