package com.infy.assignment.io;
import java.util.List;

public class Term {
    private String termName;
    private String studentId;
    private List<Mark> termMarks;
    public String getTermName() {
        return termName;
    }
    public void setTermName(String termName) {
        this.termName = termName;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public List<Mark> getTermMarks() {
        return termMarks;
    }
    public void setTermMarks(List<Mark> termMarks) {
        this.termMarks = termMarks;
    }
}
