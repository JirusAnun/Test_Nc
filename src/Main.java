import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        String line = "0,0,0";

        String[] numbers = line.split(",");
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++){
            arr.add(Integer.parseInt(numbers[i]));
        }

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the sum:");

//        int sum = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }


        for (int i = 0; i < arr.size(); i++) {

            for (int j = 1 + i; j < arr.size(); j++) {

                for (int k = 1 + j; k < arr.size(); k++) {

                    if (arr.get(i) + arr.get(j) + arr.get(k) == sum) {

                        System.out.println("======================");
                        System.out.print(arr.get(i) + " ");
                        System.out.print(arr.get(j) + " ");
                        System.out.print(arr.get(k) + " \n");
                        System.out.println("======================");
                    }

                }
            }
        }
    }
}