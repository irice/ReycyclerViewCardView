package katey2658.com.my.reycyclerviewcardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 11456 on 2016/9/22.
 */
public class NewsActivity  extends AppCompatActivity{
    //图片标题内容
    private ImageView newsPhoto;
    private TextView newsTitle;
    private TextView newsDesc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_news);

        initView();

        Intent intent=getIntent();

        News item= (News) intent.getSerializableExtra("News");
        newsPhoto.setImageResource(item.getPhotoId());
        newsTitle.setText(item.getTitle());
        newsDesc.setText(item.getDesc());
    }
//做一些和xml视图关联,初始化
    private void initView() {
        newsPhoto= (ImageView) findViewById(R.id.news_info_photo);
        newsTitle= (TextView) findViewById(R.id.news_Info_title);
        newsDesc= (TextView) findViewById(R.id.news_info_desc);
    }
}
