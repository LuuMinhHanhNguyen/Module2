package ss15_exception;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String id = null;
        try{
            if (id.equals("hihi")) System.out.println("hihi");
            else System.out.println("hoho");
        } catch(NullPointerException e){
            System.out.println("Cannot compare null to other data types!");
        }
    }
}
