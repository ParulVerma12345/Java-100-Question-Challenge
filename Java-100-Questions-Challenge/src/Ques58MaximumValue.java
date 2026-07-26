public class Ques58MaximumValue {
    public static void main(String[]args){
        int arr[]={10,45,25,70,30};
        int max=arr[0];
        for(int num:arr){
           if( num>max){
               max=num;
           }
        }
        System.out.println("Maximum=" +max);
    }
}
