//GIVEN STARTER CODE FOR HW7
// ArrayList must have these 5 requirements specified below
public interface Interface<T>
{
	boolean add(T item); // from hw5

	int getSize(); // from hw5

	T get(int index) throws IndexOutOfBoundsException; // from hw5
	
	boolean add(int index, T item) throws IndexOutOfBoundsException; // added in hw7 (wasnt present in hw5)

	T remove(int index) throws IndexOutOfBoundsException;  // added in hw7 (wasnt present in hw5)

} 