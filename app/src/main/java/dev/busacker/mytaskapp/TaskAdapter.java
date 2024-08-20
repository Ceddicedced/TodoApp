package dev.busacker.mytaskapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
    private List<Task> taskList;

    public TaskAdapter(List<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public TaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        return new TaskViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TaskViewHolder holder, int position) {
        Task task = taskList.get(position);
        holder.title.setText(task.getName());
        holder.description.setText(task.getDescription());
        // Weitere Felder können hier gebunden werden
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        public TextView title, description;
        // Weitere Ansichten für zusätzliche Felder

        public TaskViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.taskTitle);
            description = view.findViewById(R.id.taskDescription);
            // Initialisierung weiterer Ansichten
        }
    }
}
