public class Advertiser extends BaseAdvertising {
    private static int totalSystemClicks = 0;
    private String name;

    public Advertiser(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotalClicks() {
        return totalSystemClicks;
    }

    public static String help() {
        return "this class has name,clicks,id,views\n"
                + "and it has setter/getter methods" +
                "and it extends BaseAdvertising class";
    }

    @Override
    public String describeMe() {
        return "this class is made for advertisers!";
    }

    @Override
    public void incClicks() {
        super.incClicks();
        totalSystemClicks += 1;
    }
}
