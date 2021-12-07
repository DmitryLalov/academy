package by.academy.homework.homeworc4;

public class Date {
    private String date;

    public Date(String date) {
        this.date = date;
        Year year = new Year(date);
        Month month = new Month(date);
        Day day = new Day(date);
    }

    public class Year {
        private int year;

        public Year(String date) {
            year = Integer.parseInt(date.split("-")[2]);
        }
    }

    public class Month {
        private int monthNumber;
        private String month;

        public Month(String date) {
            monthNumber = Integer.parseInt(date.split("-")[1]);
            switch (monthNumber) {
                case 1:
                    month = "Janiary";
                    break;
                case 2:
                    month = "Febriary";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
            }
        }
    }

    public class Day {
        private int dayNomber;
        private String dayOfWeek;

        public Day(String date) {
            dayNomber = Integer.parseInt(date.split("-")[0]);
        }
    }

    @Override
    public String toString() {
        return "Date{" +
                "date='" + date + '\'' +
                '}';
    }
}
