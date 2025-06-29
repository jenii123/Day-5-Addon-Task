package task3;

import java.util.HashMap;

public class StudentMarks 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Suchan", 85);
        marks.put("jeni", 90);
        marks.put("dharsh", 78);

        int total = 0;
        for (int mark : marks.values()) 
        {
            total += mark;
        }
        double average = (double) total / marks.size();

        System.out.println("Average Marks: " + average);
    }
}
