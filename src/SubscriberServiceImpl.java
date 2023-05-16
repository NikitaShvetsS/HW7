public class SubscriberServiceImpl implements SubscriberService{

    private Subscriber[] subscribers;

    public SubscriberServiceImpl(Subscriber[] subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public Subscriber[] getSubscribersWithExceededCityCallDuration(int duration) {
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCityCallDuration() > duration) {
                count++;
            }
        }

        Subscriber[] result = new Subscriber[count];
        int index = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCityCallDuration() > duration) {
                result[index] = subscriber;
                index++;
            }
        }

        return result;
    }

    @Override
    public Subscriber[] getSubscribersWithIntercityCalls() {
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getIntercityCallDuration() > 0) {
                count++;
            }
        }

        Subscriber[] result = new Subscriber[count];
        int index = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getIntercityCallDuration() > 0) {
                result[index] = subscriber;
                index++;
            }
        }

        return result;
    }

    @Override
    public Subscriber[] getSubscribersByLastName(String lastNameStartsWith) {
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getLastName().startsWith(lastNameStartsWith)) {
                count++;
            }
        }

        Subscriber[] result = new Subscriber[count];
        int index = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getLastName().startsWith(lastNameStartsWith)) {
                result[index] = subscriber;
                index++;
            }
        }

        return result;
    }

    @Override
    public int getTotalInternetTrafficByCity(String city) {
        int totalTraffic = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCity().equals(city)) {
                totalTraffic += subscriber.getInternetTraffic();
            }
        }
        return totalTraffic;

    }

    @Override
    public int getNegativeBalanceSubscribersCount() {
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                count++;
            }
        }
        return count;
    }

}
