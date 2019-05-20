package NewHomeWork;

public class Metods {

    public static void sameLetters(String text1, String text2) {
        char[] charsFromText1 = text1.toCharArray();
        char[] charsFromText2 = text2.toCharArray();

        for (int i = 0; i < charsFromText1.length; i++) {
            for (int j = 0; j < charsFromText2.length; j++) {
                if (charsFromText1[i] == charsFromText2[j] && charsFromText1[i] != ' ') {
                    System.out.println(charsFromText1[i]);
                                        break;
                }
            }
        }
        System.out.println();

    }
    public static void sameLettersFromString(String text1, String text2){
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                if(text1.charAt(i) == text2.charAt(j) && text1.charAt(i)!=' '){
                    System.out.println(text1.charAt(i));
                    break;
                }
            }
        }
    }
}
