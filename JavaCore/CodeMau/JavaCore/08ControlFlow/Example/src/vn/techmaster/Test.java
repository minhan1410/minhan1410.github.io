package vn.techmaster;

public class Test {
    public static void check(String str)
    {
        if(str.length()<=1)
        {
            System.out.println(str);
            return;
        }
        String n=new String();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                if(i<str.length()-2 &&str.charAt(i)!=str.charAt(i+2))
                    i+=2;
                else
                    i++;
                count++;
            }
            if(i!=str.length()-1)
                n=n+str.charAt(i);
            else
            {if(i==str.length()-1 && str.charAt(i)!=str.charAt(i-1))
                n=n+str.charAt(i);
            }
        }
        if(count>0)
            check(n);
        else
            System.out.println(n);
    }

    public static void main (String[] args)
    {
        String ab="aaaararccramq";
        System.out.println("The given string is: "+ab);
        System.out.println("The new string after removing all adjacent duplicates is:");

        check(ab);
    }

}
