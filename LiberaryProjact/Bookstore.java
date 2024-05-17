package LiberaryProjact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import Project.Employee;

public class Bookstore {

	public static void main(String[] args) {

		List<Books> b = new ArrayList<Books>();
		List<Books> b2 = new ArrayList<Books>();

		int ch;
		do {
			System.out.println();
			System.out.println();
			System.out.println("Choice 1 is Add Books Details");
			System.out.println("Choice 2 is Books Record Show");
			System.out.println("Choice 3 is Specific Books is Search");
			System.out.println("Choice 4 is Specific Books is Get for User");
			System.out.println("Choice 5 is Users Record Show");
			System.out.println("Choice 6 is Particular Book is returned to Bookstore");
            System.out.println("Choice 7 is Shut Down System ...!");

			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				int id = 1;
				String bookname = "marathi";
				String author = "Varad";
				b.add(new Books(id, bookname, author));

				int id1 = 2;
				String bookname1 = "Hindi";
				String author1 = "Akash";
				b.add(new Books(id1, bookname1, author1));

				int id2 = 3;
				String bookname2 = "English";
				String author2 = "Sudhir";
				b.add(new Books(id2, bookname2, author2));
				System.out.println("Record inserted Sucessfully");
				// System.out.println(c);
				System.out.println();
				System.out.println();

				break;

			case 2:
				System.out.println("Please Show for All Employee Data ");
				Iterator<Books> it = b.iterator();
				while (it.hasNext()) {
					Books e1 = it.next();
					System.out.println(e1);
					System.out.println();
					System.out.println();

				}
				break;

			case 3:
				System.out.println("Please Search for Particular Books Data ");
				boolean found = false;
				it = b.iterator();
				System.out.println("Please Enter Id");
				id = sc.nextInt();
				while (it.hasNext()) {
					Books e1 = it.next();
					if (e1.getId() == id) {
						System.out.println(e1);
						System.out.println("Search record Sucessfully");
						found = true;
						
						

					}
				}
				if (!found) {
					System.out.println("Not Found");
					found = false;

				} {
				System.out.println();
			}
				System.out.println();
				System.out.println();
				break;

			case 4:
				System.out.println("Please Get for Particular Book is ");
				it = b.iterator();
				System.out.println("Please Enter Id");
				id = sc.nextInt();
				while (it.hasNext()) {
					Books e1 = it.next();
					if (e1.getId() == id) {
						b2.add(e1);
						it.remove();
						System.out.println("record Sucessfully Get for User");

					}
				}
				System.out.println();
				System.out.println();

				break;

			case 5:
				System.out.println("Please Show for All Users Data ");
				Iterator<Books> it2 = b2.iterator();
				while (it2.hasNext()) {
					Books e3 = it2.next();
					System.out.println(e3);

				}
				break;

			case 6:
				System.out.println("Please Particular Book is returned to Bookstore ");
				Iterator<Books> it4 = b2.iterator();
				System.out.println("Please Enter Id");
				id = sc.nextInt();
				while (it4.hasNext()) {
					Books e = it4.next();
					if (e.getId() == id) {
						b.add(e);
						it4.remove();

						System.out.println("record Sucessfully is returned to Bookstore");

					}
				}
				System.out.println();
				System.out.println();

				break;
				
			case 7: 
				System.out.println("Shut Down System ...!  ");
				System.exit(0);
				break;
				
				default: 
					System.out.println("Invalid Choice ...!   ");
					System.out.println();
					System.out.println();
				

			}

		} while (ch != 0);
	}
}
