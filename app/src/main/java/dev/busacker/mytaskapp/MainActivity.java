package dev.busacker.mytaskapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dev.busacker.mytaskapp.ui.login.LoginActivity;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewTasks;
    private TaskAdapter taskAdapter;
    private List<Task> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerViewTasks = findViewById(R.id.recyclerViewTasks);

        recyclerViewTasks.setLayoutManager(new LinearLayoutManager(this));

        // Hier können Sie weitere Initialisierungen vornehmen.

        FloatingActionButton addTaskButton = findViewById(R.id.addTaskButton);
        addTaskButton.setOnClickListener(view -> {
            // Hier die Logik zum Hinzufügen eines neuen Tasks implementieren
        });


        FloatingActionButton loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(view -> {
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);

        });


        // Erstellen Sie Beispiel-Todos
        taskList = new ArrayList<>();
        taskList.add(new Task("Einkaufen", "Milch, Brot, Eier kaufen", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        taskList.add(new Task("Fitnessstudio", "Beintraining um 18 Uhr", false, false, new Date()));
        // Fügen Sie nach Bedarf weitere Tasks hinzu

        taskAdapter = new TaskAdapter(taskList);
        recyclerViewTasks.setAdapter(taskAdapter);

    }

}
