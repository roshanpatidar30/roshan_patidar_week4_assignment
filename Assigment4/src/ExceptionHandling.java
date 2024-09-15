class InvalidInputNumber extends Exception{

    public InvalidInputNumber(String message){
        super(message);
    }

}
public class ExceptionHandling {
 public void checkExceptions() throws InvalidInputNumber{
int num1 = 10, num2 = 0;
try{
    int result = num1/num2;
}catch (ArithmeticException e){
    System.out.println("ArithmeticException is founded....");
}
    try{
        String strName = null;
        System.out.println("length of string: "+ strName.length());
    }catch (NullPointerException e){
        System.out.println("Null pointer exception is founded....");
    }
    int number = -23;
    if(number >0 && number<150){
System.out.println("Number is valid....");
    }
    else{
        throw new InvalidInputNumber("Error: Invalid number is provided!");
    }
 }
 public static void main(String[] args){
     ExceptionHandling exceptionHandling = new ExceptionHandling();
     try {
         exceptionHandling.checkExceptions();
     } catch (InvalidInputNumber e) {
         System.out.println(e.getMessage());
     }
 }
}
