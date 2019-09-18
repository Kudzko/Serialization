package by.kudko.serialization.custom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Student implements Serializable {
    private String name;
    private int age;
    private int mark;
    private transient double money;

    public Student() {
    }

    public Student(String name, int age, int mark, double money) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.money = money;
    }

    private void writeObject(ObjectOutputStream outputStream) throws
            IOException {

        outputStream.defaultWriteObject();
        outputStream.writeDouble(getMoney());

    }

    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
        setMoney(inputStream.readDouble());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                ", money=" + money +
                '}';
    }
}
