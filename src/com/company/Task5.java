import java.lang.reflect.Array;
import java.util.*;

public class Task5 {


    //public static List<String> prio = new ArrayList<String>();
    public static List<Integer> prio = new ArrayList<Integer>();
    public static List<String> compl = Arrays.asList("COMPLEX", "MIDDLE", "EASY");
    //public static List<String> pr_list = Arrays.asList("COMPLEX", "MIDDLE", "EASY");
    public static void Tasks(){
        Scanner scanner = new Scanner(System.in);
        //System.out::println(String.valueOf(ArrayList[]));

        while (true) {

            System.out.printf("Please enter Priority from 1 to 3: ");

            Integer pr = scanner.nextInt();
            if (pr >= 1 && pr <= 3) {
                prio.add(pr);
            }
            else {
                System.out.println("Please enter correct digits!!!");
            }
  /*
            System.out.printf("Please enter Complexity: ");
            prio.add(scanner.next());
*/
            System.out.printf("Please enter ###");
            if (scanner.next().equals("test")) {
                break;
            }

        }


        prio.forEach(System.out::println);
    }


}
