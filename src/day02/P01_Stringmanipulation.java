package day02;

public class P01_Stringmanipulation {
    public static void main(String[] args) {
        /*
        String Manipulation: is a process (methods) to change or modify strings

        length() :
        toUpperCase, toLoweCase():
        trim():
        valueOf():
        startsWith(), endsWith()
        charAt()
        toString()
        replace()
        replaceAll()
        concat()
        split()
        equals()
        ==
        contains()
        equalsIgnoreCase()
        substring()
        compareTo()
        indexOf()
        isEmpty()
        isBlank()
        lastIndex()
     */


            // write a java program that will calculate total length of characters in
            // following 3 names exclude spaces
            String name1 = " Jo hn Do e ";
            String name2 = " Tom C ru se ";
            String name3 = " Je rr y Ka te ";

            String names = name1+name2+name3; //concatinate 3 names
            System.out.println("names: "+names);

            String withoutSpace =  names.replace(" ", "");//remove white space
            System.out.println(withoutSpace);
            int totalChars = withoutSpace.length();
            System.out.println("total number of characters: "+totalChars);

            String tanya = "tulgonoyortikova";

            for(int i = 0; i < tanya.length(); i++) {
                char ch = tanya.charAt(i);
                System.out.print(ch + " ");

            }}}

