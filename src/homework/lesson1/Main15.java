package homework.lesson1;

public class Main15 {
    public static void main(String[] args) {
        String text = "Java, it's very cool!";
        char[] charsFromText = text.toCharArray();

        int countGlases = 0;
        int countCjglas = 0;
        int countSimvols = 0;

        for (int i = 0; i < charsFromText.length; i++) {
            char currentChar = charsFromText[i];
            if (currentChar == ' ') {
                continue;
            } else if (currentChar == 'a' || currentChar == 'o' || currentChar == 'i' || currentChar == 'e' || currentChar == 'y') {
                countGlases++;
            } else if (currentChar == '!' || currentChar == '\'' || currentChar == ',') {
                countSimvols++;
            } else {
                countCjglas++;
            }

        }
        System.out.println("Гласных - " + countGlases + ", согласных - " + countCjglas + ", символов - " + countSimvols + ".");

    }
}
