import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P75 {
    public static void func(String template,Map<String,String> dict){
        int a=0;
        int b=0;
        for(int i=0;i<template.length();i++){
            if(template.charAt(i)=='{'&&template.charAt(i+1)!='{'){
                a=i;
            }
            if(template.charAt(i)=='}'&&template.charAt(i-1)!='}'){
                b=i;
            }
        }
        String s=template.substring(a+1,b);
        if(dict.containsKey(s)&&s.length()>0){
            StringBuilder stringBuilder=new StringBuilder(template);
            stringBuilder.replace(a+1,b,dict.get(s));
            System.out.println(stringBuilder.toString());
        }
        if(s==null||s.length()==0){
            System.out.println(template);
        }else if(!dict.containsKey(s)) {
            StringBuilder stringBuilder = new StringBuilder(template);
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i) == '{' || stringBuilder.charAt(i) == '}') {
                    stringBuilder.deleteCharAt(i);
                    i--;
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int x=scanner.nextInt();
        scanner.nextLine();
        Map<String,String> dict=new HashMap<>();
        for (int i=0;i<x;i++){
            String s1=scanner.nextLine();
            int a=0;
            int b=0;
            for (int j=0;j<s1.length();j++){
                if (s1.charAt(j)=='-'){
                    a=j;
                }
                if (s1.charAt(j)=='>'){
                    b=j;
                }
            }
            dict.put(s1.substring(0,a),s1.substring(b+1,s1.length()));
        }
        for(String c:dict.keySet()){
            System.out.println(c+" "+dict.get(c));
        }
        func(s,dict);
    }
}
