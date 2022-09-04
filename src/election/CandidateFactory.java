package election;

public class CandidateFactory implements Writeable {
    private int numberOfVotes;
    private final String name;


    public CandidateFactory(String name) {
        numberOfVotes = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    @Override
    public void voicesPlus() {
        numberOfVotes++;
    }

    @Override
    public void voicesMinus() {
        numberOfVotes--;
    }
}
