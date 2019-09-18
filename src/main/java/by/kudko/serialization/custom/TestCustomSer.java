package by.kudko.serialization.custom;

public class TestCustomSer {
    public static void main(String[] args) {
        String fileName = "c:\\Test\\serializationStudent.bin";
        Student student = new Student("Alex", 20, 8, 150.0);

        StudentSerializator.write(student, fileName);
        System.out.println(StudentSerializator.read(fileName));
    }
}
