package com.playlist;

import java.util.ArrayList;
import java.util.HashMap;

class Almanac
{
	HashMap<String, ArrayList<String>> projects = new HashMap<>();
	
	public String assignProject(String name, String project)
	{
		if(!projects.containsKey(name))
		{
			ArrayList<String> list = new ArrayList<>();
			list.add(project);
			projects.put(name, list);
		}
		else
			projects.get(name).add(project);
		
		return "Project Assigned Successfully";
	}
	
	public ArrayList<String> currentProjects(String name)
	{
		if(!projects.containsKey(name) || projects.isEmpty())
			return null;
		
		return projects.get(name);
	}
	
	public String finishProject(String name, String project)
	{
		if(!projects.containsKey(name))
			return "Not Found";
		
		ArrayList<String> list = projects.get(name);
		
		if(list.isEmpty() || list.contains(project))
			return "Not found";
		
		list.remove(project);
		return "Project removed successfully";
	}
}


public class Q6 {
	
	public static void main(String[] args) {
		Almanac a = new Almanac();
		
        System.out.println(a.assignProject("John","AI"));
        System.out.println(a.assignProject("John","ML"));
        System.out.println(a.assignProject("Sara","Web"));

        System.out.println(a.currentProjects("John"));

        System.out.println(a.finishProject("John","ML"));
        System.out.println(a.currentProjects("John"));
	}
}
