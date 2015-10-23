class Test
{
    public static void main (String[] args)
    {

        Sorting sort = new Sorting(3);
        sort.getValue(0,"John Yves", "Marin", 22, "Malolos, Bulacan");
        sort.getValue(1,"John Jay", "Mercines", 22, "Apalit, Pampanga");
        sort.getValue(2,"Romer John", "Livantino", 17, "Apalit, Pampanga");

        System.out.println("\n**** ORIGINAL ****");
        sort.display();

        System.out.println("\n **** Sorted By AGE ****");
        sort.BubbleSort();
        sort.display();
    }
}

