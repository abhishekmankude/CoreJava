import com.access.packages.Election;

public class ElectionRun {
    public static void main(String[] args) {
        Election election = new Election();
        election.displayCandidate();
        //election.displayElectionYear();
        election.votesDisplay();
    }
}
