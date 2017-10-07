import java.util.ArrayList;

public class SimUniversity {

	public static void main(String[] args)
	{
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Student("Kevin", "Zunic", "6105948314", "kxz5047@psu.edu", "Senior"));
		people.add(new Student("Joe", "Smith", "1234567890", "jxs1234@psu.edu", "Freshman"));
		people.add(new Student("Mary", "Jones", "0987654321", "mxj4321@psu.edu", "Junior"));
		people.add(new Faculty("Martin", "Yeh", "1234567890", "martin.yeh@psu.edu", "Professor"));
		people.add(new Faculty("Nanette", "D'Imperio", "1234567890", "nxd13@psu.edu", "Professor"));
		people.add(new Faculty("John", "Landmesser", "1234567890", "jal620@psu.edu", "Professor"));
		people.add(new Staff("John", "Jacobs", "1234567890", "jxj2345@psu.edu", "Custodian"));
		people.add(new Staff("Susan", "Sanders", "1234567890", "sxs3456@psu.edu", "Counselor"));
		people.add(new Staff("Jane", "Doe", "1234567890", "jxd4567@psu.edu", "Librarian"));
		
		for(int i=0; i<people.size(); i++)
		{
			System.out.println(people.get(i).toString());
		}
	}

}
