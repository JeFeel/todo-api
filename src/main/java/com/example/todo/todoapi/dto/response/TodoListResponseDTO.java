package com.example.todo.todoapi.dto.response;


import lombok.*;

import java.util.List;


@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoListResponseDTO {

    private String error; //에러 발생시 에러 메세지 담을 필드
    private List<TodoDetailResponseDTO> todos;

}
