//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

//      normal way to write switch statement
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            default:
                System.out.println("Number is neither 1 nor 2");
                break;
        }
//  alternative way to write switch statement
        int num = 0;
        switch (num){
//            multiple lines of code can be written inside the block
            case 1 -> {
                system.out.println("Number is 1");
                system.out.println("Number is 1");
            }
            case 2 -> system.out.println("Number is 2");
            default -> system.out.println("Number is neither 1 nor 2");
        }
    }
}
// switch expressions for alarm 6 am for weekends and 7 am for weekdays, 8am for wendays
  String day = "wed";
  int time = o;
  time = switch (day) {
      case "sat", "sun" -> 6;
      case "mon", "tue", "wed", "thu", "fri" -> 7;
      default -> 8;
//      semicolon at the end because it is switch expression
        };