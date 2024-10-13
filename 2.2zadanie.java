public class SentenceCounter {
    public static int countSentences(String text) {
        return text.length() - text.replaceAll("[.!?]", "").length();
    }

    public static void main(String[] args) {
        String text = "Привіт! Як справи? Круто.";
        System.out.println(countSentences(text));
    }
}
