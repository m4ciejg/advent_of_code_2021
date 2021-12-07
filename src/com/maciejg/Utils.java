package com.maciejg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    private final static String finalPathHome = "C:/Users/Maciek/IdeaProjects/AdventOfCode/src/com/maciejg/";
    private final static String finalPathWork = "C:/Users/maciej.grabowski/Documents/Projekty/PRYWATNE/src/com/maciejg/";

    public static List<Integer> loadFileToList(String txt){
       var temp = new ArrayList<Integer>();
        try{
            Scanner sc = new Scanner(new File(finalPathWork + txt));
            while(sc.hasNext()) {
                temp.add(Integer.parseInt(sc.nextLine()));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return temp;
    }

    public static List<String> loadFileToListString(String txt){
        var temp = new ArrayList<String>();
        try{
            Scanner sc = new Scanner(new File(finalPathWork + txt));
            while(sc.hasNext()) {
                temp.add(sc.nextLine());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return temp;
    }
}
