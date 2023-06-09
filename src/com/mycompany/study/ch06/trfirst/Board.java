package com.mycompany.study.ch06.trfirst;

public class Board {
	int boardSeq;
	String title;
	String user;
	String date;
	int viewCnt;
	
	int userSeq;
	String userName;
	String userId;
	String userPw;
	String userEmail;
	
	void write() {
		System.out.println("게시글 쓰기");
	}
	void regist() {
		System.out.println("제목, 글쓴이, 작성 날짜 등록");
	}
	void count() {
		System.out.println("작성 글 조회수 올라가기");
	}
 }
