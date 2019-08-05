package shubham.project.selfstudy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * CREATED BY SHUBHAM KISHORE
 * ON 05/08/2019
 *
 * **/

public class Contentdata extends Fragment {

    private ImageView ivlabel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.content_data, null);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        ivlabel = (ImageView) view.findViewById(R.id.offerimage);
            //setting offer label
        Picasso.get().load(R.drawable.phoneper).fit().into(ivlabel);


    }
}
