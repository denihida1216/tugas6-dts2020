package com.example.testdts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] dataAlphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", ""};
    int[] btnId = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12, R.id.btn13, R.id.btn14, R.id.btn15, R.id.btn16};
    Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOk();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_ulangi:
                setacakArray();
                break;

            case R.id.action_keluar:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setTombolAlphabet() {
        buttons = new Button[16];
        for (int i = 0; i < dataAlphabet.length; i++) {
            buttons[i] = findViewById(btnId[i]);
            buttons[i].setText(dataAlphabet[i]);
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    for (int i = 0; i < dataAlphabet.length; i++) {
                        if (view.getId() == btnId[i]) {
                            String get_btn_letter = buttons[i].getText().toString();
                            if (i == 0) {

                                if (buttons[i + 1].getText().toString().equals("")) {
                                    buttons[i + 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i + 4].getText().toString().equals("")) {
                                    buttons[i + 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                }
                            }

                            if (i == 1 || i == 2) {
                                if (buttons[i + 1].getText().toString().equals("")) {
                                    buttons[i + 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i + 4].getText().toString().equals("")) {
                                    buttons[i + 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i - 1].getText().toString().equals("")) {
                                    buttons[i - 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                }
                            }

                            if (i == 3) {
                                if (buttons[i - 1].getText().toString().equals("")) {
                                    buttons[i - 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i + 4].getText().toString().equals("")) {
                                    buttons[i + 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                }
                            }

                            if (i == 4 || i == 8) {
                                if (buttons[i + 1].getText().toString().equals("")) {
                                    buttons[i + 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i + 4].getText().toString().equals("")) {
                                    buttons[i + 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i - 4].getText().toString().equals("")) {
                                    buttons[i - 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                }
                            }

                            if (i == 5 || i == 6 || i == 9 || i == 10) {
                                if (buttons[i + 1].getText().toString().equals("")) {
                                    buttons[i + 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i + 4].getText().toString().equals("")) {
                                    buttons[i + 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i - 1].getText().toString().equals("")) {
                                    buttons[i - 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i - 4].getText().toString().equals("")) {
                                    buttons[i - 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                }
                            }

                            if (i == 7 || i == 11) {
                                if (buttons[i - 1].getText().toString().equals("")) {
                                    buttons[i - 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i + 4].getText().toString().equals("")) {
                                    buttons[i + 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i - 4].getText().toString().equals("")) {
                                    buttons[i - 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                }
                            }

                            if (i == 12) {
                                if (buttons[i + 1].getText().toString().equals("")) {
                                    buttons[i + 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i - 4].getText().toString().equals("")) {
                                    buttons[i - 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                }
                            }

                            if (i == 13 || i == 14) {
                                if (buttons[i + 1].getText().toString().equals("")) {
                                    buttons[i + 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i - 1].getText().toString().equals("")) {
                                    buttons[i - 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i - 4].getText().toString().equals("")) {
                                    buttons[i - 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                }
                            }

                            if (i == 15) {
                                if (buttons[i - 1].getText().toString().equals("")) {
                                    buttons[i - 1].setText(get_btn_letter);
                                    buttons[i].setText("");
                                } else if (buttons[i - 4].getText().toString().equals("")) {
                                    buttons[i - 4].setText(get_btn_letter);
                                    buttons[i].setText("");
                                }
                            }

                        }
                    }
                    checkBerhasil();
                }
            });
        }
    }

    private void checkBerhasil() {
        boolean btn1 = buttons[0].getText().toString().equals("A");
        boolean btn2 = buttons[1].getText().toString().equals("B");
        boolean btn3 = buttons[2].getText().toString().equals("C");
        boolean btn4 = buttons[3].getText().toString().equals("D");
        boolean btn5 = buttons[4].getText().toString().equals("E");
        boolean btn6 = buttons[5].getText().toString().equals("F");
        boolean btn7 = buttons[6].getText().toString().equals("G");
        boolean btn8 = buttons[7].getText().toString().equals("H");
        boolean btn9 = buttons[8].getText().toString().equals("I");
        boolean btn10 = buttons[9].getText().toString().equals("J");
        boolean btn11 = buttons[10].getText().toString().equals("K");
        boolean btn12 = buttons[11].getText().toString().equals("L");
        boolean btn13 = buttons[12].getText().toString().equals("M");
        boolean btn14 = buttons[13].getText().toString().equals("N");
        boolean btn15 = buttons[14].getText().toString().equals("O");
        boolean btn16 = buttons[15].getText().toString().equals("");

        if (btn1 && btn2 && btn3 && btn4 && btn5 && btn6 && btn7 && btn8 && btn9 && btn10 && btn11 && btn12 && btn13 && btn14 && btn15 && btn16) {
            Toast.makeText(MainActivity.this,"You Win...", Toast.LENGTH_SHORT).show();
        }
    }

    private void setacakArray() {
        final String[] letterPazzel = dataAlphabet;
        acakArray(letterPazzel);
        for (int i = 0; i < dataAlphabet.length; i++) {
            dataAlphabet[i] = letterPazzel[i];
        }
        setTombolAlphabet();
    }

    public static void acakArray(Object[] array) {
        int noOfElement = array.length;
        for (int i = 0; i < noOfElement; i++) {
            int s = i + (int) (Math.random() * (noOfElement - i));

            Object temp = array[s];
            array[s] = array[i];
            array[i] = temp;
        }
    }
}