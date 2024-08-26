public class StepTracker {
    //active days
    //addDailySteps calculates steps
    //activeDays returns the number of active days
    /*averageSteps returns the average number of steps per day
    * calculated by  total # steps / # of days */

    //activeSteps = int
    //activeDays = int
    //activeDays++ when activeSteps ≥ 10000
    //totalDays = int
    //averageSteps = double --> total # steps/total # days
    //array list that stores active days and activeSteps within it

    //PROPERTIES
    private int totalSteps;
    private int totalDays;
    private int activeDays;
    private int minSteps;


    //CONSTRUCTORS
    public StepTracker(int todaysMin){
        totalSteps = 0;
        totalDays = 0;
        activeDays = 0;
        minSteps = todaysMin;
    }

    //METHODS
    public int getTotalSteps(){
        return totalSteps;
    }

    public int getDays(){
        return totalDays;
    }

    public int getActiveDays(){
        return activeDays;
    }

    public int activeDays(){
        return activeDays;
    }

    public double averageSteps(){
        if (totalSteps == 0) return 0;
        return 1.0 * totalSteps/totalDays;

    }

    public int getStepsForActiveDay(){
        return minSteps;
    }


    public void addDailySteps(int todaysMin){
        if (todaysMin >= minSteps){
            activeDays++;
        }
        totalDays++;
        totalSteps += todaysMin;

    }




}
