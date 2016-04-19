package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.onlyme.testproject.MainActivity;
import com.example.onlyme.testproject.R;

/**
 * Created by Onlyme on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        TextView testView = (TextView)mainActivity.findViewById(R.id.tv1);
        String tester = testView.getText().toString();
        assertEquals("Hello world!", tester);
    }

}

