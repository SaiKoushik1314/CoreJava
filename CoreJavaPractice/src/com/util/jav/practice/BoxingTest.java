package com.util.jav.practice;
class BoxingTest { 
    public static void main(String[] args) { 
        printArray(new int[] {1, 2, 3, 4}); 
    } 
    private static void printArray (int[] nums) { 
        for (Integer num : nums) {
            System.out.println(num); 
        }
    } 
} 
