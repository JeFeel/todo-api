package com.example.todo.todoapi.dto.response;


import com.example.todo.todoapi.entity.Todo;
import lombok.*;


@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoDetailResponseDTO {

    private String id;
    private String title;
    private boolean done;

    //이름을 react랑 맞춰주고 있음

    //엔터티를 dto로 만들어주는 생성자
    public TodoDetailResponseDTO(Todo todo){
        this.id = todo.getTodoId();
        this.title = todo.getTitle();
        this.done = todo.isDone();
    }
}
