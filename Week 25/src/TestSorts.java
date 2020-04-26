import java.util.Random;

public class TestSorts
{
  public static void main(String [] args)
  {
    Random gen = new Random();
    int[] a = new int[20];
     int[] b = new int[20];
     int[] c = new int[20];
     
    
    for (int i=0; i<a.length; i++)
      a[i]=gen.nextInt(100);
    
      System.out.println("First array - listed, then selection sorted, then listed again");
    printArray(a);
    selectionSort(a);
    printArray(a);
    
    for (int i=0; i<b.length; i++)
      b[i]=gen.nextInt(100);
    
    System.out.println("Second array - listed, then insertion sorted, then listed again");
    printArray(b);
    insertionSort(b);
    printArray(b);
    
     for (int i=0; i<c.length; i++)
      c[i]=gen.nextInt(100);
    
    System.out.println("Third array - listed, then insertion2 sorted, then listed again");
    printArray(c);
    insertionSort2(c);
    printArray(c);
    
  }
  
  public static void printArray(int[] b)
  {
    for (int i : b)
      System.out.print(i + " ");
    System.out.println();
  }
    
     public static void selectionSort (int[] numbers)
   {
      int min, temp;

      for (int index = 0; index < numbers.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++)
            if (numbers[scan] > numbers[min])
               min = scan;

         // Swap the values
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void insertionSort (int[] numbers)
   {
      for (int index = 1; index < numbers.length; index++)
      {
         int key = numbers[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && numbers[position-1] < key)
         {
            numbers[position] = numbers[position-1];
            position--;
         }
            
         numbers[position] = key;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of numbers using the insertion
   //  sort algorithm - using code from Fundamentals of Java
   //-----------------------------------------------------------------
   public static void insertionSort2 (int[] numbers)
   {
     int itemToInsert, j;
     boolean stillLooking;
     
      for (int index = 1; index < numbers.length; index++)
      {
        itemToInsert = numbers[index];
        j = index - 1;
        stillLooking = true;
        
         
         while ((j >=0) && stillLooking)
         {
            if (itemToInsert > numbers[j])
            {
              numbers[j+1]= numbers[j];
              j--;
            }
            else
              stillLooking = false;
         }
         numbers[j+1] = itemToInsert;
      }
   }
}