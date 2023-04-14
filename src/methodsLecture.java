public class methodsLecture {
    public static void main(String[] args) {
        System.out.println(sayHello("Doug"));
        System.out.println(returnThree());
        System.out.println(highFive("Doug"));
        String myName = "Doug";
        changeName(myName);
        System.out.println(myName);
        System.out.println(changeName(myName));
        count(5);

    }
    // this is a method that our main has access too
    public static String sayHello(){
        String message = "Hello strange friend";
        return message;
    }
    public static String sayHello(String name){
        String message = "Hello, " + name + "!";
        return message;

    }
    public static int returnThree(){
        return 3;
    }
    public static String highFive(String name){
        return name + " gives no one a highfive he has no friends";
    }
    public static String highFFive(String name1, String name2){
        return name1 + " gives" + name2 + " a highfive";
    }
    public static String changeName(String name){
        name = "Douglas";
                return name;
    }
    public static void count(int n) {
        if (n <= 0){
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);

    }
}
