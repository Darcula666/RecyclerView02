package net.gfdz.com.recyclerview02;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/11/20.
 */
class MyAdapter extends RecyclerView.Adapter {
    private CellData[] data=new CellData[]{new CellData("极客学院","It职业培训"),new CellData("新闻","新闻镇好")};
    class ViewHolder extends RecyclerView.ViewHolder {
        private View root;
        private TextView tvTitle, tvContent;

        public ViewHolder(View root) {
            super(root);
            tvTitle= (TextView) root.findViewById(R.id.tvTitle);
            tvContent= (TextView) root.findViewById(R.id.tvContent);
        }

        public TextView getTvContent() {
            return tvContent;
        }


        public TextView getTvTitle() {
            return tvTitle;
        }


    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder vh= (ViewHolder) holder;
        CellData cellData=data[position];
        vh.getTvTitle().setText(cellData.title);
        vh.getTvContent().setText(cellData.content);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
