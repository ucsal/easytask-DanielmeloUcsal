package br.com.mariojp.easytask.core;

import java.util.List;

public interface ITeskManager {

    void addTask(ITesk task);

    void completeTask(String taskName);

    void removeTask(String taskName);

    List<ITesk> getTasks();
}
