package bawei.listviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangql on 2016/11/2.
 */
public class MyAdapter extends BaseAdapter {
    private List<Data> list=new ArrayList<>();//当前展示的数据
    private List<Data> listAll;//全部数据 备注保持跟mainactivity保持一致i
    private Context context;
    private boolean isHide;
    public MyAdapter(List<Data> list,Context context,boolean isHide){
        this.list.addAll(listAll);
        this.context=context;
        this.isHide=isHide;
        listAll=list;
    }

    public void setHide(boolean isHide){
        this.isHide=isHide;

    }
    public void check(){
        list.clear();
        list.addAll(listAll);
        if(isHide){
            List<Data> listDel=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                //取出已选的数据 存储在listdel
                if(list.get(i).isCheck)
                    listDel.add(list.get(i));
            }
            for(Data data:listDel)//删除全部已选的数据
            list.remove(data);
        }
        super.notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
