import java.util.*;
public class CarRecalls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   int modelNumber;
   boolean defective = false;

   System.out.print("Please input your cars model number: ");
modelNumber = input.nextInt();

 if (modelNumber == 119 || modelNumber ==179 || modelNumber ==221 || modelNumber ==780 || modelNumber >= 189 && modelNumber <= 195){
    defective = true;
 }else{
    defective = false;
 }

    if (defective == true){
    System.out.println("Your car has been recalled.");
    } else {
        if(defective == false){
    System.out.println("No recalls for this vehicle.");
        }
    }
}
}




