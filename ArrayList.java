import java.util.*;
public class ArrayList {
  public static void main (String [] args){
    ArrayList<String> a = new ArrayList<String>();
    a.add(0,"zero");
    a.add(1,"one");
    a.add(2,"two");
    a.add(3,"three");
    printal(a);
    if (a.contains("three")){
      a.add(4,"four");
    }
    a.remove(2);
    printal(a);
    if (a.indexOf("four")!=4) {
      a.add(4,"402");
    }
    printal(a);
    printal(a);
  }
  public static void printal(ArrayList<String> al){
    for (Stirng element : al){
     System.out.print(element + " ");
    }
    System.out.println();
  }
}
