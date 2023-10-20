package org.example;

import java.util.ArrayList;

public class CU {
    String nameCU;
    ArrayList<Mark> marks;
    int totalStudents;

    public CU(String nameCU, int totalStudents) {
        this.nameCU = nameCU;
        this.marks = new ArrayList<>();
        this.totalStudents = totalStudents;
    }

    public void insertMarkCU(int numStudent, double mark) {
        Mark newMark = new Mark(numStudent, mark);
        marks.add(newMark);
    }

    public double searchStudent(int numStudent) {
        for (Mark mark : marks) {
            if (mark.numStudent == numStudent) {
                return mark.mark;
            }
        }
        return -1; // Aluno não encontrado
    }

    public double averageCU() {
        if (marks.isEmpty()) {
            return 0; // Não há notas registradas
        }
        double totalMarks = 0;
        for (Mark mark : marks) {
            totalMarks += mark.mark;
        }
        return totalMarks / marks.size();
    }

    public boolean isApproved(int numStudent) {
        double studentMark = searchStudent(numStudent);
        return studentMark >= 9.5;
    }
}
