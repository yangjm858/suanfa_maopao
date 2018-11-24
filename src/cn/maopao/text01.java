package cn.maopao;

public class text01 {
    public static void main(String[] args) {
    int [] arr = {9,12,3,5,7,6};
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println();
        for(int x = 0;x < arr.length-1;x++){
            for(int y = 0;y < arr.length-1;y++){
                if (arr[y] > arr[y+1]) {
                   int temp = arr[y];
                   arr[y] = arr[y+1];
                   arr[y+1] = temp;
                }
            }
        }
        for (int w : arr) {
            System.out.print(w+",");
        }
     }
}


