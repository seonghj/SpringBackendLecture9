package org.example.Head03_OOP.Example12;

public class DIPTest {
    public static void main(String[] args) {
       NotificationSender[] notificationSenders = {
               new EmailNotificationSender(),
               new SmsNotificationSender()
       };

        for (NotificationSender notificationSender : notificationSenders) {
            NotificationService notificationService = new NotificationService(notificationSender);
            notificationService.notify("Hello World");
        }
    }
}
