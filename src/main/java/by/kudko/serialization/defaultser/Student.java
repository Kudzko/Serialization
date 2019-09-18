package by.kudko.serialization.defaultser;

import java.io.Serializable;

 class  Skill implements Serializable{
    public String skill;

     public Skill() {
     }

     public Skill(String skill) {
         this.skill = skill;
     }

     public String getSkill() {
         return skill;
     }

     public void setSkill(String skill) {
         this.skill = skill;
     }

     @Override
     public String toString() {
         return "Skill{" +
                 "skill='" + skill + '\'' +
                 '}';
     }
 }
public class Student implements Serializable {
    private String name;
    private int age;
    private int mark;
    private transient double money;
    private Skill skill;

    public Student() {
    }

    public Student(String name, int age, int mark, double money, Skill skill) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.money = money;
        this.skill = skill;
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
