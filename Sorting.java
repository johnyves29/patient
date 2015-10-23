class Sorting
{

    Patient [] array;


    public Sorting (int size)
    {
        array = new Patient [size];
    }



    public void getValue (int index , String Fname,String Lname, int age, String address )
    {

        array [index] = new Patient (Fname,Lname,age,address);
    }


    public void BubbleSort ()
    {
        Patient temp;
        for (int a=0; a<(array.length-1); a++)
        {
            for (int b = 0; b< (array.length-1); b++)
            {
                if (array [b].getAge() > this.array[b+1].getAge())
                {
                    temp 		= array[b];
                    array[b] 	= this.array[b+1];
                    array[b+1] 	= temp;
                }
            }
        }
    }


    public void display ()
    {

        for (int a = 0; a <array.length; a++)
        {
            System.out.println ("Fullname: " + array[a].getFullname());
            System.out.println ("Age: " + array[a].getAge());
            System.out.println ("Address: " + array[a].getAddress());

            System.out.println("\n");

        }
    }

}
