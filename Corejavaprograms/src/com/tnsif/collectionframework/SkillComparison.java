package com.tnsif.collectionframework;

import java.util.HashSet;

public class SkillComparison {
	public static void main(String[] args) {
		

HashSet<String> Javateam=new HashSet<>();

Javateam.add("Java");
Javateam.add("SQl");
Javateam.add("GIT");
Javateam.add("Spring");
Javateam.add("Docker");
Javateam.add("Java");
Javateam.add(null);
Javateam.add(null);
System.out.println(Javateam);


HashSet<String> PythonTeam =new HashSet<>();
PythonTeam.add("python");
PythonTeam.add("Sql");
PythonTeam.add("git");
PythonTeam.add("AWS");

System.out.println(PythonTeam);

//create a copy of java team's skills

HashSet<String> common=(HashSet<String>) Javateam.clone();

System.out.println(common);

//keep only skills avalibale in both team

common.retainAll(PythonTeam);
System.out.println("common skills :"+common);

//create a another copy of java team's skills

HashSet<String> onlyJava=(HashSet<String>) Javateam.clone();
System.out.println(onlyJava);

//remove skills which python team also has

onlyJava.removeAll(PythonTeam);
System.out.println("only java team :"+onlyJava);


}
}