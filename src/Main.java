import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("E:\\java project\\email.txt");
        ArrayList<String> text = new ArrayList<>();
        String st = FileHandle.readFromFile(file);
        String[] arr = st.split("\\n");
        //System.out.println(arr);
        for (String temp : arr) {
            String[] arr2 = temp.split(";");
            text.add(arr2[2]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String str = sc.next();
        boolean found=false;
        for (String a : text) {
            if (a.contains(str)) {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("found");
        }
        else if (!found) {
            System.out.println("not found");
        }
    }
}