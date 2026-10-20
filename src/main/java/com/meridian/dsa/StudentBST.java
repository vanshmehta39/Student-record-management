package com.meridian.dsa;
import com.meridian.student.Student; import java.util.*;
/** Ordinary unbalanced BST for in-memory student-ID searches. */
public class StudentBST {
 private Node root; private static class Node { Student value; Node left,right; Node(Student s){value=s;} }
 public record SearchResult(Student student,int nodesVisited,List<Long> path) { }
 public void insert(Student s){root=insert(root,s);} private Node insert(Node n,Student s){if(n==null)return new Node(s);if(s.getId()<n.value.getId())n.left=insert(n.left,s);else if(s.getId()>n.value.getId())n.right=insert(n.right,s);else n.value=s;return n;}
 public SearchResult searchById(long id){Node n=root;int visits=0;List<Long> path=new ArrayList<>();while(n!=null){visits++;path.add(n.value.getId());if(id==n.value.getId())return new SearchResult(n.value,visits,path);n=id<n.value.getId()?n.left:n.right;}return new SearchResult(null,visits,path);}
 public void deleteById(long id){root=delete(root,id);} private Node delete(Node n,long id){if(n==null)return null;if(id<n.value.getId())n.left=delete(n.left,id);else if(id>n.value.getId())n.right=delete(n.right,id);else{if(n.left==null)return n.right;if(n.right==null)return n.left;Node s=n.right;while(s.left!=null)s=s.left;n.value=s.value;n.right=delete(n.right,s.value.getId());}return n;}
 public List<Student> inorderTraversal(){List<Student> a=new ArrayList<>();walk(root,a);return a;} private void walk(Node n,List<Student>a){if(n!=null){walk(n.left,a);a.add(n.value);walk(n.right,a);}}
 public void rebuild(Collection<Student> all){root=null;all.forEach(this::insert);}
}
