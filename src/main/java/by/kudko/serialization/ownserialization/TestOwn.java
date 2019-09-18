package by.kudko.serialization.ownserialization;

public class TestOwn {
    public static void main(String[] args) {
        String fileName = "c:\\Test\\serializationStudent.bin";
        Student student = new Student("Alex", 27, 9);

        StudentWorker.write(student, fileName);
        System.out.println(StudentWorker.read(fileName));
    }
}
