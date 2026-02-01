// Filename must be same as Class

public class ch2 {
    // 要用 main
    public static void main(String args[]) {
        int score = 95;
        
        // 兩個if不會有出錯，
        if (score >= 95) {
            System.out.println("A++");
        }
        
        if (score >= 90) {
            System.out.println("A");
        }
        
        // else if 可以很多個
        else if (score >= 80) {
            System.out.println("B");
        }
        
        else if (score >= 70) {
            System.out.println("C");
        }
        
        else if (score >= 60) {
            System.out.println("D");
        }
        
        // there can only be one else
        else {
            System.out.println("F");
        }
    }
}