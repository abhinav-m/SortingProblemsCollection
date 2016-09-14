package com.Thinktank;

import java.util.Arrays;

public class Main {
static int[] unsortedArray = {3,1,9,10,12,8,4,6};
    public static void main(String[] args) {
        Main.insertionSort(unsortedArray);
        Main.selectionSort(unsortedArray);
        int arr[] = {1,2,3,4};
        Main.bubbleSort(arr);

    }


/*
INSERTION SORT
Insertion sort is a sorting algorithm which operates by dividing the array into a sorted and an unsorted half,
By choosing an element from the unsorted half and finding it's place in the sorted half, the algorithm sorts
the given array.

Time complexity : Best Case(Array is already sorted then the inner while loop doesn't execute , Time complexity is O(n)
                  Worst Case(Array is reverse sorted) inner while loop executes the same number of times as array length,
                  therefore O(n^2)
                  Average Case: O(n^2)
 */
    public static void insertionSort(int arr[])
    {
        int firstElm,curIndex;
        //Outer loop runs n times where n is length of array.
        for(int i = 1;i<arr.length;i++)
        {
            //The element from the unsorted half which has to be sorted.
            //curIndex is initialised to the position from where the element is picked from,creating a 'hole'
            firstElm = arr[i];
            curIndex =i;
            //Loop is traversed till either the previous element in the sorted half is less than what we chose, or
            //the entire array is traversed.
            while(curIndex >0 && arr[curIndex-1]>firstElm)
            {
                //IF the while condition was true, shift the element till it's in correct position.
                arr[curIndex] = arr[curIndex-1];
                //Decrement curIndex for further checks.
                curIndex = curIndex-1;
            }
            //Put the element in it's correct position.
            arr[curIndex] = firstElm;
        }

        System.out.println(Arrays.toString(arr));
    }


    /*SELECTION SORT*/
    public static void selectionSort(int arr[])
    {
        int minIndex,temp;
        for(int i =0;i<arr.length-1;i++)
        {
             minIndex = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;


        }
        System.out.println(Arrays.toString(arr));
    }

/*BUBBLE SORT*/
    public static void bubbleSort(int arr[])
    {
        int temp;
        boolean didSwap = false;
        for (int i =0;i<arr.length;i++)
        {
            didSwap = false;
            for (int j =0;j<arr.length-i-1;j++)
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap=true;
                }
                if(!didSwap)
                    break;
        }
        System.out.println(Arrays.toString(arr)+didSwap);
    }



}
