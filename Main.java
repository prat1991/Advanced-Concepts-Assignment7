//Created this class from scratch
//This class is simple a main method that shows how the Array List Data Structure works

public class Main
{
	//3rd, created a brand new method to display the list
	// Made the method static so that i can call this method within the main method without creating an object
	public static void main(String [] args) throws Exception
	{
		System.out.println("\nStep1: Creating an arrayList that is 10 elements in size");
        InterfaceImplementor<Integer> arrayList = new InterfaceImplementor<Integer>(10);
        
		System.out.println("\nStep3: Populating the Array List");
        arrayList.add(1);
        System.out.println("\nStep4: Getting the 1st elements value: " + arrayList.get(0));
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        
		System.out.println("\nStep5: Displaying the Populated Array List");
        arrayList.displayArrayList();        
        System.out.printf("Array List Size = %d elements \n",arrayList.getSize());
        
		System.out.println("\nStep6: Visually showing that the Array List grows in size when its full");
        arrayList.add(11);
        
        
		System.out.println("Step7: Redisplaying the Array List after it has grown in size");
        arrayList.displayArrayList();     
        System.out.printf("Array List Size = %d elements \n",arrayList.getSize());
        
        System.out.println("\nStep8: Updating the 1st element(0th index) value to go from 1 to 100");
        System.out.println("\tStep8.1: Redislaying the Array List");
        arrayList.add(0,100);
        arrayList.displayArrayList();   
        System.out.printf("Array List Size = %d elements \n",arrayList.getSize());
        
        System.out.println("\nStep9: Deleting the first element (0th Index)");
        System.out.println("\tStep9.1: Redislaying the Array List");
        arrayList.remove(0);
        System.out.printf("Array List Size = %d elements \n",arrayList.getSize());
        
        arrayList.displayArrayList(); 
        System.out.printf("Array List Size = %d elements \n",arrayList.getSize());
	}
}
