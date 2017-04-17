import static org.junit.Assert.*;

import org.junit.Test;

import Gradework.Grade;

public class TestGrade {

	@Test
	public void testGrade() {
		Grade grade=new Grade();
		char c=grade.score(30,30,25);
		assertEquals('A',c);
	}
	@Test
	public void testGradeB() {
		Grade grade=new Grade();
		char c=grade.score(30,25,20);
		assertEquals('B',c);
	}
	@Test
	public void testGradeC() {
		Grade grade=new Grade();
		char c=grade.score(20,20,20);
		assertEquals('C',c);
	}
	@Test
	public void testGradeF() {
		Grade grade=new Grade();
		char c=grade.score(10,15,18);
		assertEquals('F',c);
	}
	@Test
	public void testScopeFalse() {
		Grade grade=new Grade();
		char c=grade.score(100,105,100);
		assertEquals('¿¹',c);
	}
	

}
