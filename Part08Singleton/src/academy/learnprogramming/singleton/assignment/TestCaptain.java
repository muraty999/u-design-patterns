package academy.learnprogramming.singleton.assignment;

public class TestCaptain {
    public static void main(String[] args) {
        System.out.println("Trying to make a captain for the our team.");
        Captain captain = Captain.getInstance();
        captain.setCaptainName("Yusuf Eymen");
        System.out.println("Captain name is: " + captain.getCaptainName());

        System.out.println("Trying to make another captain for the our team.");
        Captain anotherCaptain = Captain.getInstance();
        if (anotherCaptain.getCaptainName().equals("Yusuf Eymen")) {
            System.out.println("Captain is again: " + anotherCaptain.getCaptainName());
        }
        if (captain == anotherCaptain) {
            System.out.println("Instances are the same");
        }
    }
}

