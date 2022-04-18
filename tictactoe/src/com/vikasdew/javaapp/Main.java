package com.vikasdew.javaapp;

import java.util.*;

public class Main {
    static List<Integer> player1check = new ArrayList<>();
    static List<Integer> player2check = new ArrayList<>();

    public static void printboard(char[][] board){
        for(char[] row: board){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static boolean placePiece(char[][] board, int pos, String user){
        char sym = 'X';
        if(user.equals("player1")){
            sym = 'X';
            player1check.add(pos);
        }else if(user.equals("player2")){
            sym = 'O';
            player2check.add(pos);
        }
        switch(pos){
            case 1:
                if(board[0][0]=='X'||board[0][0]=='O'){
                    System.out.println("Wrong input, Start Again!!!");
                    return true;
                }
                board[0][0] = sym;
                break;
            case 2:
                if(board[0][2]=='X'||board[0][2]=='O'){
                    System.out.println("Wrong input, Start Again!!!");
                    return true;
                }
                board[0][2] = sym;
                break;
            case 3:
                if(board[0][4]=='X'||board[0][4]=='O'){
                    System.out.println("Wrong input, Start Again!!!");
                    return true;
                }
                board[0][4] = sym;
                break;
            case 4:
                if(board[2][0]=='X'||board[2][0]=='O'){
                    System.out.println("Wrong input, Start Again!!!");
                    return true;
                }
                board[2][0] = sym;
                break;
            case 5:
                if(board[2][2]=='X'||board[2][2]=='O'){
                    System.out.println("Wrong input, Start Again!!!");
                    return true;
                }
                board[2][2] = sym;
                break;
            case 6:
                if(board[2][4]=='X'||board[2][4]=='O'){
                    System.out.println("Wrong input, Start Again!!!");
                    return true;
                }
                board[2][4] = sym;
                break;
            case 7:
                if(board[4][0]=='X'||board[4][0]=='O'){
                    System.out.println("Wrong input, Start Again!!!");
                    return true;
                }
                board[4][0] = sym;
                break;
            case 8:
                if(board[4][2]=='X'|| board[4][2]=='O'){
                    System.out.println("Wrong input, Start Again!!!");
                    return true;
                }
                board[4][2] = sym;
                break;
            case 9:
                if(board[4][4]=='X'||board[4][4]=='O'){
                    System.out.println("Wrong input, Start Again!!!");
                    return true;
                }
                board[4][4] = sym;
                break;
            default:
                System.out.println("Start Again and choose between 1-9");
                return true;
        }
        return false;
    }

    public static boolean checkWin(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(3,5,7);
        List<List> winCon = new ArrayList<>();
        winCon.add(topRow);
        winCon.add(midRow);
        winCon.add(botRow);
        winCon.add(leftCol);
        winCon.add(midCol);
        winCon.add(rightCol);
        winCon.add(cross1);
        winCon.add(cross2);

        for(List l:winCon){
            if(player1check.containsAll(l)){
                System.out.println("Player 1 Won!!!");
                return true;
            }else if(player2check.containsAll(l)){
                System.out.println("Player 2 Won!!!");
                return true;
            }else if(player1check.size()+player2check.size()==9){
                System.out.println("It's a Draw...");
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = {
                         {'1','|','2','|','3'},
                         {'-','+','-','+','-'},
                         {'4','|','5','|','6'},
                         {'-','+','-','+','-'},
                         {'7','|','8','|','9'}
        };
        printboard(board);
        int p = 1;
        while(true){
            Scanner sc = new Scanner(System.in);

            if(p==1){
                System.out.println("Player"+1+": Enter number (1-9):");
                int pos = sc.nextInt();

                if(placePiece(board,pos,"player1")){
                    break;
                }
                    p=2;
            }
            else if(p==2){
                System.out.println("Player"+2+": Enter number (1-9):");
                int pos = sc.nextInt();

                if(placePiece(board,pos,"player2")){
                    break;
                }
                p=1;

            }
            printboard(board);
            if(checkWin()){
                break;
            }
        }
    }
}
