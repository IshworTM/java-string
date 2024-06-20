package ChapterSix;

public class stringCreation {
    public static void main(String[] args) {
        // Creating string using string literal
        String stringLiteral = "Nice string bro";
        System.out.println("This is a string created using string literal: " + stringLiteral);

        //Creating string using new keyword
        String stringObject = new String("Nice");
        System.out.println("This is a string created using the new keyword: " + stringObject);
    }
}