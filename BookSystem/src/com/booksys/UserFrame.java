package com.booksys; // 시작화면

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class UserFrame extends JFrame {
	SearchBook sBook;
	RentBook rBook;
	JTabbedPane tabs;
	//생성자
	public UserFrame() {
		tabs = new JTabbedPane(JTabbedPane.TOP);
		sBook = new SearchBook();
		rBook = new RentBook();

		tabs.add("도서검색", sBook);
		tabs.add("대출도서목록", rBook);

		add(tabs);

		setVisible(false); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(650,200,600,600); 
		setTitle("도서관리시스템");
	}


}