package br.com.mariojp.easytask.data;

public class Task { 
    private String name;
    private boolean isComplete;

    public Task(String name) {
        this.name = name;
        this.isComplete = false;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return isComplete;
    }

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


