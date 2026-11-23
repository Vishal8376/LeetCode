class Solution {
    public boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public int dayOfYear(String date) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] cal = date.split("-");

        int year = Integer.parseInt(cal[0]);
        int month = Integer.parseInt(cal[1]);
        int day = Integer.parseInt(cal[2]);

        int totalDays = day;
        for (int i = 1; i < month; i++) {
            totalDays += days[i];
        }

        if (month > 2 && isLeapYear(year)) {
            totalDays += 1;
        }

        return totalDays;
    }
}
