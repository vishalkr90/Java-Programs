public class StringMethods {
    public static void main(String[] args) {

        String s = "Hello World";
        
        // 1. length()
        System.out.println("length(): " + s.length());
        // Output: 11


        // 2. charAt(index)
        System.out.println("charAt(): " + s.charAt(1));
        // Output: e


        // 3. substring(start, end)
        System.out.println("substring(): " + s.substring(0, 5));
        // Output: Hello


        // 4. substring(start)
        System.out.println("substring(start): " + s.substring(6));
        // Output: World


        // 5. equals()
        String a = "hello";
        String b = "hello";

        System.out.println("equals(): " + a.equals(b));
        // Output: true


        // 6. equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " +
                "HELLO".equalsIgnoreCase("hello"));
        // Output: true


        // 7. toLowerCase()
        System.out.println("toLowerCase(): " + s.toLowerCase());
        // Output: hello world


        // 8. toUpperCase()
        System.out.println("toUpperCase(): " + s.toUpperCase());
        // Output: HELLO WORLD


        // 9. indexOf()
        System.out.println("indexOf(): " + s.indexOf('o'));
        // Output: 4


        // 10. lastIndexOf()
        System.out.println("lastIndexOf(): " + s.lastIndexOf('o'));
        // Output: 7


        // 11. contains()
        System.out.println("contains(): " + s.contains("World"));
        // Output: true
 

        // 12. startsWith()
        System.out.println("startsWith(): " + s.startsWith("Hello"));
        // Output: true


        // 13. endsWith()
        System.out.println("endsWith(): " + s.endsWith("World"));
        // Output: true


        // 14. replace()
        System.out.println("replace(): " + s.replace('o', 'x'));
        // Output: Hellx Wxrld


        // 15. trim()
        String space = "   Hello   ";
        System.out.println("trim(): " + space.trim());
        // Output: Hello


        // 16. toCharArray()
        char[] arr = s.toCharArray();

        System.out.println("toCharArray():");
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        // Output: H e l l o   W o r l d


        // 17. split()
        String sentence =  "Java is easy";

        String[] words = sentence.split(" ");

        System.out.println("\nsplit():");
        for (String word : words) {
            System.out.println(word);
        }
        // Output:
        // Java
        // is
        // easy


        // 18. Integer.parseInt()
        String num = "123";

        int number = Integer.parseInt(num);

        System.out.println("parseInt(): " + number);
        // Output: 123


        // 19. String.valueOf()
        int x = 100;

        String str = String.valueOf(x);

        System.out.println("valueOf(): " + str);
        // Output: 100


        // 20. Character methods

        char ch = 'A';

        System.out.println("isLetter(): " + Character.isLetter(ch));
        // Output: true

        System.out.println("isDigit(): " + Character.isDigit(ch));
        // Output: false

        System.out.println("isUpperCase(): " +
                Character.isUpperCase(ch));
        // Output: true

        System.out.println("isLowerCase(): " +
                Character.isLowerCase(ch));
        // Output: false

        System.out.println("toLowerCase(): " +
                Character.toLowerCase(ch));
        // Output: a

        System.out.println("toUpperCase(): " +
                Character.toUpperCase('b'));
        // Output: B
    }
}

// 1. length()
// 2. charAt()
// 3. substring()
// 4. indexOf()
// 5. lastIndexOf()
// 6. equals()
// 7. contains()
// 8. toCharArray()
// 9. replace()
// 10. toLowerCase()
// 11. toUpperCase()
// 12. Integer.parseInt()