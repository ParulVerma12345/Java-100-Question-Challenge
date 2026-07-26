public class Ques59CountOccurrences {
    public static void main(String[]args){
        int arr[]={2,4,2,5,2,7};
        int count=0;
        for(int num:arr){
            if(num==2){
                count++;
            }
        }
        System.out.println("Occurences="+count);
    }
}
