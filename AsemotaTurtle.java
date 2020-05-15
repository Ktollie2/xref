//Code written by Efosa Asemota
package com.company;
import java.util.Scanner; //Library that handles inputs

public class AsemotaTurtle {

    private static int[][] turtleArr = new int [20][20]; //20x20 array for the board
    private static int getCommand; //Determines how the turtle will move on the board.
    private static int penUpOrDown; //If the value equals 1, the pen's direction is up, if the value equals 2, the direction is down.
    private static int penRightOrLeft;  //If the value equals 1, then pen's direction is right, if the value is 2, the direction is left.
    private static Scanner input = new Scanner(System.in); //Used to get input from user.
    private static int xPos = 0; //Holds the current x-position of the turtle.
    private static int yPos; //Holds the current y-position of the turtle.


    public static void main(String[] args) { //main function of the program

        initializeBoard(); //Function initializes the board to all 0s.

            //Basic Menu of instructions
            System.out.println("Hello this is the turtle graphics program!"); //Instructions
            System.out.println("Please select from one of the following commands."); //Instructions
            System.out.println(""); //Text break.
            System.out.println("1: Pen Up"); //Command 1.
            System.out.println("2: Pen Down"); //Command 2.
            System.out.println("3: Turn right"); //Command 3.
            System.out.println("4: Turn left"); //Command 4.
            System.out.println("5. Move Forward"); //Command 5.
            System.out.println("6. Display the 20-by-20 array"); //Command 6.
            System.out.println("9. End of data"); //Command 7.
            System.out.println(""); //Text break.

        do{ //main loop of the program.
            System.out.print("Enter command: ");//Enter command
            getCommand = input.nextInt(); //Save input from the user
            System.out.println(""); //Text break

            switch (getCommand) { //Switch statement for getCommand
                case 1: //The pen is up
                    penUpOrDown = 1; //variable set to 1
                    break;
                case 2: //The pen is down
                    penUpOrDown = 2; //variable set to 2
                    break;
                case 3: //The pen is right
                    penRightOrLeft = 1; //variable set to 1
                    break;
                case 4: //The pen is left
                    penRightOrLeft = 2; //variable set to 2
                case 5: //The pen movement
                    moveTurtleUpDown(); //Function lets the turtle move vertically
                    moveTurtleLeftRight(); //Function lets the turtle move horizontally.
                    penUpOrDown = 0; //resets the global class variable after every iteration
                    penRightOrLeft = 0; //resets the global class variable after every iteration
                    break;
                case 6:
                    printBoard(); //displays the board to the console.
                    break;
                default:
                    System.out.println("Thanks for playing!"); //Any other case that isn't 1-6 will get print this message as a default.

            }


        } while(getCommand < 7 && getCommand > 0); //loop runs as long as getCommand is less than 7 and greater than 0.

    }

    private static void initializeBoard(){ //initialization of the board
        for(int i = 0; i < 20; i++){ //Looping through each row

            for(int j = 0; j < 20; j++){ //Looping through each column
                turtleArr[i][j] = 0; //Set the value of each index to 0.
            }
        }
    }

    private static void printBoard(){ //Printing the current state of the board
        for(int i = 0; i < 20; i++){ //Looping through each row

            for(int j = 0; j < 20; j++){ //Looping through each column

                System.out.print(turtleArr[i][j] + " "); //Printing the index of the board and giving a space between each index.
            }

            System.out.println(" "); //Printing a space to go to the next row.
        }
    }

    private static void moveTurtleUpDown(){ //Function that handles the turtle's movement up or down on the board.

        if(penUpOrDown == 2){ //if the pen is down
            int move; //indicates how many spaces the user moves
            System.out.println("How many spaces do you want to move?");
            move = input.nextInt(); //gets input from user
            if(move == 0) { //if user for some reason doesn't want to move
                xPos = xPos + move; //makes sure that the current xPos remains the same

            }
            else { //if the user wants to move
                xPos = xPos + (move - 1); //overwrites the xPos with the current xPos
                for (int i = 0; i <= xPos; i++) { //looping through xPos
                    turtleArr[i][yPos] = 1; //sets the index in the array to 1
                }
            }
        }

        else if(penUpOrDown == 1){ //if the pen is up
            if(xPos > 0){ //if the xPos is not at the first element of the array
                int move; //initialization
                int temp; //initialization
                System.out.println("How many spaces do you want to move up?");
                move = input.nextInt(); //reads input from user
                temp = move - 1; //this variable holds the value of (move - 1)
                xPos = xPos - temp; //subtracts temp from xPos since the user wants to move up vertically.

            }

            else{ //the xPos is at the first element of the array and the user attempts to go up
                System.out.println("Sorry this is invalid."); //prints the error message
            }
        }

    }

    private static void moveTurtleLeftRight(){ //Function handles moving the turtle horizontally to the left or to the right
        if(penRightOrLeft == 1){ //if the pen is down and facing right
            System.out.println("How many spaces do you want to move?");
            int move = input.nextInt(); //save input from user

            yPos = yPos + (move - 1); //overwrites yPos with the current yPos
            for(int i = 0; i < yPos; i++){ //looping through yPos
                turtleArr[xPos][i] = 1; //sets each index to 1 leading up to yPos
            }

        }

        else if(penRightOrLeft == 2){ //if the pen is down and facing left
            System.out.println("How many spaces do you want to move");
            int move = input.nextInt(); //saves input from user

            int temp = move - 1; //temp variable holds the value of (move - 1).
            yPos = yPos - temp; //yPos will get overwritten with the current value of yPos and it gets subtracted since it is going left.
            for(int i = 0; i <= yPos; i++){ //looping through yPos
                turtleArr[xPos][i] = 1; //sets each index equal to 1 leading up to yPos
            }

        }
    }
}
