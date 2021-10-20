package com.konopackipio1;

import java.util.List;
import java.util.Optional;

class Student {
    String name;
    Optional<Double> score = Optional.empty();

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Double score) {
        this.name = name;
        this.score = Optional.ofNullable(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public Optional<Double> getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = Optional.ofNullable(score);
    }

    @Override
    public String toString() {
        return name + ", score: " + score.get();
    }

}

public class OptionalExample {
    public static void main(String[] args) {
        Student student1 = new Student("Tomasz", 100.0);
        Student student2 = new Student("Cyprian");

        List.of(student1, student2)
            .stream()
            .filter(s -> s.getScore().isPresent())
            .forEach(System.out::println);
    }
    
}
