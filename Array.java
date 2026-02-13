 public class Array
 {
    public static void main(String args[])
    {
        int nums[]={1,2,3,4,5};

       
        nums[1]=20;

         System.out.println("The array is:"+nums[0]);
          System.out.println("The array is:"+nums[1]);
           System.out.println("The array is:"+nums[2]);
            System.out.println("The array is:"+nums[3]);
             System.out.println("The array is:"+nums[4]);

         int nums2[]=new int[5];

         System.out.println(nums2[2]);
         nums2[0]=10;
         nums2[1]=20;
         nums2[2]=30;
         nums2[3]=40;
         nums2[4]=50;
         System.out.println(nums2[0]);
         System.out.println(nums2[1]);
         System.out.println(nums2[2]);
         System.out.println(nums2[3]);
         System.out.println(nums2[4]);
         

         for(int i=0;i<=4;i++){
           System.out.println(nums[i]);
         }
         for(int i=0;i<=4;i++){
           System.out.println(nums2[i]);

         }
    }
 }