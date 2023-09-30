package ArraysDemo;

public class TwoDArrayDemo {
    public static void main(String[] args) {

        int nums[][] = new int[3][3];

        nums[0][0] = 12;
        nums[0][1] = 14;
        nums[0][2] = 17;
        nums[1][0] = 18;
        nums[1][1] = 34;
        nums[1][2] = 56;
        nums[2][0] = 78;
        nums[2][1] = 98;
        nums[2][2] = 12;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
}