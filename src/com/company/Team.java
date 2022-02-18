package com.company;

public class Team {
    private static String name;
    private Person[] participant;

    public Team(String name, Person[] participant) {
        this.name = name;
        this.participant = participant;
    }
    public static String getName() {
        return name;
    }
    public Person[] getParticipant() {
        return participant;
    }
    public static void showTeam() {
        System.out.println("Команда: " + getName());

//          printInfo(getName());
    }

    private void printInfo(String name) {
    }


}
