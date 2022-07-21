import javax.annotation.processing.SupportedOptions;
import javax.swing.SpringLayout;

class Strings {
    public static void main(String[] args) {
        String myName="Matt";
       int length= myName.length();
       String myNameUpper=myName.toUpperCase(); // a new variable is created and we call it the "return-value of the method".
       boolean includesAtt=myName.contains("att");
       System.out.println(includesAtt);
       System.out.println("My name is : "+myName);
       System.out.println("My name is : "+myNameUpper);
       System.out.println("This has "+length+" characters.");
       System.out.println(myName.contains("att"));

       String phrase = "Many hands make light work.";
       System.out.println(phrase.startsWith("Many"));
       System.out.println(phrase.startsWith("many"));
       System.out.println(phrase.endsWith("ork."));
       System.out.println(phrase.indexOf("light"));
       System.out.println(phrase.indexOf("Light"));
       System.out.println(phrase.indexOf("hello"));
       System.out.println(phrase.substring(16));
       System.out.println(phrase.substring(16,21));
       System.out.println(phrase.replace("light","heavy"));

       String myNamee = "Dale McGovern";
       String yourName = "Dale Smethurst";

       String myFirstName=myNamee.substring(0,3);
       String yourFirstName=yourName.substring(0,4);

       System.out.println(myFirstName);
       System.out.println(yourFirstName);

    //    boolean weHaveTheSameFirstName = (myFirstName==yourFirstName);
       boolean weHaveTheSameFirstName = myFirstName.equals(yourFirstName);
       System.out.println(weHaveTheSameFirstName);

       String firstDay="Sunday";
       String lastDay;
       if(firstDay.equals("Sunday"))
       {
          lastDay="Saturday";
       }
       else
       {
           lastDay="Sunday";
       }
       System.out.println(lastDay);

       String nextDay = firstDay.equals("Sunday")?"Monday":"Tuesday";
       System.out.println(nextDay);

       String person="Sandra Burnside";
       int spacePosition=person.indexOf(" ");
       String surname=person.substring(spacePosition+1,person.length());
       boolean evenLength=surname.length()%2==0;
       System.out.println(surname);
       System.out.println(evenLength);

       System.out.println(myName+" "+surname+" "+evenLength+" "+spacePosition);

       //STRING INTERPOLATION
       // String greeting="Good morning <<surname>>,today is <<nextDay>>";
       String greeting="Good morning "+surname+", today is "+nextDay;
       String greeting2=String.format("Good morning %s, today is %s",surname,nextDay);
       System.out.println(greeting);
       System.out.println(greeting2);

       //Splitting strings
       String colors="blue, red, green, orange, purple";
       String[] colorsArray=colors.split(", ");
       for(String color : colorsArray)
       {
          System.out.println(color);
       }

    }

 }
