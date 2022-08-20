
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.*;

public class Main
{
    private static final Integer SIZE = 6;
    private static final Integer LENGTH_OF_NAME = 5;
    private static Integer imperatywne(String[] names)
    {
        Integer numberOfLongName = 0;
        for(int i = 0;i<SIZE;i++)
        {
            if(names[i].length() > LENGTH_OF_NAME) numberOfLongName++;
        }
        return numberOfLongName;
    }
    private static Long funkcyjne(String[] names)
    {
        return Arrays.stream(names).filter(n -> n.length() > LENGTH_OF_NAME).count();
    }
    public static void main(String[] args) {
        String[] names = new String[6];
        names[0] = "Izabela";
        names[1] = "Elżbieta";
        names[2] = "Bartłomiej";
        names[3] = "Iza";
        names[4] = "Ela";
        names[5] = "Bartek";
        System.out.println(imperatywne(names));
        System.out.println(funkcyjne(names));
    }
}
