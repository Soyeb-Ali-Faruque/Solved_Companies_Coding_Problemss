import java.util.ArrayList;

public class Employee_salary_wise_sort {
    public static void main(String[] args) {
        Employee ob1=new Employee("Anurag",20000);
        Employee ob2=new Employee("Soyeb",20001);
        Employee ob3=new Employee("Sahil",15000);
        Employee ob4=new Employee("nishant",19000);
        Employee ob5=new Employee("someone",200000);
        ArrayList<Employee> array=new ArrayList<>();
        array.add(ob1);
        array.add(ob2);
        array.add(ob3);
        array.add(ob4);
        array.add(ob5);
        System.out.println("before sorting");
        System.out.println("Name     Salary");
        for(int i=0;i<array.size();i++){
            Employee current=array.get(i);
            System.out.println(current.name+"     "+current.salary);
        }
        objSort(array);
        System.out.println("After sorting");
        System.out.println("Name     Salary");
        for(int i=0;i<array.size();i++){
            Employee current=array.get(i);
            System.out.println(current.name+"     "+current.salary);
        }


    }
    static void objSort(ArrayList<Employee> array){
        //Selection sort
        for(int outer=0;outer<array.size();outer++){
            int index=outer;
            for(int inner=outer+1;inner<array.size();inner++){
                if(array.get(index).salary > array.get(inner).salary){
                    index=inner;
                }
            }
            //swappint using temporary space
            Employee temp=array.get(outer);
            array.set(outer,array.get(index));
            array.set(index,temp);

        }
    }

}
class Employee{
    String name="";
    int salary=0;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
