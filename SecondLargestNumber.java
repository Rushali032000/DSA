public class SecondLargestNumber {
  public static int secondLargest(int[] array){
     if (array.length < 2) {
        return -1;
      }

    int largest = array[0];
    int secondlargest = -1;
    for(int i = 1; i < array.length; i++){
      if (array[i] > largest) {
        secondlargest = largest;
        largest = array[i];
      }
      else if(array[i] != largest && array[i] > secondlargest){
        secondlargest = array[i];
      }
    }
    return secondlargest;
  }

  public static void main(String[] args) {
    int[] array = {10,10,10};
    System.out.println(secondLargest(array));
  }
}
