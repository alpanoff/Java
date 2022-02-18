package com.company;

public class Course {

 //   public static Object maxSwim;
    private static int maxSwim;
    private String name;
    private int swim;
    private int currentSwim;
    private int countSwim;


    public Course(String name, int swim, int maxSwim, int currentSwim, int countSwim) {
        this.swim = swim;
        this.setMaxSwim(maxSwim);
        this.currentSwim = 0;
        this.name = name;
        this.countSwim = countSwim;



    }

    public static int getMaxSwim() {
        return maxSwim;
    }

    public static void setMaxSwim(int maxSwim) {
        Course.maxSwim = maxSwim;
    }


    public void maxSwim(int countSwim,String name, int swim, int currentSwim, int maxSwim) {
        if (this.currentSwim + countSwim < this.getMaxSwim()) {
            this.currentSwim += countSwim;
            System.out.println(this.name + " successfully swim " + countSwim + " metra(ov)");

        } else {
            System.out.println(this.name + " drowned");

        }
    }
}
