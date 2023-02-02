public class Recursion {

    public static void main(String[] args) {
 
        String fullName = "anna nicole muriel";

        removeLetter(fullName);
        
    }

    static void removeLetter(String str) {
       
        extractLetters(str, "");

    } 

    static String extractLetters(String str, String result) {

        if(str.length() == 0) {
            return result;
        }
        char n = str.charAt(0);
        switch (n) {
        
        case 'b':
        case 'c':
        case 'd':
        case 'f':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
          
        System.out.println(result + str.substring(1));
            
            return extractLetters(str.substring(1), result);
            
            default:
            
            return n + extractLetters(str.substring(1), result + n);
        }
    }
}
