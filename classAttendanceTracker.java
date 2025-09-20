package AssignmentDay2;

import java.util.Scanner;

public class classAttendanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Enter class size
        System.out.print("Enter total number of students in the class: ");
        int classSize = scanner.nextInt();

        int[] attendance = new int[30]; // max 30 days
        int days = 0;

        // 2. Record attendance using do-while loop
        String more;
        do {
            if (days >= 30) {
                System.out.println("Maximum of 30 days reached.");
                break;
            }
            System.out.print("Enter number of students present for day " + (days + 1) + ": ");
            attendance[days] = scanner.nextInt();
            scanner.nextLine(); // consume newline
            days++;

            System.out.print("Record attendance for another day? (yes/no): ");
            more = scanner.nextLine().trim().toLowerCase();
        } while (more.equals("yes"));

        // 3. After data entry is complete
        int totalAttendance = 0;
        int lowAttendanceDays = 0;

        System.out.println("\n--- Attendance List ---");
        System.out.println();
        for (int i = 0; i < days; i++) {
            System.out.println();
            totalAttendance += attendance[i];
            if (attendance[i] < classSize / 2.0) { // below 50%
                lowAttendanceDays++;
            }
        }

        double avgAttendance = (days > 0) ? (totalAttendance * 1.0 / days) : 0;
        double percentLow = (days > 0) ? (lowAttendanceDays * 100.0 / days) : 0;

        System.out.println("-----------------------");
        System.out.println(avgAttendance);
        System.out.println();

        scanner.close();
    }
}
