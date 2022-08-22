package ua.ithillel.homework_5;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("This is string.", 's'));
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(findWordPosition("Apple", "plant"));
        System.out.println(stringReverse("String"));
        System.out.println(isPalindrome("ERE"));
        System.out.println(isPalindrome("Allo"));
    }

    public static int findSymbolOccurance(String str, char symbol) {
        int index = str.indexOf(symbol);
        int count = 0;

        while (index != -1) {
            count++;
            str = str.substring(index + 1);
            index = str.indexOf(symbol);
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
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