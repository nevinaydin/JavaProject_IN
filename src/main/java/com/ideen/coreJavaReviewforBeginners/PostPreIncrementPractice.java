package com.ideen.coreJavaReviewforBeginners;

public class PostPreIncrementPractice {
    public static void main(String[] args) {
        int x= 10,y=10;
        System.err.println("2");
        System.out.println("1");
        if(x++>y && x>y){
            x=8;
            y=12;
            System.out.println("1");
        }else if(y-- >= x++ || --x <=++y){
            System.out.println("2");
        }else{
            System.out.println("3");
            System.out.println("4");
        }
    }
}
