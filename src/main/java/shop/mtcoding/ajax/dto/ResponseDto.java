package shop.mtcoding.ajax.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ResponseDto<T> {
    private int code; // 1, -1
    private String msg; // 상세사유
    // 무조건 Object로 요청
    private T data; // 어떤 데이터를 가져올지 정해지지 않아서

}
