import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String keyword=sc.nextLine();
        line=line.trim();
        String[] words=line.split(" +");
        StringBuilder sb=new StringBuilder();
        int wordCount=words.length;
        String shortest=words[0].toLowerCase();
        int keywordCount=0;
        int vowelCount=0;
        for(int i=0; i<words.length; i++) {
            String word=words[i].toLowerCase();
            if(i>0) {
                sb.append(" ");
            }
            sb.append(word);
            if(word.length()<shortest.length()) {
                shortest=word;
            }
            if(word.equalsIgnoreCase(keyword)) {
                keywordCount++;
            }
        }
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        for(int i=0; i<line.length(); i++) {
            char ch=line.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                vowelCount++;
            }
        }
        System.out.println("Sentence: "+sb);
        System.out.println("Words: "+wordCount);
        System.out.println("Shortest word: "+shortest);
        System.out.println("Keyword count: "+keywordCount);
        System.out.println("Vowels: "+vowelCount);
        sc.close();
    }
}
