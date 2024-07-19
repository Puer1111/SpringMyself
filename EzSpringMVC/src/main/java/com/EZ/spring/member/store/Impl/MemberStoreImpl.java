package com.EZ.spring.member.store.Impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.EZ.spring.member.domain.MemberVO;
import com.EZ.spring.member.store.MemberStore;
@Repository
public class MemberStoreImpl implements MemberStore{
	
	@Override
	public int insertMember(SqlSession session, MemberVO member) {
	int result=	session.insert("MemberMapper.insertMember",member);
		return result;
	}

	@Override
	public int deleteMember(SqlSession session, String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatemember(SqlSession session, MemberVO member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO checkMemberLogin(SqlSession session, MemberVO member) {
		MemberVO result = session.selectOne("MemberMapper.checkMemberLogin",member);
		return result;
	}

	@Override
	public MemberVO selectOneById(SqlSession session, String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

}
