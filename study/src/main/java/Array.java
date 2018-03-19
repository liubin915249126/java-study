public class Array {
    public static void main(String[] args){
        int Array [] = {1,2,3,4};
        int Array1 [] = new int[5];
        int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };
        
        int max = nums[0];
        int min = nums[0];
        double avg = 0;
        double total = 0;
        for(int i = 0; i < nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
            }
            if(min>nums[i]){
                min = nums[i];
            }
            total += nums[i];
            avg+= nums[i]/nums.length;
        } 
        System.out.println(max);
        System.out.println(min);
        System.out.println(total);
        System.out.println(avg);
    }
}
