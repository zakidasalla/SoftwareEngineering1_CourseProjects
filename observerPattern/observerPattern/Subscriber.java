package observerPattern;

public class Subscriber implements ObsSubscriber {

    public String subName;

    public String getSubscriberName() {
        return subName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subName = subscriberName;
    }

    @Override
    public void updateNews(NewsAgency newsAgency) {

    }
}