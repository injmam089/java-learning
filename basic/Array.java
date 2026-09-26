public class Array{
    public static void main(String []args){
        /*
        int [][] marks= new int[3][3];
        marks[0][0]=90;
        marks[0][1]=45;
        marks[0][2]=78;
        marks[1][0]=56;
        marks[1][1]=54;
        marks[1][2]=89;
        marks[2][0]=84;
        marks[2][1]=67;
        marks[2][2]=66;
        for(int row=0; row<marks.length; row++){
            for(int col=0; col<marks[row].length;col++){
                System.out.print(marks[row][col]+" ");
            }
            System.out.println();
        }
        */
        int[][] marks=new int[3][];
        marks[0]= new int[1];
        marks[1]= new int[2];
        marks[2]= new int[3];
        marks[0][0]=90;
        marks[1][0]=56;
        marks[1][1]=54;
        marks[2][0]=84;
        marks[2][1]=67;
        marks[2][2]=66;
        for(int row=0; row<marks.length; row++){
            for(int col=0; col<marks[row].length; col++){
                System.out.print(marks[row][col]+" ");
            }
            System.out.println();
        }
    }
}