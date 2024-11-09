import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {


        Set<Student> students = Set.of(Student.builder().name("Hello").rollNo(1).build(),Student.builder().name("World").rollNo(2).build(),Student.builder().name("Good").rollNo(3).build(),Student.builder().name("Morning").rollNo(4).build());
        var existingMap = students.stream().collect(Collectors.toMap(Student::getRollNo, Function.identity()));

        Set<Student> newStudent = Set.of(Student.builder().name("Hello").rollNo(1).build(),Student.builder().name("World").rollNo(2).build(),Student.builder().name("Good").rollNo(3).build());
        var newStudentMap = newStudent.stream().collect(Collectors.toMap(Student::getRollNo, Function.identity()));

        existingMap.forEach((existingRollNo,existingStudent) -> {
            if (!newStudentMap.containsKey(existingRollNo)){
                var updatedStudent = existingStudent.toBuilder().isPresent(true).build();
                newStudentMap.put(existingRollNo,updatedStudent);
            }
        });

        System.out.println("ExistingMap: ");
        existingMap.forEach((key,value) -> System.out.print("Key: "+key+" Value: "+value+", "));
        System.out.println();

        System.out.println("NewStudentMap: ");
        newStudentMap.forEach((key,value) -> System.out.print("Key: "+key+" Value: "+value+", "));



    }



}
