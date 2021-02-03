package com.dp2k.mybutton2;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity  {

    int min = 1;
    int max = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        final int RandomNumber1 = r.nextInt(max-min+1)+min;
        final int RandomNumber2 = r.nextInt(max-min+1)+min;

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/EraserDust.ttf");

        final TextView TextView0 = (TextView)findViewById(R.id.number1);
        TextView0.setTypeface(typeface);
        TextView0.setText(""+RandomNumber1);
        final TextView TextView1 = (TextView)findViewById(R.id.number2);
        TextView1.setTypeface(typeface);
        TextView1.setText(""+RandomNumber2);

        final int Total=RandomNumber1+RandomNumber2;
        int TotalWrong0=Total+2;
        int TotalWrong1=Total+4;

        List<Integer>  objects = new ArrayList<Integer>();
        objects.add(Total);
        objects.add(TotalWrong0);
        objects.add(TotalWrong1);
        Collections.shuffle(objects);
        List<Button> buttons = new ArrayList<Button>();
        buttons.add((Button)findViewById(R.id.btn0));
        buttons.add((Button)findViewById(R.id.btn1));
        buttons.add((Button)findViewById(R.id.btn2));

        final Button Play0 = (Button)findViewById(R.id.playbutton);

        final Button Button0 = (Button)findViewById(R.id.btn0);

        Button0.setTypeface(typeface);

        final Button Button1 = (Button)findViewById(R.id.btn1);
        Button1.setTypeface(typeface);

        final Button Button2 = (Button)findViewById(R.id.btn2);
        Button2.setTypeface(typeface);

        final TextView TextView2 = (TextView)findViewById(R.id.resultnum);
        TextView2.setTypeface(typeface);


        for (int i = 0; i < objects.size(); i++) {
            buttons.get(i).setText(objects.get(i).toString());
        }

        Button0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int test1 = Integer.parseInt(Button0.getText().toString());
                if (test1 == Total)
                {
                   TextView2.setText("Right");
                    CountDownTimer timer = new CountDownTimer(2000, 2000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                        }

                        @Override
                        public void onFinish() {
                            TextView2.setText(""); //(or GONE)

                        }
                    }.start();
                    Play0.postDelayed(new Runnable() {  //delay button
                        public void run() {
                            Play0.performClick();
                            //any other associated action
                        }
                    }, 1000);  // .8secs delay time
                }
                else if (test1!=Total)
                {
                    TextView2.setText("Wrong");
                    CountDownTimer timer = new CountDownTimer(2000, 2000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                        }

                        @Override
                        public void onFinish() {
                            TextView2.setText(""); //(or GONE)
                        }
                    }.start();

                }

            }
        });

        Button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int test1 = Integer.parseInt(Button1.getText().toString());
                if (test1 == Total)
                {
                    TextView2.setText("Right");
                    CountDownTimer timer = new CountDownTimer(2000, 2000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                        }

                        @Override
                        public void onFinish() {
                            TextView2.setText(""); //(or GONE)

                        }
                    }.start();

                    Play0.postDelayed(new Runnable() {  //delay button
                        public void run() {
                            Play0.performClick();
                            //any other associated action
                        }
                    }, 1000);  // .8secs delay time
                }
                else if (test1!=Total)
                {
                    TextView2.setText("Wrong");
                    CountDownTimer timer = new CountDownTimer(2000, 2000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                        }

                        @Override
                        public void onFinish() {
                            TextView2.setText(""); //(or GONE)
                        }
                    }.start();

                }

            }
        });

        Button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int test1 = Integer.parseInt(Button2.getText().toString());
                if (test1 == Total)
                {
                    TextView2.setText("Right");
                    CountDownTimer timer = new CountDownTimer(2000, 2000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                        }

                        @Override
                        public void onFinish() {
                            TextView2.setText(""); //(or GONE)

                        }
                    }.start();
                    Play0.postDelayed(new Runnable() {  //delay button
                        public void run() {
                            Play0.performClick();
                            //any other associated action
                        }
                    }, 1000);  // .8secs delay time
                }
                else if (test1!=Total)
                {
                    TextView2.setText("Wrong");
                    CountDownTimer timer = new CountDownTimer(2000, 2000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                        }

                        @Override
                        public void onFinish() {
                            TextView2.setText(""); //(or GONE)
                        }
                    }.start();
                }

            }
        });
        Play0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Random r = new Random();
                final int RandomNumber1 = r.nextInt(max-min+1)+min;
                final int RandomNumber2 = r.nextInt(max-min+1)+min;

                Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/EraserDust.ttf");

                final TextView TextView0 = (TextView)findViewById(R.id.number1);
                TextView0.setTypeface(typeface);
                TextView0.setText(""+RandomNumber1);
                final TextView TextView1 = (TextView)findViewById(R.id.number2);
                TextView1.setTypeface(typeface);
                TextView1.setText(""+RandomNumber2);

                final int Total=RandomNumber1+RandomNumber2;
                int TotalWrong0=Total+2;
                int TotalWrong1=Total+4;

                List<Integer>  objects = new ArrayList<Integer>();
                objects.add(Total);
                objects.add(TotalWrong0);
                objects.add(TotalWrong1);
                Collections.shuffle(objects);
                List<Button> buttons = new ArrayList<Button>();
                buttons.add((Button)findViewById(R.id.btn0));
                buttons.add((Button)findViewById(R.id.btn1));
                buttons.add((Button)findViewById(R.id.btn2));

                final Button Play0 = (Button)findViewById(R.id.playbutton);

                final Button Button0 = (Button)findViewById(R.id.btn0);

                Button0.setTypeface(typeface);

                final Button Button1 = (Button)findViewById(R.id.btn1);
                Button1.setTypeface(typeface);

                final Button Button2 = (Button)findViewById(R.id.btn2);
                Button2.setTypeface(typeface);

                final TextView TextView2 = (TextView)findViewById(R.id.resultnum);
                TextView2.setTypeface(typeface);


                for (int i = 0; i < objects.size(); i++) {
                    buttons.get(i).setText(objects.get(i).toString());
                }

                Button0.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        int test1 = Integer.parseInt(Button0.getText().toString());
                        if (test1 == Total)
                        {
                            TextView2.setText("Right");
                            CountDownTimer timer = new CountDownTimer(2000, 2000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                }

                                @Override
                                public void onFinish() {
                                    TextView2.setText(""); //(or GONE)
                                }
                            }.start();
                            Play0.postDelayed(new Runnable() {  //delay button
                                public void run() {
                                    Play0.performClick();
                                    //any other associated action
                                }
                            }, 1000);  // .8secs delay time
                        }
                        else if (test1!=Total)
                        {
                            TextView2.setText("Wrong");
                            CountDownTimer timer = new CountDownTimer(2000, 2000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                }

                                @Override
                                public void onFinish() {
                                    TextView2.setText(""); //(or GONE)
                                }
                            }.start();

                        }

                    }
                });

                Button1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        int test1 = Integer.parseInt(Button1.getText().toString());
                        if (test1 == Total)
                        {
                            TextView2.setText("Right");
                            CountDownTimer timer = new CountDownTimer(2000, 2000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                }

                                @Override
                                public void onFinish() {
                                    TextView2.setText(""); //(or GONE)

                                }
                            }.start();
                            Play0.postDelayed(new Runnable() {  //delay button
                                public void run() {
                                    Play0.performClick();
                                    //any other associated action
                                }
                            }, 1000);  // .8secs delay time

                        }
                        else if (test1!=Total)
                        {
                            TextView2.setText("Wrong");
                            CountDownTimer timer = new CountDownTimer(2000, 2000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                }

                                @Override
                                public void onFinish() {
                                    TextView2.setText(""); //(or GONE)
                                }
                            }.start();

                        }

                    }
                });

                Button2.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        int test1 = Integer.parseInt(Button2.getText().toString());
                        if (test1 == Total)
                        {
                            TextView2.setText("Right");
                            CountDownTimer timer = new CountDownTimer(2000, 2000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                }

                                @Override
                                public void onFinish() {
                                    TextView2.setText(""); //(or GONE)

                                }
                            }.start();
                            Play0.postDelayed(new Runnable() {  //delay button
                                public void run() {
                                    Play0.performClick();
                                    //any other associated action
                                }
                            }, 1000);  // .8secs delay time
                        }
                        else if (test1!=Total)
                        {
                            TextView2.setText("Wrong");
                            CountDownTimer timer = new CountDownTimer(2000, 2000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                }

                                @Override
                                public void onFinish() {
                                    TextView2.setText(""); //(or GONE)
                                }
                            }.start();
                        }

                    }
                });
            }
        });


    }
}
