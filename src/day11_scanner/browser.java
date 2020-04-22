package day11_scanner;

public class browser {
    public static void main(String[] args) {
        String browsername = "chrome";
        switch (browsername) {
            case "chrome":
                System.out.println(" chrome is opening...");
                break;
            case "firefox":
                System.out.println(" firefox is opening....");
                break;
            case "safari":
                System.out.println("osafari is opening");
                break;
            case "opera":
                System.out.println("opera is opening...");
                break;
            default:
                System.out.println("invalid browser name");
        }
    }
}
