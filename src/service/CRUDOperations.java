package service;

import java.io.IOException;
import java.util.*;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the
	public List<Blog> addBlog(Blog blog) throws IOException {
		list.add(blog);
		System.out.println("After adding an element:");
		for(Blog item:list) {
			System.out.println(item);
		}
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		
		for(Blog item:list) {
			System.out.println(item);
		}
		return list;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
		list.set(list.indexOf(blog), blog);
		return list;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		list.remove(blog);
		return list;
		
	}
	public List<Blog> sortByTitle(){
		Collections.sort(list,(Blog b1,Blog b2)->b1.getBlogTitle().compareTo(b2.getBlogTitle()));
		System.out.println("After Sorting By Title Using List");
		for(Blog x:list) {
			System.out.println(x.getBlogTitle());
			System.out.println(x.getBlogDescription());
			System.out.println(x.getDate());
		}

	
		TreeSet<Blog> set=new TreeSet<Blog>(list);
		System.out.println("After Sorting By Title Using Set");
		for(Blog x:set) {
			System.out.println(x.getBlogTitle());
			System.out.println(x.getBlogDescription());
			System.out.println(x.getDate());
		
	    }
		return list;
	}
	public List<Blog> sortByDate(){
		Collections.sort(list,(b1,b2)->b1.getDate().compareTo(b2.getDate()));
		System.out.println("After Sorting By Date Using List");
		for(Blog x:list) {
			System.out.println(x.getBlogTitle());
			System.out.println(x.getBlogDescription());
			System.out.println(x.getDate());
		}

	
		TreeSet<Blog> set=new TreeSet<Blog>(list);
		System.out.println("After Sorting By Date Using Set");
		for(Blog x:set) {
			System.out.println(x.getBlogTitle());
			System.out.println(x.getBlogDescription());
			System.out.println(x.getDate());
		
	    }
		return list;
	}
	
}
