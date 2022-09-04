package election;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
     //   Result result = new Result();//добавил статик метод и мне не нужен объект класса "результат"
        OfficialCandidate candidate1 = new OfficialCandidate("Gleb");
        RandomCandidate candidate2 = new RandomCandidate("Ruslan");
        IllegalCandidate candidate3 = new IllegalCandidate("Alex");
        for (int i = 0; i < 100; i++) {
            int randomCandidateVoice = random.nextInt(1, 5);
            new Voter().vote(randomCandidateVoice, candidate1, candidate3, candidate2);
        }
        Result.showResult(candidate1, candidate3, candidate2);
    }
}
