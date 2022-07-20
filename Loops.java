package LearningJavaFundamentals;

public class Loops {
    public static void main(String args[ ]){
        for(int i=50;i<=55;i++)
        {
            System.out.println(i);
        }
        double[] array={13.5,12.7,1.6};
        System.out.println(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
          }  System.out.println(array.length);
        
        int counter=0;
        while(counter<5)
        {
            System.out.println("hello"+counter);
            counter++;

        }
        int totalScore=95;
        do{
            System.out.println("Hello");
            totalScore++;

        }while(totalScore<100);


    }
    
}
