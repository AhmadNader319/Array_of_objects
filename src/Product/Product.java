package Product;

class Product
{
    int pro_Id;
    String pro_name;
    //Product.Product class constructor
    Product(int pid, String n)
    {
        pro_Id = pid;
        pro_name = n;
    }
    public void display()
    {
        System.out.print("Product.Product Id = "+pro_Id + "  " + " Product.Product Name = "+pro_name);
        System.out.println();
    }
} 