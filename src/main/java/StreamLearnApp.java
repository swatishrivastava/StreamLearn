import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLearnApp {

    public static void main(String[] args) {

        List<Emp> empList=new ArrayList<Emp>();
        final Emp emp=new Emp("123", "John", "Sweden");
        Emp emp2=new Emp("124", "Marcel", "London");
        Emp emp3=new Emp("125", "Lisa", "London");
        empList.add(emp);
        empList.add(emp2);
        empList.add(emp3);

        //Suppose get only those emp who belong to london

        List<String> list=empList.stream().filter(emplam-> emplam.getCountry()
                .equalsIgnoreCase("London"))
                .map(Emp::getName)
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
