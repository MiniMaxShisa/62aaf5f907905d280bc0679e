package ua.ithillel.homework_5;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("This is string.", 'i'));
        findWordPosition("Apollo", "pollo");
        findWordPosition("Apple", "plant");
        System.out.println(stringReverse("String"));
        System.out.println(isPalindrome("ERE"));
        System.out.println(isPalindrome("Allo"));
    }

    public static int findSymbolOccurance(String str, char symbol) {
        return str.indexOf(symbol) + 1;
    }

    public static void findWordPosition(String source, String target) {
        System.out.println("Source: " + source);
        System.out.println("Target: " + target);
        System.out.println("Result: " + source.indexOf(target));
    }

    public static StringBuffer stringReverse(String str) {
        StringBuffer buffer = new StringBuffer(str);
        return buffer.reverse();
    }

    public static boolean isPalindrome(String str) {
        return str.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W","")).reverse().toString());
    }
}