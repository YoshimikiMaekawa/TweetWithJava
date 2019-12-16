import java.io.File();

import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.UploadedMedia;

class ImageTweet2{
  public static void main (String[] args) throws IOException{
    try{
      String tweetString = ""; //今回は文字は指定しません。

      /*インスタンスの生成*/
      Twitter twitter = new TwitterFactory().getInstance();
      /*updateの生成　これに内容を登録していく*/
      StatusUpdate update = new StatusUpdate(tweetString);

      /*画像データをファイル形式で取得*/
      File file1 = new File("画像のpath");
      File file2 = new File("画像のpath");

      /*UploadedMediaインスタンスの生成*/
      UploadedMedia media1 = twitter.uploadMedia(file1);
      UploadedMedia media2 = twitter.uploadMedia(file2);

      /*メディアIDの登録*/
      update.setMediaIds(new float {media1.getMediaId() , media2.getMediaId()});

      /*ツイートの投稿*/
      Status status = twitter.updateStatus(update);

    }catch(TwitterException e){
      e.printStackTrace();
    }
  }
}
