package com.example.dellpc.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button9,button1,button2,button3,button4,button5,button6,button7,button8;
    private TextView txt;
    private int [][] table =new int[3][3] ;
    private int i;
    private  String chance="one";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        txt=(TextView)findViewById(R.id.txt);
        button9=(Button)findViewById(R.id.button9);
    }
    public void makemove(View v)
    {
        switch(v.getId())
        {
         case R.id.button1:

             if (chance.equalsIgnoreCase("one")) {
                        txt.setText("Player O Turn");
                     button1.setText("X");
                     table[0][0] = 1;
                     chance = "two";
                 } else if (chance.equalsIgnoreCase("two")) {
                 txt.setText("Player X Turn");
                     button1.setText("O");
                     table[0][0] = 2;
                     chance = "one";
                 }
                 checkResult();
                 break;

            case R.id.button2:
                if(chance.equals("one"))
                {
                    txt.setText("Player O Turn");
                    button2.setText("X");
                    table[0][1]=1;
                    chance="two";
                }
                else if(chance.equals("two"))
                {
                    txt.setText("Player X Turn");
                    button2.setText("O");
                    table[0][1]=2;
                    chance="one";
                }
                checkResult();
                break;
            case R.id.button3:
                if(chance.equals("one"))
                {
                    txt.setText("Player O Turn");
                    button3.setText("X");
                    table[0][2]=1;
                    chance="two";
                }
                else if(chance.equals("two"))
                {
                    txt.setText("Player X Turn");
                    button3.setText("O");
                    table[0][2]=2;
                    chance="one";
                }
                checkResult();
                break;
            case R.id.button4:
                if(chance.equals("one"))
                {
                    txt.setText("Player O Turn");
                    button4.setText("X");
                    table[1][0]=1;
                    chance="two";
                }
                else if(chance.equals("two"))
                {
                    txt.setText("Player X Turn");
                    button4.setText("O");
                    table[1][0]=2;
                    chance="one";
                }
                checkResult();
                break;
            case R.id.button5:
                if(chance.equals("one"))
                {
                    txt.setText("Player O Turn");
                    button5.setText("X");
                    table[1][1]=1;
                    chance="two";
                }
                else if(chance.equals("two"))
                {
                    txt.setText("Player X Turn");
                    button5.setText("O");
                    table[1][1]=2;
                    chance="one";
                }
                checkResult();
                break;
            case R.id.button6:
                if(chance.equals("one"))
                {
                    txt.setText("Player O Turn");
                    button6.setText("X");
                    table[1][2]=1;
                    chance="two";
                }
                else if(chance.equals("two"))
                {
                    txt.setText("Player X Turn");
                    button6.setText("O");
                    table[1][2]=2;
                    chance="one";
                }
                checkResult();
                break;
            case R.id.button7:
                if(chance.equals("one"))
                {
                    txt.setText("Player O Turn");
                    button7.setText("X");
                    table[2][0]=1;
                    chance="two";
                }
                else if(chance.equals("two"))
                {
                    txt.setText("Player X Turn");
                    button7.setText("O");
                    table[2][0]=2;
                    chance="one";
                }
                checkResult();
                break;
            case R.id.button8:
                if(chance.equals("one"))
                {
                    txt.setText("Player O Turn");
                    button8.setText("X");
                    table[2][1]=1;
                    chance="two";
                }
                else if(chance.equals("two"))
                {
                    txt.setText("Player X Turn");
                    button8.setText("O");
                    table[2][1]=2;
                    chance="one";
                }
                checkResult();
                break;
            case R.id.button9:
                if(chance.equals("one"))
                {
                    txt.setText("Player O Turn");
                    button9.setText("X");
                    table[2][2]=1;
                    chance="two";
                }
                else if(chance.equals("two"))
                {
                    txt.setText("Player X Turn");
                    button9.setText("O");
                    table[2][2]=2;
                    chance="one";
                }
                checkResult();
                break;
        }



    }
    public void checkResult()
    {
        for(i=0;i<3;i++)
        {
            if(table[i][0]==1 && table[i][1]==1&& table[i][2]==1)
            {
                Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                ClearXO();
            }
            if(table[i][0]==2 && table[i][1]==2&& table[i][2]==2)
            {
                Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
        ClearXO();


            }
        }
        for(i=0;i<3;i++)
        {
            if(table[0][i]==1&&table[1][i]==1&&table[2][i]==1) {
                Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
                ClearXO();
            }
            if(table[0][i]==2&&table[1][i]==2&&table[2][i]==2) {
                Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
                ClearXO();
            }
        }
        if(table[1][1]==1&&table[2][2]==1&&table[0][0]==1) {
            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();
            ClearXO();
        }
        if(table[1][1]==2&&table[2][2]==2&&table[0][0]==2) {
            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();
            ClearXO();
        }
    }
    public void ClearXO()
    {
        button1.setText(" ");
        button2.setText(" ");
        button3.setText(" ");
        button4.setText(" ");
        button5.setText(" ");
        button6.setText(" ");
        button7.setText(" ");
        button8.setText(" ");
        button9.setText(" ");
    }
}
