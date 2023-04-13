package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

/**
 * 인터페이스 사용 이유
 * 1. 협업(코드 컨벤션 잡기 위해)
 * 2. 다중 상속
 * 3. 교체 용이
 */
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long Id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
