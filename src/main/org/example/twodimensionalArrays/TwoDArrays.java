package org.example.twodimensionalArrays;

//package org.example;
//
//public class TwoDArrays {
//    public static void main(String[] args) {
//        int[][] invoice = new int[10][10];
//        int target = 10;
//        int count = 0;
//
//        int rowIndex = -1;
//        int colIndex = -1;
//        for (int i = 0; i < invoice.length; i++) {
//            for (int j = 0; j < invoice[0].length; j++) {
//                invoice[i][j] = ++count;
//
//
//                System.out.println(invoice[i][j]);
//
//            }
//        }
//        for (int i = 0; i < invoice.length; i++) {
//            for (int j = 0; j < invoice[0].length; j++) {
//if(invoice[i][j]== target){
//rowIndex = i;
//colIndex = j;
//break;
//
//}
//
//            }
//            if(rowIndex != -1 && colIndex !=-1){
//                break;
//            }
//            System.out.print(rowIndex +" "+colIndex+" "+target);
//            System.out.println();
//        }
//    }
//}
//
public class TwoDArrays {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int target = 19;
        int rowIndex = -1;
        int colIndex = -1;

        // Populate the 2D array with sequential numbers
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    rowIndex = i;
                    colIndex = j;
                    break;
                }
            }
            if (rowIndex != -1 && colIndex != -1) {
                break;
            }
        }


        if (rowIndex != -1 && colIndex != -1) {
            System.out.println("Element " + target + " found at index (" + rowIndex + ", " + colIndex + ")");
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

