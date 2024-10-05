package Strings;

public class subSetOfString {

    public void subString(String name)
    {
        for(int i =0;i<name.length()-1;i++)
        {
            for(int j= 0;j<=name.length();j++)
            {
                System.out.println(name.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        subSetOfString sos = new subSetOfString();
        sos.subString("Sai");

    }
}
