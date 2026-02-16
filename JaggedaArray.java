public class JaggedaArray{
    public static void main(String args[]){


//jagged array 
        int num2[][]=new int[3][];//jagged
        num2[0]=new int[3]; // we defining the induvidual size of rows
        num2[1]=new int[4];
        num2[2]=new int[2];
       
 //printing array
       for(int i=0;i<num2.length;i++)
        {
        for(int j=0;j<num2[i].length;j++){
            num2[i][j]=(int)(Math.random()*10);
        }
        }
 //printing array 
        for(int n[]:num2){   // in this we dont need to give the size of array it will give 
            for(int m:n){     // -autometic
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}