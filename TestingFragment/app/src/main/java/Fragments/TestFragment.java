package Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testingfragment.R;

/**
 * Created by victorlee95 on 6/18/2017.
 */

public class TestFragment extends Fragment {
    private TextView mTextView;
    private Button mButton;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancedState) {
        View v = inflater.inflate(R.layout.fragment_testfragment,container,false);
        mTextView = (TextView) v.findViewById(R.id.textView);
        mButton = (Button) v.findViewById(R.id.button);

        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"hey u clicked me ",Toast.LENGTH_SHORT).show();
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("yeah","yes u are clicking");
                Toast.makeText(getContext(),"hey uuuu clicked me ",Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }


}
