package day25_methods;

public class driver {
    public static void main(String[] args) {
        String str = getdriver1("safari");
        System.out.println(str);

    }

    public static String getdriver1(String browsername) {
        String result = "";
        switch (browsername) {
            case "chrome":
                result = "chrome driver";                     //daha kisa yol olarak result yerine return yazip break leri de kaldirarak yapilar
                break;
            case "firefox":
                result = "firefox driver";
                break;
            case "safari":
                result = "safari driver";
                break;
            default:
                result = "invalid driver";
        }
        return result;

    }
}


