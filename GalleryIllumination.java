import java.util.Scanner;

public class GalleryIllumination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c, total;
        System.out.print("Please enter the number of rows: ");
        r = sc.nextInt();
        System.out.print("Please enter the number of coloumns");
        c = sc.nextInt();

        String[] floorPlan = new String[r];
        total = countDarkCells(r, c, floorPlan);
        System.out.println("Total dark cells: " + total);
        sc.close();
    }

    public static int countDarkCells(int r, int c, String[] fp) {
        
        return 0;
    }
}