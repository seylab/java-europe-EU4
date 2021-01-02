package a_review.week15;

public class PhoneObjects {
    public static void main(String[] args) {

        IPhone phone1 = new IPhone("11", 8.0, 1.999);
        Phone phone2 = new IPhone("8", 6.5, 1000);
        Object phone3 = new IPhone("5", 6.5, 500);
        AppleApp phone4 = new IPhone("7", 7.0, 1500);

        phone1.faceTiming(12312312);
        ((IPhone)phone2).faceTiming(123456785);
        ((IPhone)phone4).faceTiming(213546789);
        System.out.println();

        phone1.download();
        ((IPhone)phone2).download();
        ((AppleApp)phone2).download();
        phone4.download();
        System.out.println();

        phone1.calling(2314556);
        phone2.calling(2123564);
        ((Phone)phone3).calling(2565458);
        ((IPhone)phone3).calling(36598565);
        ((IPhone) phone4).calling(21154565);

        phone1.calling(3231);


    }
}
