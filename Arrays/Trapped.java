public class Trapped {
    public static int TrappingWater(int height[]){
        int trapped = 0;
        int leftMax [] = new int[height.length];
        leftMax[0] = height[0];

        for(int i = 1; i < height.length ; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for(int i = height.length - 2; i >= 0 ; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        } 

        for(int i = 1; i < height.length ; i++){
            int watertrapped = Math.min(rightMax[i],leftMax[i]);
            trapped += watertrapped - height[i];
        }
        return trapped;
    }
    
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(TrappingWater(height));
    }
}

