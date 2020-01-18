import java.util.Arrays;

public class InterfaceImplementor<T> implements Interface<T>
{
	private int size = 0; // Instance Variable
	private Object[] array; // Instance Variable

	public InterfaceImplementor(int size) //Constructor 
	{
		System.out.println("\tStep1.2: Constructor call creates an array that is " + size + " elements\n");
		array = new Object[size]; 
	}
	
	private void increaseSize() // code to shift all the elements into a 2x bigger array
	{
		int updatedSize = (array.length) * 2;
		System.out.println("\tStep6.2: Updating Array to go from " + array.length + " to " + updatedSize + " elements");
		System.out.println("\tStep6.3: Transferring all the elements into the bigger array\n");
		array = Arrays.copyOf(array, updatedSize);
	}
	
	public void displayArrayList()
	{
		System.out.println("\n-------------------------Array List----------------------------");
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] != null) //only displays array values that are not null will be displayed
			{
				System.out.println("Index: " + i + ", Value: " + array[i]);			
			}
		}
	}

	// -----------------INTERFACE IMPLEMENTATION METHODS ---------------------------------------------
	@Override
	public boolean add(int index, T value) throws IndexOutOfBoundsException
	{
		if (size == array.length)
		{
			int invalidIndex = array.length + 1;
			System.out.println("Cannot add element at index position = " + invalidIndex);
			increaseSize();
		}
		// code that always runs irregardless of the if statement
		array[index] = value; // adding the value to a particular index
		return false;
	}
	
	@Override
	public int getSize()
	{
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index)
	{
		return (T) array[index];
	}

	@Override
	
	public boolean add(T value)
	{
		if (size == array.length)
		{
			int invalidIndex = array.length + 1;
			System.out.println("\tStep6.1: Cannot add element at index position = " + invalidIndex);
			increaseSize();
		}
		// code that always runs irregardless of the if statement
		array[size++] = value; // adding the value to the next index
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException
	{
		// Handling illegal deletion of the arrayList by throwing an exception
		if (index >= array.length || index < 0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}

		// for loop  code shifting all the elements back by 1 index position
		for (int i = index; i < array.length - 1; i++)
		{
			array[i] = array[i + 1];
		}
		return (T) array;
	}
}