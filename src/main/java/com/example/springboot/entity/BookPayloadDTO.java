package com.example.springboot.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookPayloadDTO {

    @NotBlank
    @Schema(
            description = "제목",
            example = "자바의 정석",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String title;

    @NotBlank
    private int price;

    @NotBlank
    private String author;

    @NotBlank
    private int page;
}
