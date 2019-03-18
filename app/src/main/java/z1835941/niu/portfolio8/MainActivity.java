package z1835941.niu.portfolio8;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } //end onCreate

    public void getAnswer(View view){
        Intent answerIntent = new Intent(MainActivity.this, AnswerActivity.class);
        startActivity(answerIntent);
        overridePendingTransition(R.anim.answer_on, R.anim.question_off);
    }
}//end Main Activity Class
