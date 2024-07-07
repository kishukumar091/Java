/*
1.Create an array of 5 floats and calculate their sum.
2.Write a program to find out whether a given integer is present in an array or not.
3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
4.Create a Java program to add two matrices of size 2x3.
5.Write a Java program to reverse an array.
6.Write a Java program to find the maximum element in an array.
7.Write a Java program to find the minimum element in a Java array.
8.Write a Java program to find whether an array is sorted or not.
*/
public class Array_Practice {
    public static void main(String[] args) {

        //Problem 1
        float [] arr ={23.8f,48.80f,94.89f,72.1f,98.2f};
        float sum=0;
        for (float element:arr) {
            sum=sum+element;
        }
        System.out.println("The sum of the array is: "+sum);

        //problem 2
        int [] kishu = {23,56,78,90,43,87,67};
        int ele=90;
        boolean isInArray=false;
        for (int element:kishu
             ) {
            if(ele==element){
                isInArray=true;
                break;
            }
        }
        if (isInArray){
            System.out.println("Number is present in array");
        }
        else{
            System.out.println("Number is not Present in array");
        }

        //Problem 3
        int [] marks={34,67,88,98,90,56,76};
        int num=0;
        for (int element:marks
             ) {
            num=num+element;
        }
        float average =(float) num/marks.length;
        System.out.println("The average of the physics marks is: "+average);

        //Problem 4
        int [][] mat1={{1,2,3},
                       {4,5,6}};
        int [][] mat2={{1,2,3},
                       {4,5,6}};
        int [][] matSum={{0,0,0},
                        {0,0,0}};
        System.out.println("Added matrix is: ");
        for(int i=0;i<mat1.length; i++){
            for(int j=0;j<mat1[i].length;j++){
                matSum[i][j]=matSum[i][j]+mat1[i][j]+mat2[i][j];
                System.out.print(matSum[i][j] + " ");
            }
            System.out.println(" ");
        }

        //problem 5
        int [] nRev={1,4,7,0,8,3,2};
        int l= nRev.length;
        int [] rev = new int[l];
        System.out.print("Reversed array is: ");
        for(int i=0;i<l;i++){
            rev [i] = nRev[l-i-1];
            System.out.print(rev[i]+" ");
        }
        System.out.println();


        //Problem 6
        int [] array={1,2,3,4,5,67,5,9,54,90};
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Maximum number in array is: "+max);

        //Problem 7
        int [] array2={4,65,7,8,1,3,8,9};
        int min=array2[0];
        for(int i=0;i<array2.length;i++){
            if (array2[i]<min){
                min=array2[i];
            }
        }
        System.out.println("Minimum number in the array is: "+min);

        //Problem 8
        int [] array3={0,1,5,6,8,9};
        boolean isSorted=true;
        for(int i = 0; i< array3.length-1; i++){
            if (array3[i] > array3[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }

    }
}
