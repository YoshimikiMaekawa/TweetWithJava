import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

class GetTimeLine{
  public static void main(String[] args){
    /*インスタンスの取得*/
    Twitter twitter=new TwitterFactory().getInstance();

    /*タイムラインの取得のオプションを設定*/
    Paging page=new Paging();
    /*取得数の設定　上限は200*/
    page.setCount(50);
    /*タイムラインの取得　オプションを適用するにはPagingを引数にする*/
    List<Status> statuses=twitter.gettHomeTimeline(page);

    /*拡張for文で書き出してます*/
    for(Status status:statuses){
      /*getNameはアカウント名　getScreenNameはid　getTextは本文*/
      System.out.println(status.getUser().getName()+"(@"+status.getUser().getScreenName()+")\n"+status.getText()+"\n");
    }
  }
}

