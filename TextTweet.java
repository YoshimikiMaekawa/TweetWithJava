import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

class TextTweet{
  public static void main (String[] args) throws IOException{
    try{
      String tweetString = "Hello World !"; //ツイートしたい文字列

      /*インスタンスの生成*/
      Twitter twitter = new TwitterFactory().getInstance();

      /*updateの生成　これに内容を登録していく*/
      /*引数でtwitterStringを登録している*/
      StatusUpdate update = new StatusUpdate(tweetString);

      /*ツイートの投稿*/
      Status status = twitter.updateStatus(update);

    }catch(TwitterException e){
      e.printStackTrace();
    }
  }
}
