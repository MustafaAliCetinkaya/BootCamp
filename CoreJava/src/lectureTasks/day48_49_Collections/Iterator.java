package lectureTasks.day48_49_Collections;// Java code to illustrate the use of ListIterator
import java.util.*;

class Iterator {
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// ListIterator to traverse the list
		ListIterator iterator = list.listIterator();

		// Traversing the list in forward direction
		System.out.println("Displaying list elements in forward direction : ");

		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");

		System.out.println();

		// Traversing the list in backward direction
		System.out.println("Displaying list elements in backward direction : ");

		while (iterator.hasPrevious())
			System.out.print(iterator.previous() + " ");

		System.out.println();
	}
}
