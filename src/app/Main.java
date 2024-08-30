package app;

public class Main {
    public static void main(String[] args) {
        DayAdvisor advisor = new DayAdvisor();

        advisor.advise(Day.MONDAY);    // Stay focused and productive at work!
        advisor.advise(Day.FRIDAY);    // Happy Friday!
        advisor.advise(Day.SATURDAY);  // It's the weekend! Consider visiting a park, a museum, or a cafe!
    }
}
