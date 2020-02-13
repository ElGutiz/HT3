/*This code is contributed by Rajat Mishra */

public class Selection_Sort {
	
	public static void selectionSort(int[] random_numbers){  
        for (int i = 0; i < random_numbers.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < random_numbers.length; j++){  
                if (random_numbers[j] < random_numbers[index]){  
                    index = j; 
                }  
            }  
            int small_number = random_numbers[index];   
            random_numbers[index] = random_numbers[i];  
            random_numbers[i] = small_number;  
        }  
    }  

}
