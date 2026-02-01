// Filename must be same as Class

public class ch3 {
    // 要用 main
    public static void main(String args[]) {
        
        // 陣列 (Array) specifically a one dimensional array
        int[] nums = {1, 2, 3, 4, 5, 6}; // think of it as apartment units in a building
        //System.out.println("第一個 = " + nums[0]);
        System.out.println("第六個 = " + nums[5]);
        
        // 超出範圍
        //System.out.println("第六個 = " + nums[10]);
        
        // Ch4
        // for 迴圈
        for (int num : nums) {
            System.out.println("全部的陣列" + num);
        }
        
        // 一維陣列 int[]
        // 二維陣列 int[][]
        // 三維陣列 int[][][]
        
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };

        
    }
}