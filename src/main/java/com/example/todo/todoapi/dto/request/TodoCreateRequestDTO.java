package com.example.todo.todoapi.dto.request;


import com.example.todo.todoapi.entity.Todo;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
public class TodoCreateRequestDTO {
    //할일 추가 등록할때 필요한 정보
    @NotBlank
    @Size(min = 2,max = 10)
    private String title;

    //dto를 엔터티로 변환
    public Todo toEntity(){
        return Todo.builder()
                .title(this.title).build();
    }
}
