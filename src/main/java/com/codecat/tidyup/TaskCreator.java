package com.codecat.tidyup;

public class TaskCreator {

    public enum Category{
    ODKURZANIE("Odkurzanie"),
    MOPOWANIE("Mopowanie"),
    LAZIENKA("Mycie lazienki");

        private final String category;

        Category(String category) {
            this.category = category;
        }

        public String getCategory() {
            return category;
        }
    }

    public enum Period{
        CODZIENNIE("Codziennie"),
        TYGODNIOWO("Tygodniowo"),
        MIESIECZNIE("Miesiecznie");

        private final String period;

        Period(String period) {
            this.period = period;
        }

        public String getPeriod() {
            return period;
        }
    }
    public enum Notification{
        MAIL("Mail"),
        SMS("SMS-nieaktywne");

        private final String notification;

        Notification(String notification) {
            this.notification = notification;
        }

        public String getNotification() {
            return notification;
        }
    }

   // public createTask(Category category, Period period, Notification notification){

        //String CategoryValue = Category.getCategory();

  //  }


}
