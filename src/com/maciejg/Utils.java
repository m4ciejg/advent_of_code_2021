package com.maciejg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    private final static String finalPath = "C:/Users/Maciek/IdeaProjects/AdventOfCode/src/com/maciejg/";

    public static List<Integer> loadFileToList(String txt){
       var temp = new ArrayList<Integer>();
        try{
            Scanner sc = new Scanner(new File(finalPath + txt));
            while(sc.hasNext()) {
                temp.add(Integer.parseInt(sc.nextLine()));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return temp;
    }
}
