package JAVA;

public class StringIntro {
    public void palindrome(String str)
    {
      boolean status = false ;
      char[] strArr =  str.toCharArray();
      int start =0 ;
      int end = strArr.length-1 ;
      while(start<end)
      {
          if(strArr[start] != strArr[end])
          {
              status = false;
          }
          else
          {
              status = true;
          }
          start++;
          end--;
      }
      System.out.println(status);
    }
    public static void main(String[] args)
    {
        StringIntro st = new StringIntro();
        st.palindrome("THAT");
    }
}
