public class Main {
    public static void main(String[] args) {
        String name = "Jan";
        String job = "Anwendungsentwickler";
        String alter = "21";
        String stadt = "Chemnitz";

        showgreeting(10);
        showgreeting(20);
        System.out.println("Ich heiße " + name + ". Ich arbeite als " + job + ". Ich Wohne in " + stadt + " und bin " + alter + " Jahre alt");
    }

    public static void showgreeting(Integer hour) {
        if (hour < 12) {
            System.out.println("Guten Morgen!");
        } else {
            if (hour < 18) {
                System.out.println("Guten Tag");
            } else {
                System.out.println("Guten Abend");
            }
        }
    }
}