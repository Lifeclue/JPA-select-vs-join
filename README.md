# JPA-select-vs-join
A test the SELECT vs. JOIN on JPA

## 결론

`@EntityGraph`를 통한 JOIN 전략이 기본 전략보다 빠릅니다.

맥북, Java 1.8, MySQL 5.7에서 실행해 본 결과 5배에서 10배 정도의 차이가 있었습니다.

`@EntityGraph`를 통한 JOIN 쿼리시 평균 4.13ms가 걸리는 반면 기본 전략을 통한 후속 SELECT시 평균 42.08ms가 걸렸습니다.
