public class Ad extends BaseAdvertising {
    private Advertiser advertiser;
    private String title;
    private String imgUrl;
    private String link;

    public Ad(String title, String imgUrl, String link, Advertiser advertiser) {
        super();
        this.advertiser = advertiser;
        this.title = title;
        this.imgUrl = imgUrl;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    @Override
    public void incClicks() {
        super.incClicks();
        this.advertiser.incClicks();
    }

    @Override
    public void incViews() {
        super.incViews();
        this.advertiser.incViews();
    }

    @Override
    public String describeMe() {
        return "This is class for Ad object";
    }
}
