public class PhoneNumber {
    private int countryCode;
    private String phoneNumber;

    // constructor takes a single string as a phone number
    public PhoneNumber(String phoneNumber) {
        // if phone number length is more than 10 extract the country code
        if (phoneNumber.length() > 10) {
            this.countryCode = Integer.parseInt(phoneNumber
                    .substring(0, phoneNumber.length() - 10)); // set country code
            this.phoneNumber = phoneNumber.substring
                    (phoneNumber.length() - 10); // set main part of phone number
        } else {
            // if length is 10 or less (default) country code is 1
            this.countryCode = 1;
            this.phoneNumber = phoneNumber;
        }
    }

    // constructor takes both a country code and a phone number
    public PhoneNumber(int countryCode, String phoneNumber) {
        this.countryCode = countryCode; // set country code
        this.phoneNumber = phoneNumber; // set main part of phone number
    }

    // converts the phone number details to a string for display
    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
