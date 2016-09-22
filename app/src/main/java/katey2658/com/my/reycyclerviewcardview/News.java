package katey2658.com.my.reycyclerviewcardview;

import java.io.Serializable;

/**
 * Created by 11456 on 2016/9/22.
 */

public class News implements Serializable {

    //新闻标题，内容，图片
    private String title;
    private String desc;
    private int photoId;

    public  News(String title,String desc,int photoId ){
        this.title=title;
        this.desc=desc;
        this.photoId=photoId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getDesc() {
        return desc;
    }

    public String getTitle() {
        return title;
    }
}
