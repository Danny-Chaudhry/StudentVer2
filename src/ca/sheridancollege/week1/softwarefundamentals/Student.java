/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author sidhu376
 */
public class Student {

	private String name;
	private int Id;
	private String grade;
	private double GPA;
	
    
	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the GPA
	 */
	public double getGPA() {
		return GPA;
	}

	/**
	 * @param GPA the GPA to set
	 */
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

}
 
   