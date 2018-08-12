package pkgcontinue;

/**
 * @author: Veysel Dogan 
 * Date: 12-Aug-2018 
 * Console Application: Continue
 * Main Class
 */
public class Continue {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                continue;   // where is the command of continue again the loop.
            }
            System.out.println("");
        }      //in here we did if our number/3 and remaining is 0 go to battom else normally write.

        
        
        for (int var1 = 0; var1 < 5; var1++) {
            for (int var2 = 0; var2 < 3; var2++) {
                if (var2 == 2) {
                    continue;
                }
                System.out.println("var1: " + var1 + "var2: " + var2);
            }
        }

        
        
        int intArray[] = new int[]{1, 2, 3, 4, 5}; //in here we will without number 4 so our loop if equals number 1,2,3,5 will write our number but don't write number 4
        System.out.println("Wİthout number 4: ");
        for (int j = 0; j < intArray.length; j++) {
            if (intArray[j] == 4) //but don't write number 4
            {
                continue;
            } else {
                System.out.println(intArray[j]);//will write our loop
            }
        }

        
        
        String sentence = "We are writing code"; //will write how many character in there 
        int length = sentence.length();
        int piece = 0;
        for (int m = 0; m < length; m++) {
            if (sentence.charAt(m) != 'e') //ex. we chose character a. will write 1 because the sentence
            {
                continue; //because the sentence have 1 "a" and the loop write again until it found
            }
            piece++;
        }
        System.out.println("Found " + piece);

    }

}
