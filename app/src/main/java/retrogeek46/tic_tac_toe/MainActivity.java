package retrogeek46.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView oneP = (TextView) findViewById(R.id.oneP);

        assert oneP != null;
        oneP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , regular.class);
                startActivity(intent);
            }
        });

        TextView twoP = (TextView) findViewById(R.id.twoP);

        assert twoP != null;
        twoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regular2 = new Intent(MainActivity.this, regular2.class);
                startActivity(regular2);
            }
        });


    }


}
