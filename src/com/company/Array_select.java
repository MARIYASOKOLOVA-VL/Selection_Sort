package com.company;

public class Array_select {

    private int[] arr;
    private int elem;

    public Array_select(int size){ // конструктор
        arr = new int[size];
        elem = 0;
    }

    public void insert(int value){ // вставка элементов в массив (вручную)
        arr[elem] = value;
        elem ++;
    }

    public void insert_comp(){ // вставка элементом с помощью метода random
        for (int i = 0; i < 100; i++){
            int random_value = (int)(Math.random()*(200+1)) - 100;
            arr[elem] = random_value;
            elem ++;
        }
    }

    public void print_array(){ // вывод массива
        for (int i = 0; i < elem; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void selection_sort(){
        for (int i = 0; i < elem-1; i++){
            int min = i;
            for (int j = i+1; j < elem; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int c = 0;
            c = arr[i];
            arr[i] = arr[min];
            arr[min] = c;
            }
        }
    }

