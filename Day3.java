/*Parenthesis Checker 
 * 1.Input:{([])}
   Output: true
   2.Input:([]
   Output: false
*/
import java.util.*;
class Day3 {

    static boolean ispar(String x) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            char currentChar = x.charAt(i);

            if (currentChar == '(' ||
                    currentChar == '[' ||
                    currentChar == '{') {
                s.push(currentChar);
            } else {
                if (s.isEmpty()) {
                    return false;
                }

                char topChar = s.pop();
                if ((currentChar == ')' && topChar != '(') ||
                        (currentChar == '}' && topChar != '{') ||
                        (currentChar == ']' && topChar != '[')) {
                    return false;
                }
            }

        }
        return s.isEmpty();
    }
}