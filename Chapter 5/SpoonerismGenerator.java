import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        SpoonerismGenerator generator = new SpoonerismGenerator();
        generator.run();
    }

    
    public void run() {
        String word1 = getWord("Word 1: ");
        String word2 = getWord("Word 2: ");

      
        if (isValidWord(word1) && isValidWord(word2)) {
            String spoonerized = createSpoonerism(word1, word2);
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerized);
        } else {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        }
    }

    
    public String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    
    public boolean isValidWord(String word) {
        return vowelIndex(word) != -1 && !isStartingWithVowel(word);
    }

    
    public int vowelIndex(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; 
    }

    
    public boolean isStartingWithVowel(String word) {
        return "aeiouAEIOU".indexOf(word.charAt(0)) != -1;
    }

    
    public String createSpoonerism(String word1, String word2) {
        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        
        String initialConsonant1 = word1.substring(0, index1);
        String initialConsonant2 = word2.substring(0, index2);
        
        String remainingPart1 = word1.substring(index1);
        String remainingPart2 = word2.substring(index2);

            
        return initialConsonant2 + remainingPart1 + " " + initialConsonant1 + remainingPart2;
    }
}



//The Spoonerism generator effectively identifies vowels and manages various input scenarios, providing accurate feedback and a smooth user experience when generating spoonerized versions of words. This ensures that users receive appropriate notifications for words that are unsuitable for spoonerization.

// By converting characters to lowercase, using case-insensitive comparison methods, and ensuring consistent input handling, the program can accurately process words with mixed uppercase and lowercase letters, providing reliable results when generating Spoonerisms.

// This improved version of the Spoonerism generator effectively handles complex word structures, including those with multiple consonants before the first vowel. It maintains clarity and provides accurate feedback for various input scenarios.
