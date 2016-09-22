package katey2658.com.my.reycyclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<News>newsList;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        //对recycler设置布局管理器，其他还有GridLayoutManager网格布局，StaggeredLayoutManager瀑布布局
        LinearLayoutManager linerLayoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linerLayoutManager);

        initDate();

        recyclerView.setHasFixedSize(true);

        adapter=new RecyclerViewAdapter(newsList,MainActivity.this);
        recyclerView.setAdapter(adapter);

    }
   //做一些初始化数据的事情
    private void initDate() {
        newsList=new ArrayList<>();

        //添加新闻
        newsList.add(new News(getString(R.string.news_one_title),getString(R.string.news_one_desc),R.mipmap.girls8));
        newsList.add(new News(getString(R.string.news_two_title),getString(R.string.news_two_desc),R.mipmap.girls7));
        newsList.add(new News(getString(R.string.news_three_title),getString(R.string.news_three_desc),R.mipmap.girls6));
        newsList.add(new News(getString(R.string.news_four_title),getString(R.string.news_four_desc),R.mipmap.girls5));

    }

    //做一些视图的初始化工作
    private void initView() {
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
    }
}
