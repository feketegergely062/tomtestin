import java.util.Scanner;

public class Tomtestin {

    public Tomtestin() {

    }
    public void startTesttomestin(){
        
      
    }
    private void nyomtat(double tenyleges){
       System.out.println(tenyleges);
    }
   
    
    private String beker(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
    public double szamitTomestin(double testtomegindex, double tomeg,double magassag){
        double tenyleges = tomeg/Math.pow(magassag,2);
        return tenyleges;
    }
    public boolean checkInput(String input){
       if( input.matches("[0-9.,]+")) {
        return true;
       }else{
        return false;
       }
    }
}
