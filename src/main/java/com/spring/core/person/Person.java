package com.spring.core.person;
import lombok.*;


/**
 * Lombok library 사용
 *
 * 하단과 같이 하나씩 사용할 수 있다.
 * @Data -> 하단 호출한 것들을 전부 호출하지만,
 * 실무에서는 커스텀을 할 때도 많기 때문에 사용하지 않는다.
 */

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor  //기본 생성자
@AllArgsConstructor // 모든 파라미터 생성자
//@Data
public class Person {
    private String nickName;
    private String address;
    private int age;
}
