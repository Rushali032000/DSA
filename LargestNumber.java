
public class LargestNumber{
  public static void main(String[] args){
    int[] array = {50, 20, 300, 5, 80};
    int max = array[0];
    for(int i = 1; i < array.length - 1; i++){
      if(array[i] > max){
        max = array[i];
      }
    }
    System.out.println("max number is: "+ max);
  }
}