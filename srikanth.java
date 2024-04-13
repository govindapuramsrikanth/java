package myjava;


import java.util.Scanner;

public class srikanth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string (you can include spaces as well):");
        String input = in.nextLine();
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }

    public static String compressString(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }

        if (s.length() > 1) {
            if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {
                count++;
            } else {
                sb.append(s.charAt(s.length() - 2));
                sb.append(count);
                count = 1;
            }
            sb.append(s.charAt(s.length() - 1));
            sb.append(count);
        }

        return sb.toString();
    }
}
