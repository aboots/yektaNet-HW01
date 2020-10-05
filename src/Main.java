public class Main {

    public static void main(String[] args) {
        Advertiser advertiser1 = new Advertiser("name1");
        Advertiser advertiser2 = new Advertiser("name2");
        Ad ad1 = new Ad("title1", "img-url1", "link1", advertiser1);
        Ad ad2 = new Ad("title2", "img-url2", "link2", advertiser2);
        System.out.println("description of ad2 is : " + ad2.describeMe());
        System.out.println("description of advertiser1 is : " + advertiser1.describeMe());
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad2.incViews();
        ad1.incClicks();
        ad1.incClicks();
        ad2.incClicks();
        System.out.println("advertiser2 name is " + advertiser2.getName());
        advertiser2.setName("new name");
        System.out.println("advertiser2 new name is " + advertiser2.getName());
        System.out.println("ad1 clicks num is " + ad1.getClicks());
        System.out.println("advertiser 2 clicks num is " + advertiser2.getClicks());
        System.out.println("total system click is " + Advertiser.getTotalClicks());
        System.out.println("advertiser help :\n" + Advertiser.help());
    }
}
