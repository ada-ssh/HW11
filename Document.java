public class Document {
    String numberOfDoc;

    public Document(String numberOfDoc) {
        this.numberOfDoc = numberOfDoc;
    }

    public String getNumberOfDoc() {
        return numberOfDoc;
    }

    public void setNumberOfDoc(String numberOfDoc) {
        this.numberOfDoc = numberOfDoc;
    }

    public static void firstBloc(String numberOfDoc) {
        String first = numberOfDoc.substring(0, 4);
        String second = numberOfDoc.substring(9, 13);
        System.out.println(first + "-" + second);
    }

    public static void numberWithoutLetters(String numberOfDoc) {
        String s = numberOfDoc.replaceAll("[A-Za-z]{3}", "***");
        System.out.println(s);
    }

    public static void onlyLetters(String numberOfDoc){
        String s0 = numberOfDoc.toLowerCase();
        String s1 = s0.substring(5,8);
        String s2 = s0.substring(14,17);
        String s3 = s0.substring(19,20);
        String s4 = s0.substring(21);
        System.out.println(s1 + "/" + s2 + "/" + s3 + "/" + s4);
    }

    public static void onlyLettersUpper(String numberOfDoc){
        StringBuilder sb = new StringBuilder("1234-ABC-5678-ABC-9G0H");
        String s1 = sb.substring(5,8);
        String s2 = sb.substring(14,17);
        String s3 = sb.substring(19,20);
        String s4 = sb.substring(21);
        System.out.println("Letters: " + s1 + "/" + s2 + "/" + s3 + "/" + s4);
    }

    public static void thePresenceOfASequence(String numberOfDoc){
        String s = numberOfDoc.toLowerCase();
        System.out.println(s);
        System.out.println(s.contains("abc"));
    }

    public static void startFrom555(String numberOfDoc){
        String s = numberOfDoc;
        System.out.println(s);
        System.out.println(s.startsWith("555"));
    }

    public static void endWith1a2b(String numberOfDoc){
        String s = numberOfDoc;
        System.out.println(s);
        System.out.println(s.endsWith("1a2b"));
    }
}
