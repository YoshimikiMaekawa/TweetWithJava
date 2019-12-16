import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

class GetTimeLine{
  public static void main(String[] args){
    /*�C���X�^���X�̎擾*/
    Twitter twitter=new TwitterFactory().getInstance();

    /*�^�C�����C���̎擾�̃I�v�V������ݒ�*/
    Paging page=new Paging();
    /*�擾���̐ݒ�@�����200*/
    page.setCount(50);
    /*�^�C�����C���̎擾�@�I�v�V������K�p����ɂ�Paging�������ɂ���*/
    List<Status> statuses=twitter.gettHomeTimeline(page);

    /*�g��for���ŏ����o���Ă܂�*/
    for(Status status:statuses){
      /*getName�̓A�J�E���g���@getScreenName��id�@getText�͖{��*/
      System.out.println(status.getUser().getName()+"(@"+status.getUser().getScreenName()+")\n"+status.getText()+"\n");
    }
  }
}

