/*You have been given a string 'S' containing only three types of characters, i.e. '(', ')' and '*'.
A Valid String is defined as follows:
1. Any left parenthesis '(' must have a corresponding right parenthesis ')'.
2. Any right parenthesis ')' must have a corresponding left parenthesis '('.
3. Left parenthesis '(' must go before the corresponding right parenthesis ')'.
4. '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
5. An empty string is also valid.
/*
import java.util.*;
public class Solution {
public static boolean checkValidString(String s) {
       // Write your code here.
       int bracket=0;
       for(char c:s.toCharArray())
       {
           if(c==')')
               bracket--;
           else
               bracket++;
       if(bracket<0)
               return false;
       }
       if(bracket==0)

               return true;
       bracket=0;
       for(int i=s.length()-1;i>=0;i--)
       {
           if(s.charAt(i)=='(')
               bracket--;
           else
               bracket++;
           if(bracket<0)
               return false;
       }

       

         

       return true;

}

}
