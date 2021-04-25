package com.lc.array;

public class arrayDemo08 {
    public static void main(String[] args) {
        //创建二维数组 11*11，0：没有旗子  1：黑棋  2：白棋
        int[][] array= new int[11][11];
        array[1][2]=1;
        array[2][3]=2;
        for (int[] ints : array){
            for(int anInt : ints){
//                System.out.print(anInt+"\t");
            }
//            System.out.println();
        }
        //转换为稀疏数组
        //获取有效值个数
        System.out.println("================");
        int sum = 0;
        for(int i=0;i<11;i++){
            for (int j=0;j<11;j++){
                if(array[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("you xiao value"+ sum);
        //创建一个二维稀疏数组
        int[][] array2= new int[sum+1][3];
        array2[0][0]=11;
        array2[0][1]=11;
        array2[0][2]=sum;
        //遍历二维数组
        int count=0;
        for(int i=0;i<array.length;i++){
            for (int j=0;j< array[i].length;j++){
                if(array[i][j]!=0){
                    count++;
                    array2[count][0]=i;
                    array2[count][1]=j;
                    array2[count][2]=array[i][j];
                }
            }
        }
        for(int i=0;i< array2.length;i++){
            System.out.println(array2[i][0]+"\t"+array2[i][1]+"\t"+array2[i][2]+"\t");
        }
        //还原
        System.out.println("==");
        //11、read array
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        //还原
        for (int i=1;i<array2.length;i++){
            array3[array2[i][0]][array2[i][1]]=array2[i][2];
        }
        System.out.println("=还原=");
        for (int[] ints : array3){
            for(int anInt : ints){
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

    }
}
