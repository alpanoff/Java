package com.company;

public class Person {
    private String name;//имя участника
    private int number;// номер участника
    private int maxSwim;//max участник может проплыть
    private int currentSwim = 0;

    public Person(String name, int number, int maxSwim, int currentSwim) {
//        super(name, number, maxSwim, currentSwim);

        this.name = name;
        this.number = number;
        this.maxSwim = maxSwim;
        this.currentSwim = currentSwim;

    }
    //участник max может проплыть
    public static void maxSwim(int countSwim, int currentSwim, int maxSwim, String name) {
        if (currentSwim + countSwim < maxSwim) {
            currentSwim += countSwim;
            System.out.println(name + " successfully swim " + countSwim + " metra(ov)");

        } else {
            System.out.println(name + " drowned");

        }

    }

    public int getMaxSwim() {
        return maxSwim;
    }
}
