package com.access.packages;

public class Election {
    public String candidateName;
    private int votes;
    int electionYear;

    public Election() {
        this.candidateName = "John Doe";
        this.votes = 50000;
        this.electionYear = 2024;
    }

    public void displayCandidate() {
        System.out.println("Candidate Name: " + candidateName);
    }

    private void displayVotes() {
        System.out.println("Total Votes: " + votes);
    }

    void displayElectionYear() {
        System.out.println("Election Year: " + electionYear);
    }

    public void votesDisplay() {
        displayVotes();
    }

}

