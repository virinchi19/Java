 class Methact {
     public static void main(String[] args) {
        
        int result=whoIsOlder(4,7);
         System.out.println("Larger integer is: "+result);
         boolean result2=longerThan5("Mouse");
         System.out.println(result2);
     }
     public static int whoIsOlder(int age1,int age2)
     {
        //  int largerOne=(age1>age2)?age1:age2;
        //  return largerOne;
        if(age1>age2)
        {
            return age1;
        }
        else{
            return age2;
        }
     }

     public static boolean longerThan5(String word)
     {
        //  if(word.length()>=6)
        //  {
        //     return true;
        //  }
        //  else
        //  {
        //      return false;
        //  }
        // return word.length()>=6?true:false;
        return word.length()>=6;
        

     }
    
}
