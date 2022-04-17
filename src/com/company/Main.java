package com.company;

public class Main {

    public static void main(String[] args) {

        int size = 100;
        Array_select my_arr = new Array_select(size);

        //my_arr.insert(5); // заполняем массив вручную
        //my_arr.insert(10);
        //my_arr.insert(-4);
        //my_arr.insert(53);
        //my_arr.insert(1);
        //my_arr.insert(2);
        //my_arr.insert(-25);
        //my_arr.insert(-100);

        my_arr.insert_comp(); // заполняем массив автоматически

        System.out.println("Изначальный массив: ");
        my_arr.print_array();
        my_arr.selection_sort();
        System.out.println("Отсортированный массив: ");
        my_arr.print_array();
    }
}
