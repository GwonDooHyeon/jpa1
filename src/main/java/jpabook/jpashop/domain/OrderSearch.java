package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderSearch {

    // 회원 이름
    private String memberName;

    // 주문 상태
    private OrderStatus orderStatus;
}
