package retrogeek46.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class regular extends AppCompatActivity {

    TextView [] t = new TextView[9] ;
    int cnt[]=new int[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular);

        cnt[0]=5;cnt[1]=5;cnt[2]=5;cnt[3]=5;cnt[4]=5;cnt[5]=5;cnt[6]=5;cnt[7]=5;cnt[8]=5;//setting counter, 5 (unoccupied), 1 (X)
        // or 0(O)
        t[0]= (TextView) findViewById(R.id.tv1);
        t[1]= (TextView) findViewById(R.id.tv2);
        t[2]= (TextView) findViewById(R.id.tv3);
        t[3]= (TextView) findViewById(R.id.tv4);
        t[4]= (TextView) findViewById(R.id.tv5);
        t[5]= (TextView) findViewById(R.id.tv6);
        t[6]= (TextView) findViewById(R.id.tv7);
        t[7]= (TextView) findViewById(R.id.tv8);
        t[8]= (TextView) findViewById(R.id.tv9);


        t[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                putText(0);
            }
        });

        t[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                putText(1);
            }
        });
        t[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                putText(2);
            }
        });
        t[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                putText(3);
            }
        });
        t[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                putText(4);
            }
        });

        t[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                putText(5);
            }
        });
        t[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                putText(6);
            }
        });
        t[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                putText(7);
            }
        });
        t[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                putText(8);
            }
        });

    }

//    private void launchActivitymain() {
//        Intent intent = new Intent(this,MainActivity.class);
//        startActivity(intent);
//    }


    private void putText (int index) {
        if (check()==0) {
            if (cnt[index]==1 || cnt[index]==0);
            else {t[index].setText("X");cnt[index]=1;ai();}
        }

    }

    public void ai(){
        int flag=0;                   //flag denotes ai has already moved for this turn
        //showMessage("Ai","Ai");
        if(check()==1){               //check = 1 means game is over
            return;
        }
        else if (check()==0) {
            while(flag==0) {
                Random rand = new Random();
                int n = rand.nextInt(9);
                Log.d("mtag", Integer.toString(n));
                if (cnt[n] == 5) {
                    flag = 1;
                    t[n].setText("O");
                    cnt[n] = 0;
                }
//                for(int i = 0; i < 9 ; i++){
//                    if (n==i) {
//
//                    }
//                }
                check();
            }
        }
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
    }
}
