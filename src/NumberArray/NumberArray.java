package NumberArray;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        //Nhập giá trị cho phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }

        //In ra danh sách mảng đã nhập
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }

        //Duyệt các phần tử trong mảng để tìm giá trị lớn nhất và vị trí
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }

        System.out.println("The largest property value in the list is " + max + " , at position " + index);
    }
}
