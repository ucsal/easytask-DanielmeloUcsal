package br.com.mariojp.easytask.data;

import br.com.mariojp.easytask.core.ITesk;

public class Task extends ITesk{ 
    private String name;
    private boolean isComplete;

    public Task(String name) {
        this.name = name;
        this.isComplete = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isComplete() {
        return isComplete;
    }

    @Override
    public void complete() {
        this.isComplete = true;
    }

    @Override
    public String toString() {
        return "Task{" +
               "name='" + name + '\'' +
               ", isComplete=" + isComplete +
               '}';
    }
}


