import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<NaPewnoZdam> Abc =  new ArrayList<>();
      Abc.add( new NaPewnoZdam("Tadim",2,"Karczewski"));
     Abc.add( new NaPewnoZdam("Matematyka",4,"Wiercinski"));
     Abc.add(new NaPewnoZdam("Polski",3,"Piechota"));
     Abc.add(new Zdalem("Historia",5,"Swiatek","2023-12-12" ));
     Abc.add(new Zdalem("Historia",5,"Swiatek","2023-12-12" ));
     Abc.add(new Zdalem("Historia",5,"Swiatek","2023-12-12" ));
    Object a = new NaPewnoZdam("Historia",5,"Swiatek");
    System.out.println(Abc.size());
    System.out.println(Abc);
     Abc.remove(2);
     System.out.println(Abc.size());
     System.out.println(Abc);

    }
}