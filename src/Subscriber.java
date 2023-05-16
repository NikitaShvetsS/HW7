public class Subscriber {

    private String id;
    private String lastName;
    private String firstName;
    private String city;
    private String phoneNumber;
    private String contractNumber;
    private int balance;
    private int cityCallDuration;
    private int intercityCallDuration;
    private int internetTraffic;

    public Subscriber(String id, String lastName, String firstName, String city,
                      String phoneNumber, String contractNumber, int balance, int cityCallDuration,
                      int intercityCallDuration, int internetTraffic) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.cityCallDuration = cityCallDuration;
        this.intercityCallDuration = intercityCallDuration;
        this.internetTraffic = internetTraffic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCityCallDuration() {
        return cityCallDuration;
    }

    public void setCityCallDuration(int cityCallDuration) {
        this.cityCallDuration = cityCallDuration;
    }

    public int getIntercityCallDuration() {
        return intercityCallDuration;
    }

    public void setIntercityCallDuration(int intercityCallDuration) {
        this.intercityCallDuration = intercityCallDuration;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }


    @Override
    public String toString() {
        return "Subscriber Details:\n" +
                "ID: " + id +
                "\nLast Name: " + lastName +
                "\nFirst Name: " + firstName +
                "\nCity: " + city +
                "\nPhone Number: " + phoneNumber +
                "\nContract Number: " + contractNumber +
                "\nBalance: " + balance +
                "\nCity Call Duration: " + cityCallDuration + " min" +
                "\nIntercity Call Duration: " + intercityCallDuration + " min" +
                "\nInternet Traffic: " + internetTraffic + " GB";
    }

}
