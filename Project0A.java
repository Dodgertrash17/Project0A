import java.util.Scanner;

public class Project0A {
    public static void main(String[] args) {
        
        Scanner kboard = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = kboard.nextInt();
        if (value == 1) {
            
        }


        kboard.close();
    }

    public double problemOne(double b, double h) {
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
        
        return longestText;
    }

    

}