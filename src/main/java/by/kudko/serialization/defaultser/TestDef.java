package by.kudko.serialization.defaultser;

public class TestDef {
    public static void main(String[] args) {
        String fileName = "c:\\Test\\serializationStudent.bin";
        Student student = new Student("Alex", 20, 8, 150, new Skill("Java EE"));

        StudentSerializator.write(student, fileName);
        System.out.println(StudentSerializator.read(fileName));
    }
}
