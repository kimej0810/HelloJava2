package HelloJava.HelloJava.service;

import HelloJava.HelloJava.domain.Member;
import HelloJava.HelloJava.repository.MemberRepository;
import HelloJava.HelloJava.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }//외부에서 넣어줌.

    // 회원 가입
    public Long join(Member member){
        //같은 이름 있는 중복 회원은 X
        validateDuplicateMember(member);//중복회원검증
        memberRepository.save(member);//이름을 저장한뒤
        return member.getId();//회원가입하면 id를 반환해줌.
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()).ifPresent(m ->{
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }
    //전체 회원 조회
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
