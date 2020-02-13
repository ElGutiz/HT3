import java.util.Random;

/*
* @author: Jose Abraham Gutierrez Corado
* Algoritmos y estructuras de datos
*
*/

public class RandomList {
	
	private static int[] numbers_list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numbers_list = new int[3000];
		    Random rand = new Random();
		    for (int i = 0; i < 3000; i++) {
		    	numbers_list[i] = rand.nextInt();
		    }	
		    Selection_Sort try1 = new Selection_Sort();
		    try1.selectionSort(numbers_list);
		    
		    //Merge_Sort try2 = new Merge_Sort();
		    //try2.mergeSort(numbers_list, numbers_list.length);
		    
		   // Quick_Sort try3 = new Quick_Sort();
		    //try3.quickSort(numbers_list, 0, numbers_list.length-1);
		    
		   // Radix_Sort try4 = new Radix_Sort();
		    //try4.radixSort(numbers_list, numbers_list.length);
		    
		   // Gnome_Sort try5 = new Gnome_Sort();
		    //try5.gnomeSort(numbers_list, numbers_list.length);
		  }
}
