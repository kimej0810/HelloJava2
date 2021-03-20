package HelloJava.HelloJava.repository;

import HelloJava.HelloJava.domain.Member;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {
    Member save(Member member); //회원이 저장소에 저장됨
    Optional<Member> findById(Long id); //저장소에서 id 찾아오기
    Optional<Member> findByName(String name);   //저장소에서 name 찾아오기
    List<Member> findAll(); //모든 list 반환
}
