package com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Task;
  
///classe mantida apenas para referencia, era utilizada 
// sem consulta ao banco
@Repository
public class Tasks {
	
	private static final List<Task> TASK_LIST = new ArrayList<>();
	
	   
	/**
	 * static {
		TASK_LIST.add(new Task(1234L,"login","correção"));
		TASK_LIST.add(new Task(6668L,"teste","add "));
		TASK_LIST.add(new Task(999L,"login","correção"));
		TASK_LIST.add(new Task(666L,"login","correção"));
	}
	 * 
	 */
	
	public List<Task> fullList(){
		return Tasks.TASK_LIST;
	}
	
	public void add(Task task) {
		Tasks.TASK_LIST.add(task);
	}
	
}
