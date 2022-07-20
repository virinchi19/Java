package LearningJavaFundamentals;

 class Conditions {
    public static void main(String args[])
    {
        int testScore=100;
       
       
        if(testScore>50)
        {
            System.out.println("well done-you passed");
        }
        else if(testScore==50)
        {
            System.out.println("I'm not sure if you've failed or not");
        }
        else
        {
            System.out.println("Sorry-you have failed");
        }
    switch(testScore)
    {
        case 0:
        System.out.println("Did you even take the test?");
        System.out.println("You have scored zero");
        break;
        case 75:
        System.out.println("Well done for now, better luck next time");
        break; // try commenting this break and check the output
        case 100:
        System.out.println("You got top marks");
        break; 
        default:
        System.out.println("You didn't do anything special");
    }
    
    // Logical operators :1.Logical AND(&&) ,2.Logical OR(||)
    // if score>50 and score is divisible by 10
    testScore=20;
    if(testScore>50 && testScore % 10==0)
    {
    System.out.println("You passed with a score ending with zero");
    } 
    else{
        System.out.println("You have something else");
    }
}   
}
