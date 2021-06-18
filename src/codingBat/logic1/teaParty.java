package codingBat.logic1;

public class teaParty {

    public int teaParty(int tea, int candy) {
        // 0 - is bad if tea or candy is less 5
        // 1 - good if both tea and candy min 5
        // 2 great if tea or candy is 2x of one of another

        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        } else {
            return 1;
        }

    }
}
