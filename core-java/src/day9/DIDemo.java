package day9;


class Employee
{
	String id;
	String name;
	Address address;

	public Employee(String id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	Employee()
	{

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


}

class Address
{
	int pin;
	String Street;
	String city;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int pin, String street, String city) {
		super();
		this.pin = pin;
		Street = street;
		this.city = city;
	}
	Address()
	{

	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", Street=" + Street + ", city=" + city + "]";
	}
}


public class DIDemo {
	public static void main(String[] args) 
	{
		Address address1 = new Address(12345,"city street","New York");
		Employee employee1 = new Employee("101","Chris", address1); //Constructor Based Dependency Inject
		Employee employee2 = new Employee();
		employee2.setId("102");
		employee2.setName("Patrik");
		employee2.setAddress(address1);//Setter Based DI

	}

}
