package org.example;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        /*Hopfield Test = new Hopfield();
        Test.remember("C:\\\\Users\\\\User\\\\Desktop\\\\tests\\\\A_damaged.png");*/

        //GenMaxFun Test = new GenMaxFun();
        AnnelingSim Test = new AnnelingSim();
        Test.anneling();
        //Perceptron per = new Perceptron();
        //PerceptronArabian per = new PerceptronArabian();
        //per.test();
    }
}