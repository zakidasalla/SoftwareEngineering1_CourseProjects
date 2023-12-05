package observerPattern;

public class BBZNews {
    public static void main (String args[]){

        NewsAgency bbz = new NewsAgency();
        Subscriber zaki = new Subscriber();
        zaki.setSubscriberName("Zaki");
        Subscriber althea = new Subscriber();
        althea.setSubscriberName("Althea");
        Subscriber jazrel = new Subscriber();
        jazrel.setSubscriberName("Jazrel");

        printHeader();

        bbz.subscribe(zaki);

        bbz.setPublishArticle("Ray-Ban x Meta's next-gen smartglasses: shades with built-in camera, open-ear audio, and seamless social sharing.");
        System.out.println(bbz.notifySubscriber());

        bbz.subscribe(althea);
        bbz.subscribe(jazrel);

        bbz.setPublishArticle("Meta is pulling the plug on cross-messaging between Instagram and Facebook in mid-December.");
        System.out.println(bbz.notifySubscriber());

        bbz.unsubscribe(zaki);

        bbz.setPublishArticle("Amazon hitches a ride with SpaceX rival as it books launches for its Kuiper internet constellation.");
        System.out.println(bbz.notifySubscriber());

        printFooter();

    }
    private static void printHeader() {
        System.out.println("[]--  BBZ NEWS  --[]");
        System.out.println("[]--  Unbiased truth, delivered daily.  --[]\n");
    }

    private static void printFooter() {
        System.out.println("\n[]---------Program Exit---------[]");
        System.out.println("[]--by Emmanuel Zaki Dasalla--[]");
        System.out.println("[]----------3-BSCS-2----------[]");
    }
}


