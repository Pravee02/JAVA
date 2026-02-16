public class Multiarray{
    public static void main(String args[]){
        int num[][]=new int[3][4];
       for(int i=0;i<num.length;i++)
        {
        for(int j=0;j<num[i].length;j++){
            num[i][j]=(int)(Math.random()*10);
        }
        }



        for(int i=0;i<num.length;i++)
        {
        for(int j=0;j<num[i].length;j++){
            System.out.print(num[i][j]+" ");
        }
        System.out.println();
        }
        // this is new  array printing method 
for(int n[]:num){
    for(int m:n){
        System.out.print(m+" ");
    }
    System.out.println();
}

    }
}