package org.advent.day1;

/**
 * Elf that is assigned calories
 */
public class Elf implements Comparable<Elf> {

    private int totalCalories = 0;

    /**
     * Calories carried by the Elf
     * @return total calories
     */
    public int getTotalCalories() {
        return totalCalories;
    }

    @Override
    public int compareTo(Elf arg0) {
        return totalCalories - arg0.getTotalCalories();
        // if (totalCalories == arg0.getTotalCalories()){
        //     return 0;
        // }
        // if (totalCalories < arg0.getTotalCalories()){
        //     return -1;
        // }
        // return 0;
    }

    public void add(int toAdd) {
        totalCalories += toAdd;
    }

}
