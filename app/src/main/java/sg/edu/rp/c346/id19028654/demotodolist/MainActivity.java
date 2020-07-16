package sg.edu.rp.c346.id19028654.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDoList;
    ArrayList<ToDoItem> alToDoItem;
    customAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvToDoList=findViewById(R.id.listViewToDoList);
        alToDoItem=new ArrayList<>();
        ToDoItem item1 =new ToDoItem("Buy Milk", Calendar.getInstance());
        alToDoItem.add(item1);
        alToDoItem.add(new ToDoItem("cut hair ",Calendar.getInstance()));
        alToDoItem.add(new ToDoItem("play game ",Calendar.getInstance()));

        adapter=new customAdapter(this,R.layout.row,alToDoItem);
        lvToDoList.setAdapter(adapter);
    }
}
