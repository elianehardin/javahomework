package class9;

public class E8Arrays { // print all the number from 6 to 0 in reverse orde - output 6, 5,4,3,2,1,0 and 'A','B' ' C' D' 'E' 'F'
    public static void main(String[] args) {
char [] chars = {'A', 'B', 'C', 'D' ,'E', 'F'};
        for (int i = chars.length -1; i >= 0; i--) {
            System.out.println(i + " "+ chars [i]);

        }


    }
}
