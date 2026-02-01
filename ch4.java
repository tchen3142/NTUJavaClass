// Filename must be same as Class

public class ch4 {
    // 要用 main
    public static void main(String args[]) {
        
        int x = 100; // 這個活到最後
        System.out.println("main的x:" + x);
        
        // x = 155 is only valid within the curly brackets
        {
            // 重複宣告
            //int x = 155; // I assigned a house to 100 and to 155, so who owns the house? Therefore there comes error
            
            x = 155; // here you lent the house to 155 to live
            System.out.println("{}的x:" + x);
        }
        
        System.out.println("最後一行的x: " + x); // since you let 155 live in the house now, the result is 155
        
        x = 200;
        System.out.println("最後一行的x: " + x); // since you let 200 live in the house now, the result is 155

        
    }
}