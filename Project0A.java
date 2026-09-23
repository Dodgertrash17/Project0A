import java.util.Scanner;

public class Project0A {
    public static void main(String[] args) {
        
        Scanner kboard = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = kboard.nextInt();
        if (value == 1) {
            System.out.println("Enter the base: ");
            double b = kboard.nextDouble();
            System.out.println("Enter the height: ");
            double h = kboard.nextDouble();
            System.out.println(problemOne(b, h));
        } else
            


        kboard.close();
    }

    public static double problemOne(double b, double h) {
        return b + h + Math.sqrt(b * b + h * h);
    }

    public String problemTwo(String input1, String input2) {
        return input1 + input2;
    }

    public void problemThree(String name, int age) {
        System.out.println("Your name is " + name + " and you are " + age + " years old");
    }

    public int problemFour(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) 
            sum += list[i];
        
        return sum;
    }

    public String problemFive(String[] input) {
        String longestText = "";
        for (int i = 0; i < input.length; i++) {
            if (input[i].length() > longestText.length()) {
                longestText = input[i];
            }
        }
        return longestText;
    }

    public boolean problemSix(String license) {
        
        

        return false;
    }

    public int problemSeven(String s, char c) {
        
        return 0;
    }

    public  boolean problemEight(String s) {
        
        for (int i = 0; i < s.length(); i++) {

        }
        
        return false;
    }


}