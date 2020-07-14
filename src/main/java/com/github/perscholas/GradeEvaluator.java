package com.github.perscholas;

/**
 * Created by leon on 7/14/2020.
 */
public class GradeEvaluator {
    public Boolean isGradeA(Double score) {
        if(score >= 90 && score <= 100) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isGradeB(Double score) {
        if(score >= 80 && score < 90) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isGradeC(Double score) {
        if(score >= 70 && score < 80) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isGradeD(Double score) {
        if(score > 64 && score < 70) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isGradeF(Double score) {
        if(score <= 64) {
            return true;
        }
        else {
            return false;
        }
    }

    public Character getGrade(Double score) {
        if(isGradeA(score)) {
            return 'A';
        }
        else if(isGradeB(score)) {
            return 'B';
        }
        else if(isGradeC(score)) {
            return 'C';
        }
        else if(isGradeD(score)) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
