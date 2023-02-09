package 스트림예제2번;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("이태석",90));
        list.add(new Student("이석태",89));
        list.add(new Student("석이태",78));

        list.stream().forEach(s->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " - " + score );
        });

        double avr = list.stream().mapToInt(Student::getScore).average().getAsDouble();

    }
}

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}