package fr.asys.starter.cleher.core.api.taskmanager.mapper;

import fr.asys.common.springboot.service.core.BaseMapper;
import fr.asys.starter.cleher.core.api.taskmanager.dto.TaskDto;
import fr.asys.starter.cleher.core.api.taskmanager.model.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoMapper extends BaseMapper<TaskDto, Task> {

    @Override
    public Task map(final TaskDto taskDto) {
        final Task task = new Task();
        task.setId(taskDto.getId());
        task.setTask(taskDto.getTask());
        task.setDone(taskDto.isDone());
        return task;
    }

}
