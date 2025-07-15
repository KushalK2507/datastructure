package Q_basic;

import Q_basic.pojo.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsImplementation {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student("ABC", 12, "M"));
    students.add(new Student("sdf", 42, "M"));
    students.add(new Student("sfg", 52, "M"));
    students.add(new Student("fgh", 22, "F"));
    students.add(new Student("xb", 21, "M"));
    students.add(new Student("eryt", 27, "F"));

    Comparator<Student> s = (s1, s2) -> Integer.compare(s2.getAge(), s1.getAge());

    Map<String, Long> genderCount =
        students.stream()
            .filter(st -> st.getGender() != null)
            .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
    genderCount.forEach(
        (gender, count) -> System.out.println("Gender : " + gender + " Its count is: " + count));

    List<Student> studentsSortedByName = students.stream().sorted(s).collect(Collectors.toList());
    System.out.println("Student List sorted on Name");
    studentsSortedByName.forEach(student -> System.out.println(student.toString()));

    String names =
        studentsSortedByName.stream().map(Student::getName).collect(Collectors.joining(","));
    System.out.println("Names of Student : " + names);
  }
}
