package retrogeek46.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class regular extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    int cnt[]=new int[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular);

        cnt[0]=5;cnt[1]=5;cnt[2]=5;cnt[3]=5;cnt[4]=5;cnt[5]=5;cnt[6]=5;cnt[7]=5;cnt[8]=5;//setting counter, 5 (unoccupied), 1 (X)
                                                                                         // or 0(O)
        t1= (TextView) findViewById(R.id.tv1);
        t2= (TextView) findViewById(R.id.tv2);
        t3= (TextView) findViewById(R.id.tv3);
        t4= (TextView) findViewById(R.id.tv4);
        t5= (TextView) findViewById(R.id.tv5);
        t6= (TextView) findViewById(R.id.tv6);
        t7= (TextView) findViewById(R.id.tv7);
        t8= (TextView) findViewById(R.id.tv8);
        t9= (TextView) findViewById(R.id.tv9);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt[0]==1 || cnt[0]==0)ai();
                else {t1.setText("X");cnt[0]=1;ai();}
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt[1]==1 || cnt[1]==0)ai();
                else {t2.setText("X");cnt[1]=1;ai();}
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt[2]==1 || cnt[2]==0)ai();
                else {t3.setText("X");cnt[2]=1;ai();}
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt[3]==1 || cnt[3]==0)ai();
                else {t4.setText("X");cnt[3]=1;ai();}
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt[4]==1 || cnt[4]==0)ai();
                else {t5.setText("X");cnt[4]=1;ai();}
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt[5]==1 || cnt[5]==0)ai();
                else {t6.setText("X");cnt[5]=1;ai();}
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt[6]==1 || cnt[6]==0)ai();
                else {t7.setText("X");cnt[6]=1;ai();}
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt[7]==1 || cnt[7]==0)ai();
                else {t8.setText("X");cnt[7]=1;ai();}
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cnt[8]==1 || cnt[8]==0)ai();
                else {t9.setText("X");cnt[8]=1;ai();}
            }
        });

    }

    private void launchActivitymain() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void ai(){

        int flag=0;

        if(check()==1){

        }

        else if (check()==0) {
            while(flag==0) {
                Random rand = new Random();
                int n = rand.nextInt(9);
                if (cnt[n] == 5) {
                    flag = 1;
                    if (n==0) {
                        t1.setText("O");
                        cnt[0] = 0;
                    }
                    if (n==1) {
                        t2.setText("O");
                        cnt[1] = 0;
                    }
                    if (n==2) {
                        t3.setText("O");
                        cnt[2] = 0;
                    }
                    if (n==3) {
                        t4.setText("O");
                        cnt[3] = 0;
                    }
                    if (n==4) {
                        t5.setText("O");
                        cnt[4] = 0;
                    }
                    if (n==5) {
                        t6.setText("O");
                        cnt[5] = 0;
                    }
                    if (n==6) {
                        t7.setText("O");
                        cnt[6] = 0;
                    }
                    if (n==7) {
                        t8.setText("O");
                        cnt[7] = 0;
                    }
                    if (n==8) {
                        t9.setText("O");
                        cnt[8] = 0;
                    }
                }
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

