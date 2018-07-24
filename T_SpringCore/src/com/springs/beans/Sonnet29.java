package com.springs.beans;

public class Sonnet29 implements Poem{
	
	String lines[] ={
			"When,indisgracewithfortuneandmen'seyes,",
			"I allalonebeweepmyoutcaststate",
			"Andtroubledeafheavenwithmybootlesscries",
			"Andlookuponmyselfandcursemyfate,",
			"Wishingmeliketoonemorerichinhope,",
			"Featuredlikehim,likehimwithfriendspossess'd,",
			"Desiringthisman'sartandthatman'sscope,",
			"WithwhatImostenjoycontentedleast;",
			"Yetinthesethoughtsmyselfalmostdespising,",
			"HaplyIthinkonthee,andthenmystate,",
			"Liketothelarkatbreakofdayarising",
			"Fromsullenearth,singshymnsatheaven'sgate;",
			"Forthysweetloveremember'dsuchwealthbrings",
			"ThatthenIscorntochangemystatewithkings."
	};

	@Override
	public void recite() {
		for(int i =0; i<lines.length; i++){
			System.out.println(lines[i]);
		}
		
	}

}
