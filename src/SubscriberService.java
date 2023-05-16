public interface SubscriberService {

    Subscriber[] getSubscribersWithExceededCityCallDuration(int duration);
    Subscriber[] getSubscribersWithIntercityCalls();
    Subscriber[] getSubscribersByLastName(String lastNameStartsWith);
    int getTotalInternetTrafficByCity(String city);
    int getNegativeBalanceSubscribersCount();

}
