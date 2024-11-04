import java.util.Scanner;

class BloodData {
    private String bloodType; 
    private String rhFactor;  

  
    public BloodData() {
        bloodType = "O"; 
        rhFactor = "+";  
    }

    public void setBloodType(String bt) {
        bloodType = bt;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setRhFactor(String rh) {
        rhFactor = rh;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void display() {
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    }
}

public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String input1 = scanner.nextLine().trim(); 

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = scanner.nextLine().trim(); 

        BloodData bd = new BloodData(); 
        if (!input1.isEmpty()) {
            bd.setBloodType(input1);
        }
        if (!input2.isEmpty()) {
            bd.setRhFactor(input2);
        }

        bd.display();

        scanner.close();
    }
}