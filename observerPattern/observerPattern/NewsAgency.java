package observerPattern;

import java.util.*;

public class NewsAgency implements SubNewsAgency {

    public String publishArticle;
    public List<Subscriber> subscriberList = new ArrayList<>();

    public void setPublishArticle(String publishNews) {
        this.publishArticle = publishNews;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscriber() {
        String output = new String();
        for (Subscriber subscriber : subscriberList) {
            output += "There's latest news " + subscriber.getSubscriberName() + "!!\n";
            output += "BREAKING NEWS: " + publishArticle + "\n\n";
        }
        return output;
    }
}
