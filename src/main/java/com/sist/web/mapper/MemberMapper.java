package com.sist.web.mapper;

// postgre랑 연결 테스트
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.sist.web.vo.*;
import java.util.*;
@Mapper
@Repository
public interface MemberMapper {

	@Select("SELECT * FROM member")
	public List<MemberVO> memberListData();
}
