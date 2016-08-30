package a16sapi.aidle.minyuresume;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomeActivity extends Fragment implements View.OnClickListener {

    private ImageView phone,email,linkedIn;
    final private String phoneNumber = "+821099170524";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        phone = (ImageView) view.findViewById(R.id.phone2);
        phone.setOnClickListener(this);

        email = (ImageView) view.findViewById(R.id.email2);
        email.setOnClickListener(this);

        linkedIn = (ImageView) view.findViewById(R.id.linkedin2);
        linkedIn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.phone2:
                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_DIAL);
                intent1.setData(Uri.fromParts("tel", phoneNumber, null));
                startActivity(intent1);
                break;

            case R.id.email2:
                Intent intent2 = new Intent();
                intent2.setAction(Intent.ACTION_VIEW);
                intent2.setData(Uri.fromParts("mailto","iam.minhhh@gmail.com",null));
                startActivity(intent2);
                break;

            case R.id.linkedin2:
                Intent intent3 = new Intent();
                intent3.setAction(Intent.ACTION_VIEW);
                intent3.addCategory(Intent.CATEGORY_BROWSABLE);
                intent3.setData(Uri.parse("http://www.linkedin.com/in/min-yu"));
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}