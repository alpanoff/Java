package com.company;

public class RunClass {
    public static void main(String[] args) {
        Person[] participant = new Person[4];
        participant[0] = new Person("Иванов", 5, 100, 0);
        participant[1] = new Person("Петров", 7, 120, 0);
        participant[2] = new Person("Сидоров", 9, 140, 0);
        participant[3] = new Person("Николаев", 11, 160, 0);
        Team team = new Team("Команда", participant);

        Course course = new Course("Заплыв", 50, 150, 0, 10);

        Person.maxSwim(10, 0, 160, "Заплыв");
        Team.showTeam();

        System.out.println();
    }



}
