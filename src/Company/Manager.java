package Company;

public class Manager {
    public int mId ;
    public String mName;

    Manager (int id,String Name){
        this.mId = id ;
        this.mName = Name;
    }
    public void getSingleInfo (){
        System.out.print("Head Manager name is "+this.mName+" and his id is » "+this.mId);
        System.out.println();
    }
    public void getMInfo (){
        System.out.print("Company.Manager name is "+this.mName+" and his id is » "+this.mId);
        System.out.println();
    }

}
