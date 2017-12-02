// 5.1.1 Defining Subclasses
public class Manager extends Employee
{
	// added methods and fields
}

// 5.1.2 Overriding Methods
public class Manager extends Employee
{
	public int bonus;
	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
}

// 5.1.3 Subclass Constructors
public Manager(String name, double salary, int year, int month, int day)
{
	super(name,salary,year,month,day);
	bonus = 0;
}

// 5.1.4 Inheritance Hierarchies

// 5.1.5 Ploymorphism
Manager boss = new Manager();
Employee[] staff = new Employee[3];
staff[0] = boss;
boss.setBonus（5000）；//OK
staff[0].setBonus（5000）；//Error
Manager m = staff[i]; //Error

// 5.1.6 Understanding Method Calls

// 5.1.7 Preventing Inheritance:Final Classes and Methods
public final calss Executive extends Manager 
// All methods in a final class are automatically final
{
	public final String getName()
	{
		return name;
	}
}

// 5.1.8 Casting
double x = 3.405;
int nx = (int)x;

if(staff[1] instanceof Manager)
{
	boss = (Manager) staff[1];
}

Manager boss = (Manager) staff[0]; //OK, since boss is an instance of Manager
Manager boss = (Manager) staff[1]; //Error.

// 5.1.9 Abstract Classes
public abstract class Person
{
	public abstract String getDescripption();
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	public Stirng getName()
	{
		return name;
	}
}

// 5.1.10 Protected Access
/* 
   1. Private:   Visible to the class only.
   2. Public:    Visible to the world.
   3. Protected: Visible to the package and all subclasses.
   4. Default:   Visible to the package.
*/
