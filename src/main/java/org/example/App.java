package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {

        Scanner s = new Scanner(System.in);

        boolean input;

        System.out.print("Is the car silent when you turn the key? ");

        input = get_input(s);

        if(input){

            System.out.print("Are the battery terminals corroded? ");

            input = get_input(s);

            if(input){

                System.out.print("Clean terminals and try starting again.");

            }

            else{

                System.out.print("Replace cables and try again.");

            }

        }

        else{


            System.out.print("Does the car make a slicking noise? ");

            input = get_input(s);

            if(input){

                System.out.print("Replace the battery.");

            }

            else{

                System.out.print("Does the car crank up but fail to start?");

                input = get_input(s);

                if(input){

                    System.out.print("Check spark plug connections.");

                }

                else{

                    System.out.print("Does the engine start and then die? ");

                    input = get_input(s);

                    if(input){

                        System.out.print("Does you car have fuel injection?");

                        input = get_input(s);

                        if(input){

                            System.out.print("Get it in for service.");

                        }

                        else{

                            System.out.print("Check to ensure the choke is opening and closing.");

                        }

                    }

                    else{

                        System.out.print("This should not be possible.");

                    }

                }

            }

        }

        s.close();

    }

    private static boolean get_input(Scanner s){

        String temp = s.nextLine();

        if(temp.equalsIgnoreCase("y") || temp.equalsIgnoreCase("yes")){

            return true;

        }

        else{

            return false;

        }

    }

}
