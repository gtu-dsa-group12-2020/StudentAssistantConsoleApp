import java.util.List;
import java.util.ArrayList;

public class Calender {
    private List<Date> dates;

    public Calender() {
        dates = new ArrayList<>();
    }

    public Date getDate(int index) {
        if(index < 0 || index > dates.size())
            throw new IndexOutOfBoundsException();

        return dates.get(index);
    }

    public void printCalender() {
        for(Date d : dates) {
            System.out.println(d.toString());
        }
    }

    public class Date<E> {
        private int day;
        private int month;
        private int year;
        private E specification;

        public Date() {
            day = 0;
            month = 0;
            year = 0;
            specification = null;
        }

        public Date(String date) {
            String[] dates = date.split(".");
            try {
                if (dates.length == 3) {
                    day = Integer.parseInt(dates[0]);
                    month = Integer.parseInt(dates[1]);
                    year = Integer.parseInt(dates[2]);
                    specification = null;
                }
                else
                    throw new NoSuchMethodException();
            }
            catch(Exception e) {
                System.out.println("Wrong uses date");
            }
        }


        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public E getSpecification() {
            return specification;
        }

        public void setSpecification(E specification) {
            if(specification != null)
                this.specification = specification;
        }

        @Override
        public String toString() {
            return day + "." + month + "." + year + " -> " + specification;
        }
    }

}
