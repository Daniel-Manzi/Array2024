public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int forloopover = 0;
        System.out.print("Original Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        boolean tosort = true;

       for (int i = 1; i < numbers.length && tosort; i++) {
           tosort = false;
           forloopover++;
         for (int j = 0; j < numbers.length - i; j++) {
               forloopover++;
               if (numbers[j] > numbers[j + 1]) {
                   forloopover++;
                   int greater = numbers[j];
                   numbers[j] = numbers[j + 1];
                   numbers[j + 1] = greater;
               }
           }
       }

        System.out.print("Modified Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Total Loop Iterations: " + forloopover);
    }
    }