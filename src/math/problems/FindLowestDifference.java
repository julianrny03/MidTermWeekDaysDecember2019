package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int min = array1[1];
        for(int x =1; x<array1.length; x++){
            for (int y=1; y<array2.length;y++){

                int m = Math.abs(array1[x] - array2[y]);
                if (m<min) min = m;
            }
        }
        System.out.println(min);



    }

}
