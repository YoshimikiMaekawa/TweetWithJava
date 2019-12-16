import java.io.File();

import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

class ImageTweet1{
  public static void main (String[] args) throws IOException{
    try{
      String tweetString = ""; //今回は文字は指定しません。

      /*インスタンスの生成*/
      Twitter twitter = new TwitterFactory().getInstance();
      /*updateの生成　これに内容を登録していく*/
      StatusUpdate update = new StatusUpdate(tweetString);

      File file = new File("画像ファイルのpath");
      update.media(file);
      /*
      update.setMedia(file);
      */

      /*ツイートの投稿*/
      Status status = twitter.updateStatus(update);

    }catch(TwitterException e){
      e.printStackTrace();
    }
  }
}
