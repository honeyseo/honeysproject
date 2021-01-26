package hello.hellospring.repository;

import hello.hellospring.domain.Kiosk;
import hello.hellospring.domain.Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save(){
        /*Member member = new Member();
        member.setName("spring");
        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        //System.out.println("result = "+(result == member));
        assertThat(member).isEqualTo(result);*/
        List<Map<String, Object>> restfulKList = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("zone_cnt", 13);
        map1.put("zone_call_num", 1498);
        map1.put("zone_id", 12);
        map1.put("zone_floor", "1F");
        map1.put("zone_nm", "접수수납");
        restfulKList.add(map1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("zone_cnt", 2);
        map2.put("zone_call_num", "0111");
        map2.put("zone_id", 11);
        map2.put("zone_floor", "1F");
        map2.put("zone_nm", "처음오신분");
        restfulKList.add(map2);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("zone_cnt", 20);
        map3.put("zone_call_num", "4068");
        map3.put("zone_id", 17);
        map3.put("zone_floor", "1F");
        map3.put("zone_nm", "제증명");
        restfulKList.add(map3);

        Map<String, Object> map4 = new HashMap<>();
        map4.put("zone_cnt", 5);
        map4.put("zone_call_num", "3065");
        map4.put("zone_id", 16);
        map4.put("zone_floor", "1F");
        map4.put("zone_nm", "통합검사예약");
        restfulKList.add(map4);

        Map<String, Object> map5 = new HashMap<>();
        map5.put("zone_cnt", 0);
        map5.put("zone_call_num", "5055");
        map5.put("zone_id", 5);
        map5.put("zone_floor", "1F");
        map5.put("zone_nm", "입원수속");
        restfulKList.add(map5);

        Map<String, Object> map6 = new HashMap<>();
        map6.put("zone_cnt", 3);
        map6.put("zone_call_num", "6048");
        map6.put("zone_id", 6);
        map6.put("zone_floor", "1F");
        map6.put("zone_nm", "퇴원수납");
        restfulKList.add(map6);
        List<Kiosk> kioskList = new ArrayList<>();

        Kiosk kiosk1 = new Kiosk();
        kiosk1.setId(Long.parseLong("1"));
        kiosk1.setHospitalCd("37100025");
        kiosk1.setSectionCd("1F");
        kiosk1.setSeq(1);
        kiosk1.setSectionNm("1층");
        kiosk1.setBizNm("접수수납");
        kiosk1.setBizCd("12");
        kiosk1.setRemark("본관");
        kiosk1.setWaitingCnt(null);
        kioskList.add(kiosk1);

        Kiosk kiosk2 = new Kiosk();
        kiosk2.setId(Long.parseLong("1"));
        kiosk2.setHospitalCd("37100025");
        kiosk2.setSectionCd("1F");
        kiosk2.setSeq(2);
        kiosk2.setSectionNm("1층");
        kiosk2.setBizNm("처음오신분");
        kiosk2.setBizCd("11");
        kiosk2.setRemark("본관");
        kiosk2.setWaitingCnt(null);
        kioskList.add(kiosk2);

        Kiosk kiosk3 = new Kiosk();
        kiosk3.setId(Long.parseLong("1"));
        kiosk3.setHospitalCd("37100025");
        kiosk3.setSectionCd("1F");
        kiosk3.setSeq(3);
        kiosk3.setSectionNm("1층");
        kiosk3.setBizNm("제증명");
        kiosk3.setBizCd("17");
        kiosk3.setRemark("본관");
        kiosk3.setWaitingCnt(null);
        kioskList.add(kiosk3);

        Kiosk kiosk4 = new Kiosk();
        kiosk4.setId(Long.parseLong("1"));
        kiosk4.setHospitalCd("37100025");
        kiosk4.setSectionCd("1F");
        kiosk4.setSeq(4);
        kiosk4.setSectionNm("1층");
        kiosk4.setBizNm("통합검사예약");
        kiosk4.setBizCd("16");
        kiosk4.setRemark("본관");
        kiosk4.setWaitingCnt(null);
        kioskList.add(kiosk4);

        Kiosk kiosk5 = new Kiosk();
        kiosk5.setId(Long.parseLong("1"));
        kiosk5.setHospitalCd("37100025");
        kiosk5.setSectionCd("1F");
        kiosk5.setSeq(5);
        kiosk5.setSectionNm("1층");
        kiosk5.setBizNm("입원수속");
        kiosk5.setBizCd("5");
        kiosk5.setRemark("본관");
        kiosk5.setWaitingCnt(null);
        kioskList.add(kiosk5);

        Kiosk kiosk6 = new Kiosk();
        kiosk6.setId(Long.parseLong("1"));
        kiosk6.setHospitalCd("37100025");
        kiosk6.setSectionCd("1F");
        kiosk6.setSeq(6);
        kiosk6.setSectionNm("1층");
        kiosk6.setBizNm("퇴원수납");
        kiosk6.setBizCd("6");
        kiosk6.setRemark("본관");
        kiosk6.setWaitingCnt(null);
        kioskList.add(kiosk6);

        for(Map<String, Object> getKiosk : restfulKList){
            for(Kiosk kiosk : kioskList){
                if(getKiosk.get("zone_id").equals(Integer.parseInt(kiosk.getBizCd()))){
                    kiosk.setWaitingCnt((int)getKiosk.get("zone_cnt"));
                }
            }
        }
        System.out.println(kioskList);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring2").get();

        assertThat(result).isEqualTo(member2);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }

}
