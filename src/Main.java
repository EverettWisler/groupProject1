import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    private ArrayList<String> namesArrayList;
    public static void loadDataBase(){

    }
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name);
    }
}