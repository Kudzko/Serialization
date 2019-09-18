package by.kudko.serialization.ownserialization;

import java.io.*;

public class StudentWorker {
    public static void write(Student student, String fileName) {

        try (DataOutputStream dataOutputStream = new DataOutputStream(new
                BufferedOutputStream(new FileOutputStream(fileName)))) {
            dataOutputStream.writeUTF(student.getName());
            dataOutputStream.writeInt(student.getAge());
            dataOutputStream.writeInt(student.getMark());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student read(String fileName) {
        Student student = null;
        try (DataInputStream dataInputStream = new DataInputStream(new
                BufferedInputStream(new FileInputStream(fileName)))) {

            student = new Student();

            student.setName(dataInputStream.readUTF());
            student.setAge(dataInputStream.readInt());
            student.setMark(dataInputStream.readInt());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return student;
    }
}
