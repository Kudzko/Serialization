package by.kudko.serialization.defaultser;


import java.io.*;

public class StudentSerializator {
    public static void write(Student student, String fileName){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new
                BufferedOutputStream(new FileOutputStream(fileName)))) {

            outputStream.writeObject(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student read(String fileName) {
        Student student = new Student();

        try (ObjectInputStream inputStream = new ObjectInputStream(new
                BufferedInputStream(new FileInputStream(fileName)))) {

            student = (Student) inputStream.readObject();
        } catch (IOException  | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return student;
    }
}
