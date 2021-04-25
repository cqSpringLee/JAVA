package com.lc.array;

public class arrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
//        for (int array:arrays){
//            System.out.println(array);
//        }
//        printArray(arrays);
        int[] result=reserveArray(arrays);
        printArray(result);
    }
    //打印数组
    public static void printArray(int[] arrays){
        for (int i=0;i< arrays.length;i++){
            System.out.println(arrays[i]+" ");
        }
    }
    //反转数组
    public static int[] reserveArray(int[] arrays){
        int[] result=new int[arrays.length];
        for (int i=0,j=arrays.length-1;i<arrays.length;i++,j--){
            result[j]=arrays[i];
        }
        return result;

    }
//    public static void reserveArray(int[] arrays){
//        for (int i=0;i< arrays.length;i++){
//            int m=0;
//            int p= arrays.length-i;
//            m=arrays[i];
//            arrays[i]=arrays[p];
//            arrays[(arrays.length-i)]=m;
//        }
//    }

}
