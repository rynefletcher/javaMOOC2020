import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
    }
    
    public static int smallest(int smallArray[]){
        int smallNum = smallArray[0];
        for(int number : smallArray){
            if(number < smallNum){
                smallNum = number;
            }
        }
        return smallNum;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = smallest(array);
        for(int i = 0; i < array.length; i++){
            if(smallest == array[i]){
                return i;
            }
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int splitStartIndex = startIndex;
        int[] splitArray = new int[table.length - startIndex];
        for(int i = 0; i < splitArray.length; i++){
            splitArray[i] = table[splitStartIndex];
            splitStartIndex++;
        }
        return startIndex + indexOfSmallest(splitArray);
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.asList(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    } 
}
