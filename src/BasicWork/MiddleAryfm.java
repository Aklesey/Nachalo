package BasicWork;

/**
 * Created by user on 30.05.2016.
 */
public class MiddleAryfm {
    public static void main(String[] args) {
        int sum = 0;
        int myArray[];
        myArray = new int[(int) (Math.random() * 100)];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            sum +=myArray[i];
        }
        System.out.println(sum/myArray.length);

    }
}
