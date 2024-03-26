package br.com.mariojp.easytask.data;

import java.util.ArrayList;
import java.util.List;

import br.com.mariojp.easytask.core.ITesk;
import br.com.mariojp.easytask.core.ITeskManager;

public class TaskManager implements ITeskManager{
    private List<ITesk> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void addTask(ITesk task) {
        tasks.add(task);
    }

    @Override
    public void completeTask(String taskName) {
        for (ITesk task : tasks) {
            if (task.getName().equals(taskName)) {
                task.complete();
                return;
            }
        }
    }

    @Override
    public void removeTask(String taskName) {
        tasks.removeIf(task -> task.getName().equals(taskName));
    }

    @Override
    public List<ITesk> getTasks() {
        return tasks;
    }


}