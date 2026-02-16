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


// 3 dimentional array =3D → stack of tables
// arr[block][row][column]
        int array[][][]=new int[2][2][2];
        
        int value = 1;

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = value++;
                }
            }
        }

 // Printing
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Block " + i);
            
            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}