public class Ques70StringBuilderExample {
    public static void main(String[]args){
        String words[]={"Java","is","Easy"};
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            sb.append(word);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
