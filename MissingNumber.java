public class MissingNumber {
  public static int missingNumber(int[] arr){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] != i){
        return i;
      }
    }
    return arr.length;
  }
  public static void main(String[] args){
    int[] arr = {0,1};
    System.out.println(missingNumber(arr));
  }
}
