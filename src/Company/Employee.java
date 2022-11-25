package Company;

public class Employee{
    public String empName;
    public int empId;
    //constructor
    public Employee(String Ename , int Eid) {
        this.empName = Ename ;
        this.empId = Eid ;
    }


    public void getEInfo (){
            System.out.print("employee name is "+this.empName+" and his id is » "+this.empId);
            System.out.println();
        }
    }



//
//    //compareTo method overridden for sorting array of objects
//    @Override
//    public int compareTo(Company.Employee o) {
//        if (this.empId != o.getempId()) {
//            return this.empId - o.getempId();
//        }
//        return this.name.compareTo(o.getName());
//    }
