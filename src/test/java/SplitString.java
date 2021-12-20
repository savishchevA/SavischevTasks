public class SplitString {
        public static void main(String args[]) {
            String sentences = "Split.this.wordsw";
            String[] words;
            String splitter = "\\.";
            words = sentences.split(splitter);
            for(int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
}}
