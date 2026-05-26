public class Sorted {
  public static boolean isArraySorted(int[] arr){
    for(int i = 0; i < arr.length - 1; i++){
      if(arr[i] > arr[i+1]){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
      int[] arr = {10};
      System.out.println(isArraySorted(arr));
  }
}
