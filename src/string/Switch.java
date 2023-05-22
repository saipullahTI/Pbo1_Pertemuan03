import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = input.nextInt();

        String grade;

        switch (nilai) {
            case 80:
                grade = "A";
                break;
            case 70:
                grade = "B";
                break;
            case 60:
                grade = "C";
                break;
            case 50:
                grade = "D";
                break;
            default:
                grade = "E";
                break;
        }

        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);

        input.close();
    }
}
