import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main {
        private static HashMap<String, Double> partyProbabilities = new HashMap<>();
        private static ArrayList<String> userAnswers = new ArrayList<>();
        private static Double THRESHOLD = 0.50;
        private static String mostLikelyParty = "republican";
        private static DecimalFormat df = new DecimalFormat("#.##");

        public static void main(String[] args) {
                // Populate the hashmap with probabilities, start with a 25% of being either
                // party
                partyProbabilities.put("republican", 0.25);
                partyProbabilities.put("democrat", 0.25);
                partyProbabilities.put("libertarian", 0.25);
                partyProbabilities.put("centrist", 0.25);

                // Initialize our scanner for user inputs
                Scanner scanner = new Scanner(System.in);

                // Initiate questions with answers
                String[][] questionAnswers = {

                                { "1. What is your stance on gun-control?",
                                                "A: I love the second amendment and want no restrictions.",
                                                "B: We need no guns and only police and military should have them.",
                                                "C: I want complete gun rights with minimal restrictions.",
                                                "D: We need a balanced approach that can address public safety while respecting the second amendment." },

                                { "2. How should the government approach healthcare reform?",
                                                "A: Support market-based solutions and oppose government intervention in healthcare.",
                                                "B: Advocate for universal healthcare coverage and government-funded healthcare programs.",
                                                "C: Promote healthcare deregulation and individual choice in healthcare services.",
                                                "D: Seek bipartisan solutions to improve access to affordable healthcare without excessive government control." },

                                { "3. What is your opinion on taxation and fiscal policy?",
                                                "A: Advocate for lower taxes, limited government spending, and fiscal responsibility.",
                                                "B: Support progressive taxation and increased government spending on social programs.",
                                                "C: Favor minimal taxation and limited government involvement in the economy.",
                                                "D: Advocate for a fair tax system and responsible fiscal management to address economic inequality and promote growth." },

                                { "4. How should the government address climate change?",
                                                "A: Oppose strict environmental regulations and prioritize economic growth over environmental concerns.",
                                                "B: Support aggressive measures to combat climate change, including carbon emissions reduction targets.",
                                                "C: Favor market-based solutions and technological innovation to address environmental challenges.",
                                                "D: Advocate for pragmatic policies that balance environmental protection with economic interests." },

                                { "5. What is your stance on immigration policy?",
                                                "A: Support strict immigration controls, border security, and enforcement of immigration laws.",
                                                "B: Advocate for comprehensive immigration reform, including a path to citizenship for undocumented immigrants.",
                                                "C: Promote open borders and free movement of people, with minimal restrictions on immigration.",
                                                "D: Seek a balanced approach to immigration policy that addresses border security concerns while providing opportunities for legal immigration and protecting immigrant rights." },

                                { "6. How should the government address income inequality?",
                                                "A: Support free-market capitalism and oppose government intervention to redistribute wealth.",
                                                "B: Advocate for progressive taxation, social welfare programs, and income redistribution to reduce inequality.",
                                                "C: Favor deregulation and economic freedom to promote upward mobility and entrepreneurship.",
                                                "D: Seek policies that promote economic opportunity and fairness, addressing inequality without stifling economic growth." },

                                { "7. What is your opinion on foreign policy and military intervention?",
                                                "A: Support a strong national defense and assertive foreign policy to protect American interests.",
                                                "B: Advocate for diplomacy and multilateral cooperation to address global challenges and reduce military intervention.",
                                                "C: Favor non-interventionism and oppose military intervention in foreign conflicts.",
                                                "D: Seek a pragmatic approach to foreign policy that balances national security interests with diplomatic engagement and humanitarian concerns." },

                                { "8. How should the government address education reform?",
                                                "A: Support school choice initiatives, charter schools, and voucher programs to increase educational options and competition.",
                                                "B: Advocate for increased funding for public education, teacher pay raises, and universal pre-K programs.",
                                                "C: Favor privatization and decentralization of education, with minimal government involvement in curriculum and standards.",
                                                "D: Seek bipartisan solutions to improve educational outcomes, increase access to quality education, and address disparities in education." },

                                { "9. What is your stance on LGBTQ rights?",
                                                "A: Oppose LGBTQ rights and support traditional family values and religious freedom.",
                                                "B: Advocate for LGBTQ rights and equality under the law.",
                                                "C: Favor individual freedom and limited government interference in personal matters, including LGBTQ rights.",
                                                "D: Seek policies that respect individual autonomy and uphold civil liberties, while respecting diverse beliefs and values." },

                                { "10. What is your stance on reproductive rights?",
                                                "A: Oppose abortion rights and support restrictions on reproductive choices.",
                                                "B: Advocate for reproductive rights and access to abortion services.",
                                                "C: Favor individual autonomy and limited government interference in reproductive matters.",
                                                "D: Seek policies that respect reproductive choices and support comprehensive reproductive healthcare." },

                                { "11. What political party do you align yourself with?",
                                                "A: Republican",
                                                "B: Democrat",
                                                "C: Libertarian",
                                                "D: Centrist" }
                };

                int currentQuestion = 0;

                // Prints out question with multiple choice answers that belong to that question
                while (currentQuestion <= questionAnswers.length - 1) {
                        System.out.println("----------------------------------");
                        System.out.println(questionAnswers[currentQuestion][0]);
                        for (int i = 1; i < questionAnswers[currentQuestion].length; i++) {
                                System.out.println(questionAnswers[currentQuestion][i]);
                        }

                        String userInput = scanner.nextLine();
                        String userInputUpper = userInput.toUpperCase();

                        // Validate user input first and if ok score political points
                        if (userInputUpper.equals("A")
                                        || userInputUpper.equals("B")
                                        || userInputUpper.equals("C")
                                        || userInputUpper.equals("D")) {

                                System.out.println("");
                                changePartyProbability(userInputUpper);
                                mostLikelyParty = calculateParty(partyProbabilities);
                                userAnswers.add(userInputUpper);
                                currentQuestion += 1;

                                // Check if the most likely party probability has reached the threshold
                                if (partyProbabilities.get(mostLikelyParty) >= THRESHOLD) {
                                        break;
                                }
                        } else {
                                System.out.println("Please enter a valid answer, either A, B, C or D.");
                                System.out.println("");
                        }

                }

                System.out.println("It seems the party you align with is " + mostLikelyParty
                                + " with a probability of "
                                + (df.format(Math.round((partyProbabilities.get(mostLikelyParty) * 100))))
                                + "%");
                // Will write to correct political file based on calculated party
                writeToMatchingPoliticalFile(mostLikelyParty, userAnswers);
        }

        public static void changePartyProbability(String input) {
                // Depending on input it will change probability of party
                // Subtracts other probabilities to make sure we do not pass 1.0
                if (input.equals("A")) {
                        partyProbabilities.put("republican", partyProbabilities.get("republican") + .0682);
                        partyProbabilities.put("democrat", partyProbabilities.get("democrat") - .0227);
                        partyProbabilities.put("libertarian", partyProbabilities.get("libertarian") - .0227);
                        partyProbabilities.put("centrist", partyProbabilities.get("centrist") - .0227);
                } else if (input.equals("B")) {
                        partyProbabilities.put("republican", partyProbabilities.get("republican") - .0227);
                        partyProbabilities.put("democrat", partyProbabilities.get("democrat") + .0682);
                        partyProbabilities.put("libertarian", partyProbabilities.get("libertarian") - .0227);
                        partyProbabilities.put("centrist", partyProbabilities.get("centrist") - .0227);
                } else if (input.equals("C")) {
                        partyProbabilities.put("republican", partyProbabilities.get("libertarian") - .0227);
                        partyProbabilities.put("democrat", partyProbabilities.get("democrat") - .0227);
                        partyProbabilities.put("libertarian", partyProbabilities.get("libertarian") + .0682);
                        partyProbabilities.put("centrist", partyProbabilities.get("centrist") - .0227);
                } else if (input.equals("D")) {
                        partyProbabilities.put("republican", partyProbabilities.get("republican") - .0227);
                        partyProbabilities.put("democrat", partyProbabilities.get("democrat") - .0227);
                        partyProbabilities.put("libertarian", partyProbabilities.get("libertarian") - .0227);
                        partyProbabilities.put("centrist", partyProbabilities.get("centrist") + .0682);
                }
        }

        public static String calculateParty(HashMap<String, Double> probabilities) {
                double maxProb = Double.MIN_VALUE;
                double totalProbability = 0.0;

                // Calculated to for later use in bayes theorem
                for (double likelihood : probabilities.values()) {
                        totalProbability += likelihood;
                }

                // Will determine based on probability calculated from other methods
                for (String party : probabilities.keySet()) {
                        double priorProbability = 0.25;
                        double likelihood = probabilities.get(party);

                        // Utilize bayes theorem P(A|B) = (P(B|A) * P(A)) / P(B)
                        // P(B|A) is prob of certain party and value is received from hashmap
                        // P(A) is prior probability of political party will be .25, user only has 1/4 chance each time to select one of four political parties
                        // P(B) is total prob adding up all the probs from hashmap
                        // P(A|B) is posteriorProbability which is the likelihood that prob that A is
                        // the party that will be when user selects answer related to party
                        double posteriorProbability = (likelihood * priorProbability) / totalProbability;

                        if (posteriorProbability > maxProb) {
                                maxProb = posteriorProbability;
                                mostLikelyParty = party;
                        }
                }

                return mostLikelyParty;
        }

        public static void writeToMatchingPoliticalFile(String party, ArrayList<String> answers) {
                // Based off party will create a file if it doesn't exist yet and write to it
                if (party.equals("republican")) {
                        File republicanFile = new File("republican.txt");

                        try {
                                republicanFile.createNewFile();
                                FileWriter writer = new FileWriter(republicanFile, true);

                                // Write user answers
                                for (int i = 0; i < answers.size(); i++) {
                                        writer.write(answers.get(i));
                                }

                                writer.write("\n");
                                writer.close();

                        } catch (IOException e) {
                                e.printStackTrace();
                                System.err.println("Failed to write to file correctly");
                        }

                } else if (party.equals("democrat")) {
                        File democratFile = new File("democrat.txt");

                        try {
                                democratFile.createNewFile();
                                FileWriter writer = new FileWriter(democratFile, true);

                                // Write user answers
                                for (int i = 0; i < answers.size(); i++) {
                                        writer.write(answers.get(i));
                                }

                                writer.write("\n");
                                writer.close();

                        } catch (IOException e) {
                                e.printStackTrace();
                                System.err.println("Failed to write to file correctly");
                        }

                } else if (party.equals("libertarian")) {
                        File libertarianFile = new File("libertarian.txt");

                        try {
                                libertarianFile.createNewFile();
                                FileWriter writer = new FileWriter(libertarianFile, true);

                                // Write user answers
                                for (int i = 0; i < answers.size(); i++) {
                                        writer.write(answers.get(i));
                                }

                                writer.write("\n");
                                writer.close();

                        } catch (IOException e) {
                                e.printStackTrace();
                                System.err.println("Failed to write to file correctly");
                        }
                } else if (party.equals("centrist")) {
                        File centristFile = new File("centrist.txt");

                        try {
                                centristFile.createNewFile();
                                FileWriter writer = new FileWriter(centristFile, true);

                                // Write user answers
                                for (int i = 0; i < answers.size(); i++) {
                                        writer.write(answers.get(i));
                                }

                                writer.write("\n");
                                writer.close();

                        } catch (IOException e) {
                                e.printStackTrace();
                                System.err.println("Failed to write to file correctly");
                        }
                }
        }
}