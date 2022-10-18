package by.Itacademy.pavel.task1;

public class Task1 {
    public static void main(String args[]) {
        String str = "aiplmakpmbri";
        char[] array = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[j] + " ");
                    break;
                }
            }
        }
    }
}