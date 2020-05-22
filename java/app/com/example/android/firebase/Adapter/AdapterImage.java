//package app.com.example.android.firebase.Adapter;
//
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.support.v4.app.Fragment;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import java.util.ArrayList;
//
//import app.com.example.android.firebase.R;
//
///**
// * Created by RITIKA SRIVASTAVA on 8/14/2017.
// */
//
//public class AdapterImage extends RecyclerView.Adapter<AdapterImage.MyHolder>{
//    private Context context;
//    private Fragment frag;
//    private ArrayList<Bitmap> arraylist;
//    public AdapterImage(Fragment frag, Context context,ArrayList<Bitmap> arraylist)
//    {
//        this.arraylist=arraylist;
//        this.context=context;
//        this.frag=frag;
//
//    }
//
//
//    @Override
//    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v= LayoutInflater.from(context).inflate(R.layout.list_image_cultural,parent,false);
////        RecyclerView.ViewHolder viewHolder = null;
////        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
////                View fragView = inflater.inflate(R.layout.list_image_cultural, parent, false);
//        return new MyHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(AdapterImage.MyHolder holder, int position) {
//        holder.image.setImageBitmap(arraylist.get(position));
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return arraylist.size();
//    }
//    public  class MyHolder extends RecyclerView.ViewHolder
//    {
//        ImageView image;
//        public  MyHolder(View itemView)
//        {
//            super(itemView);
//            image=(ImageView)itemView.findViewById(R.id.imageview);
//        }
//    }
//
//
//}
