public abstract class BaseAdvertising {
    private static int idCounter = 1;
    protected int id;
    protected int clicks;
    protected int views;

    public BaseAdvertising() {
        this.id = idCounter;
        idCounter += 1;
        this.views = 0;
        this.clicks = 0;
    }

    public int getClicks() {
        return clicks;
    }

    public int getViews() {
        return views;
    }

    public void incClicks() {
        this.clicks += 1;
    }

    public void incViews() {
        this.views += 1;
    }

    public abstract String describeMe();

}
