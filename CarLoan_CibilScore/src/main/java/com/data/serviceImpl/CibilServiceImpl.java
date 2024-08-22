package com.data.serviceImpl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.data.model.CibilData;
import com.data.serviceI.CibilServiceI;
@Service
public class CibilServiceImpl implements CibilServiceI{
	
	private static String s = "carcheck";
	
	public static String id() {
		Random r = new Random();
		int i = r.nextInt(100,300);
		String s1 = s+i;
		return s1;
	}
	
	public String getremark(int score) {
		if(score>=750) {
			return "Excellent";
		}
		else if(score>=650 && score<=750) {
			return "Good";
		}
		else if(score>=550 && score<=650) {
			return "Average";
		}
		else {
			return "Poor";
		}
	}
	
	public String isapplicable(int score) {
		if(score<=600) {
			return "NO";
		}
		else {
			return "YES";
		}
	}

	@Override
	public CibilData check() {
		
		Random r = new Random();
		int score = r.nextInt(300,900);
		CibilData cd = new CibilData();
		cd.setId(id());
		cd.setCibilscore(score);
		cd.setIsApplicable(isapplicable(score));
		cd.setRemark(getremark(score));
		return cd; 
	}

}
