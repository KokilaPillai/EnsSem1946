package com.hibernate;


public class student_info extends marks{

	
		  
			private int rollNo;
			 
			
			private String name;
			
			
			public student_info() {
				this.rollNo = 0;
				this.name = null;
				}
			
			public student_info(int rollNo, String name, String course, int isa1,int isa2,int isa3,int endsem) {
				this.rollNo=rollNo;
				this.name=name;
				this.course=course;
				this.isa1=isa1;
				this.isa2=isa2;
				this.isa3=isa3;
				this.endsem=endsem;
			}
			}
