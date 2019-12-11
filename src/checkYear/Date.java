package checkYear;

public class Date {
        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year) {
            checkMonth(month);
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day <= 31) {
                    System.out.println("ok");
                } else {
                    System.out.println("vui long nhap toi da la 31 ngay ");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day <= 30) {
                    System.out.println("ok");
                } else {
                    System.out.println("Vui long nhap toi da 30 ngay");
                }
            } else if (month == 2) {
                if (isLeapYear(year)) {
                    if (day <= 29) {
                        System.out.println("ok");
                    } else {
                        System.out.println("Vui long nhap 28 ngay");
                    }
                }
            }
            checkYear(year);
            this.day = day;
            this.month = month;
            this.year = year;
        }

        private void checkMonth(int month) {
            try {
                if (0 < month && month <= 12) {
                    System.out.println(" Ban da nhap thanh cong thang");
                } else {
                    System.out.println("Vui long cai dat lai thang voi gia tri 1 <= thang <= 12");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long cai dat lai thang voi gia tri 1 <= thang <= 12");
            }
        }

        private void checkYear(int year) {
            try {
                if (0 > year) {
                    System.out.println(" Ban da nhap thanh cong nam");
                } else {
                    System.out.println("Vui long cai dat lai nam voi gia tri nam > 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long cai dat lai nam voi gia tri nam > 0");
            }
        }

        public boolean isLeapYear(int year) {
            if (year > 0 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
            return false;
        }
        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
