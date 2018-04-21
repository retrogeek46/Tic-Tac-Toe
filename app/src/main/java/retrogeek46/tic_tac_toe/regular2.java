package retrogeek46.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by samridhi on 31-07-2017.
 */

public class regular2 extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    int cnt[]=new int[9];
    String a;
    private boolean turn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular2);

        cnt[0]=5;cnt[1]=5;cnt[2]=5;cnt[3]=5;cnt[4]=5;cnt[5]=5;cnt[6]=5;cnt[7]=5;cnt[8]=5;
        t1= (TextView) findViewById(R.id.tv1);
        t2= (TextView) findViewById(R.id.tv2);
        t3= (TextView) findViewById(R.id.tv3);
        t4= (TextView) findViewById(R.id.tv4);
        t5= (TextView) findViewById(R.id.tv5);
        t6= (TextView) findViewById(R.id.tv6);
        t7= (TextView) findViewById(R.id.tv7);
        t8= (TextView) findViewById(R.id.tv8);
        t9= (TextView) findViewById(R.id.tv9);

        Button player1=(Button) findViewById(R.id.player1);
        Button player2=(Button) findViewById(R.id.player2);
        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="X";
            }
        });
        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="O";
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(a);
                cnt[0]=1;
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(a);
                cnt[1]=1;
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t3.setText(a);
                cnt[2]=1;
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t4.setText(a);
                cnt[3]=1;
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t5.setText(a);
                cnt[4]=1;
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t6.setText(a);
                cnt[5]=1;
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t7.setText(a);
                cnt[6]=1;
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t8.setText(a);
                cnt[7]=1;
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t9.setText(a);
                cnt[8]=1;
            }
        });
    }

    private void launchActivitymain() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public int check(){
        if (cnt[0]==1 && cnt[3]==1 && cnt[6]==1) {showMessage("You Won","Good work");return 1;}
        if (cnt[0]==1 && cnt[1]==1 && cnt[2]==1) {showMessage("You Won","Good work");return 1;}
        if (cnt[0]==1 && cnt[4]==1 && cnt[8]==1) {showMessage("You Won","Good work");return 1;}
        if (cnt[3]==1 && cnt[4]==1 && cnt[5]==1) {showMessage("You Won","Good work");return 1;}
        if (cnt[6]==1 && cnt[7]==1 && cnt[8]==1) {showMessage("You Won","Good work");return 1;}
        if (cnt[1]==1 && cnt[4]==1 && cnt[7]==1) {showMessage("You Won","Good work");return 1;}
        if (cnt[2]==1 && cnt[5]==1 && cnt[8]==1) {showMessage("You Won","Good work");return 1;}
        if (cnt[2]==1 && cnt[4]==1 && cnt[6]==1) {showMessage("You Won","Good work");return 1;}

        if (cnt[0]==0 && cnt[3]==0 && cnt[6]==0) {showMessage("You Lost","Better Luck Next Time");return 1;}
        if (cnt[0]==0 && cnt[1]==0 && cnt[2]==0) {showMessage("You Lost","Better Luck Next Time");return 1;}
        if (cnt[0]==0 && cnt[4]==0 && cnt[8]==0) {showMessage("You Lost","Better Luck Next Time");return 1;}
        if (cnt[3]==0 && cnt[4]==0 && cnt[5]==0) {showMessage("You Lost","Better Luck Next Time");return 1;}
        if (cnt[6]==0 && cnt[7]==0 && cnt[8]==0) {showMessage("You Lost","Better Luck Next Time");return 1;}
        if (cnt[1]==0 && cnt[4]==0 && cnt[7]==0) {showMessage("You Lost","Better Luck Next Time");return 1;}
        if (cnt[2]==0 && cnt[5]==0 && cnt[8]==0) {showMessage("You Lost","Better Luck Next Time");return 1;}
        if (cnt[2]==0 && cnt[4]==0 && cnt[6]==0) {showMessage("You Lost","Better Luck Next Time");return 1;}
        return 0;}

    public void showMessage(String Title, String Message){
        AlertDialog.Builder adbuilder=new AlertDialog.Builder(this);
        adbuilder.setCancelable(true);
        adbuilder.setTitle(Title);
        adbuilder.setMessage(Message);
        adbuilder.show();
        Toast.makeText(this, "Congratulations", Toast.LENGTH_SHORT).show();
    }
}


