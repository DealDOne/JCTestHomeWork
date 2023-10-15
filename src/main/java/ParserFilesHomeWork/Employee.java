package ParserFilesHomeWork;

public class Employee {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

    public Employee() {
    }

    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;

    }
    @Override
    public String toString(){
        return (this.id + " " + this.firstName);
    }

    @Override

    public boolean equals(Object obj) {

        Employee o = (Employee) obj;

        return (id == o.id) && firstName.equals(o.firstName) && lastName.equals(o.lastName) && country.equals(o.country) && (age == o.age) ;

    }

}

