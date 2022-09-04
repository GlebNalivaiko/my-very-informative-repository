package election;

public class Result {
/**this method counts the election results, and outputs the number of votes and the winner to the console.
 *  If the number of votes is <0, this may be the case in the case of voting against all, then "Gleb" automatically wins
 *
 */
    public static void showResult(OfficialCandidate candidate, IllegalCandidate candidate1, RandomCandidate candidate2) {
        if (candidate.getNumberOfVotes() > candidate1.getNumberOfVotes() && candidate.getNumberOfVotes() > candidate2.getNumberOfVotes() && candidate.getNumberOfVotes() > 0) {
            System.out.println(candidate.getName() + " win!!!\nHe became president!" + candidate.getName() + " have " + candidate.getNumberOfVotes() + "!");
        } else if (candidate1.getNumberOfVotes() > candidate2.getNumberOfVotes() && candidate1.getNumberOfVotes() > 0) {
            System.out.println(candidate1.getName() + " win!!!\nHe became president!" + candidate1.getName() + " have " + candidate1.getNumberOfVotes() + "!");
        } else if (candidate1.getNumberOfVotes() < candidate2.getNumberOfVotes() && candidate2.getNumberOfVotes() > 0) {
            System.out.println(candidate2.getName() + " win!!!\nHe became president!" + candidate2.getName() + " have " + candidate2.getNumberOfVotes() + "!");
        } else {
            candidate.setNumberOfVotes(100);
            System.out.println(candidate.getName() + " win!!!\nHe became president by chance, since the majority voted against all!" + candidate.getName() + " have " + candidate.getNumberOfVotes() + "!");
        }
    }
}
