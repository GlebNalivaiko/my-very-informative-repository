package election;

public class Voter {
    public void vote(int i, OfficialCandidate candidate, IllegalCandidate candidate1, RandomCandidate candidate2) {
        switch (i) {
            case 1 -> candidate.voicesPlus();
            case 2 -> candidate1.voicesPlus();
            case 3 -> candidate2.voicesPlus();
            case 4 -> {
                Writeable[] arr = new Writeable[3];
                arr[0] = candidate;
                arr[1] = candidate1;
                arr[2] = candidate2;
                for (Writeable elements : arr) {
                    elements.voicesMinus();
                }
            }
        }
    }
}
