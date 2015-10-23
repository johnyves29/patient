
public class Patient
{

    private String Fname;
    private String Lname;
    private String address;
    private int age;


    public Patient (String Fname, String Lname, int age,String address)
    {

        this.Fname = Fname;
        this.Lname = Lname;
        this.address = address;
        this.age = age;

    }


    public String getFullname()
    {

        return this.Fname + " " + this.Lname;
    }

    public String getAddress ()
    {
        return this.address;
    }

    public int getAge()
    {
        return this.age;
    }

}
