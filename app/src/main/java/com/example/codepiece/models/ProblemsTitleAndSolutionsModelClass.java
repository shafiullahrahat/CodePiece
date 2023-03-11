package com.example.codepiece.models;

public class ProblemsTitleAndSolutionsModelClass {
    String problemsTitle, probSolC, probSolCpp, probSolJava, probSolPython, algo;

    public ProblemsTitleAndSolutionsModelClass(String problemsTitle, String probSolC, String probSolCpp, String probSolJava, String probSolPython, String algo) {
        this.problemsTitle = problemsTitle;
        this.probSolC = probSolC;
        this.probSolCpp = probSolCpp;
        this.probSolJava = probSolJava;
        this.probSolPython = probSolPython;
        this.algo = algo;
    }

    public String getProblemsTitle() {
        return problemsTitle;
    }

    public void setProblemsTitle(String problemsTitle) {
        this.problemsTitle = problemsTitle;
    }

    public String getProbSolC() {
        return probSolC;
    }

    public void setProbSolC(String probSolC) {
        this.probSolC = probSolC;
    }

    public String getProbSolCpp() {
        return probSolCpp;
    }

    public void setProbSolCpp(String probSolCpp) {
        this.probSolCpp = probSolCpp;
    }

    public String getProbSolJava() {
        return probSolJava;
    }

    public void setProbSolJava(String probSolJava) {
        this.probSolJava = probSolJava;
    }

    public String getProbSolPython() {
        return probSolPython;
    }

    public void setProbSolPython(String probSolPython) {
        this.probSolPython = probSolPython;
    }

    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }
}
