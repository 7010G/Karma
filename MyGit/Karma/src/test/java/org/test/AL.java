package org.test;

public class AL {

	//遇到多表连查时数据无法自动封装到指定对象，需手动遍历集合，手动封装数据，如下所示
	/*List stuList = scoreService.findAllScore(queryScore, null); // 返回的结果集
	 * 
	   if(stuList != null && stuList.size()>0){
	    list = new LinkedList();
	    StudentScore st;
	    for(int i = 0; i < stuList.size();i++){
	     st = new StudentScore();
	     Object[] object = (Object[])stuList.get(i);// 每行记录不在是一个对象 而是一个数组
	     String userId =  (String)object[0];
	     String username =  (String)object[1];
	     String truename =  (String)object[2];
	     String sex =  (String)object[3];
	     String idnum =  (String)object[4];
	     String level =  (String)object[5];
	     Double sumScore =  Double.parseDouble(String.valueOf(object[6]));
	     String paperId =  (String)object[7];
	     // 重新封装在一个javabean里面
	     st.setUserId(userId);
	     st.setUsername(username);
	     st.setTruename(truename);
	     st.setIdnum(idnum);
	     st.setLevel(DictSwitch.getValue("DICT_LEVEL",level));
	     st.setSex(DictSwitch.getValue("DICT_SEX",sex));
	     st.setPaperId(paperId);
	     st.setSumScore(sumScore);
	     st.setExamplace(DictSwitch.getValue("DICT_EXAMSTATION",examplace));
	     list.add(st); // 最终封装在list中 传到前台。
*/}
