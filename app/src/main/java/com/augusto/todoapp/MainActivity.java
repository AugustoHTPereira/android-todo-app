package com.augusto.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public String url = "https://mockend.com/AugustoHTPereira/android-todo-app/todo";
    private ListView listTodo;
    private ArrayList<Todo> todos;
    private FloatingActionButton fabAddTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listTodo = findViewById(R.id.listTodo);
        fabAddTodo = findViewById(R.id.fabAddTodo);

        todos = new ArrayList<Todo>();
        todos.add(new Todo("Learn java", "I need to learn java now!"));
        todos.add(new Todo("Learn PHP", "I need to learn php now!"));
        todos.add(new Todo("Learn machine learning", "I need to learn machine learning now!"));

        ArrayAdapter<Todo> adapter = new ArrayAdapter<Todo>(MainActivity.this, android.R.layout.simple_list_item_1, todos);
        listTodo.setAdapter(adapter);

        fabAddTodo.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AddTodo.class));
        });
    }
}