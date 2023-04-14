public class stringsLecture {
    public static void main(String[] args) {
        String message = "ello";
//        System.out.println(message.equalsIgnoreCase("ello"));

//        String password = "password";
//        System.out.println(password.length() >7);
          String message2 = "Yo im a guy";
          // find index value of string
          int position = message2.indexOf("im");
          System.out.println(position);
        // replace words in the string
        System.out.println(message2.replace("im", "your"));
        // removes trailing space at beginning and end
        System.out.println(message2.trim());
        // find string character that is at the inputted index
        System.out.println(message2.charAt(2));

    }
}
