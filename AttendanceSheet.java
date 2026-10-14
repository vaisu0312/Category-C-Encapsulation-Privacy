public class AttendanceSheet {
    private final String[] presentNames;
    private int count;

    public AttendanceSheet(int maximumStudents) {
        presentNames = new String[maximumStudents];
        count = 0;
    }

    public void markPresent(String name) {
        if (count >= presentNames.length || isPresent(name)) {
            return;
        }
        presentNames[count] = name;
        count++;
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (presentNames[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        System.out.println(sheet.getPresentCount());
        System.out.println(sheet.isPresent("Ben"));
        System.out.println(sheet.isPresent("Chen"));
    }
}
