import java.lang.reflect.Array;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] questionAnswers = {

                { "What is your stance on gun-control?",
                        "A: I love the second amendment and want no restrictions.",
                        "B: We need no guns and only police and military should have them.",
                        "C: I want complete gun rights with minimal restrictions.",
                        "D: We need a balanced approach that can address public safety while respecting the second amendment." },

                { "How should the government approach healthcare reform?",
                        "A: Support market-based solutions and oppose government intervention in healthcare.",
                        "B: Advocate for universal healthcare coverage and government-funded healthcare programs.",
                        "C: Promote healthcare deregulation and individual choice in healthcare services.",
                        "D: Seek bipartisan solutions to improve access to affordable healthcare without excessive government control." },

                { "What is your opinion on taxation and fiscal policy?",
                        "A: Advocate for lower taxes, limited government spending, and fiscal responsibility.",
                        "B: Support progressive taxation and increased government spending on social programs.",
                        "C: Favor minimal taxation and limited government involvement in the economy.",
                        "D: Advocate for a fair tax system and responsible fiscal management to address economic inequality and promote growth." },

                { "How should the government address climate change?",
                        "A: Oppose strict environmental regulations and prioritize economic growth over environmental concerns.",
                        "B: Support aggressive measures to combat climate change, including carbon emissions reduction targets.",
                        "C: Favor market-based solutions and technological innovation to address environmental challenges.",
                        "D: Advocate for pragmatic policies that balance environmental protection with economic interests." },

                { "What is your stance on immigration policy?",
                        "A: Support strict immigration controls, border security, and enforcement of immigration laws.",
                        "B: Advocate for comprehensive immigration reform, including a path to citizenship for undocumented immigrants.",
                        "C: Promote open borders and free movement of people, with minimal restrictions on immigration.",
                        "D: Seek a balanced approach to immigration policy that addresses border security concerns while providing opportunities for legal immigration and protecting immigrant rights." },

                { "How should the government address income inequality?",
                        "A: Support free-market capitalism and oppose government intervention to redistribute wealth.",
                        "B: Advocate for progressive taxation, social welfare programs, and income redistribution to reduce inequality.",
                        "C: Favor deregulation and economic freedom to promote upward mobility and entrepreneurship.",
                        "D: Seek policies that promote economic opportunity and fairness, addressing inequality without stifling economic growth." },

                { "What is your opinion on foreign policy and military intervention?",
                        "A: Support a strong national defense and assertive foreign policy to protect American interests.",
                        "B: Advocate for diplomacy and multilateral cooperation to address global challenges and reduce military intervention.",
                        "C: Favor non-interventionism and oppose military intervention in foreign conflicts.",
                        "D: Seek a pragmatic approach to foreign policy that balances national security interests with diplomatic engagement and humanitarian concerns." },

                { "How should the government address education reform?",
                        "A: Support school choice initiatives, charter schools, and voucher programs to increase educational options and competition.",
                        "B: Advocate for increased funding for public education, teacher pay raises, and universal pre-K programs.",
                        "C: Favor privatization and decentralization of education, with minimal government involvement in curriculum and standards.",
                        "D: Seek bipartisan solutions to improve educational outcomes, increase access to quality education, and address disparities in education." },

                { "What is your stance on LGBTQ rights?",
                        "A: Oppose LGBTQ rights and support traditional family values and religious freedom.",
                        "B: Advocate for LGBTQ rights and equality under the law.",
                        "C: Favor individual freedom and limited government interference in personal matters, including LGBTQ rights.",
                        "D: Seek policies that respect individual autonomy and uphold civil liberties, while respecting diverse beliefs and values." },

                { "What is your stance on reproductive rights?",
                        "A: Oppose abortion rights and support restrictions on reproductive choices.",
                        "B: Advocate for reproductive rights and access to abortion services.",
                        "C: Favor individual autonomy and limited government interference in reproductive matters.",
                        "D: Seek policies that respect reproductive choices and support comprehensive reproductive healthcare." },
                { "How should the government address criminal justice reform and policing?",

                        "A: Support law and order policies, tough-on-crime measures, and support for law enforcement.",
                        "B: Advocate for police reform, racial justice, and community policing initiatives.",
                        "C: Favor criminal justice reform, including ending the war on drugs and reducing mass incarceration.",
                        "D: Seek a balanced approach to criminal justice reform that prioritizes public safety, accountability, and fairness in the legal system." },

                { "What is your opinion on trade policy and globalization?",
                        "A: Support free trade agreements, deregulation, and economic globalization to promote growth and competitiveness.",
                        "B: Advocate for fair trade policies, protectionism, and tariffs to protect American workers and industries.",
                        "C: Favor free trade and open markets, opposing tariffs and trade barriers that restrict international commerce.",
                        "D: Seek policies that balance the benefits of global trade with the need to protect domestic industries and workers from unfair competition." },

                { "How should the government address infrastructure investment and transportation?",
                        "A: Support private sector investment and public-private partnerships to fund infrastructure projects and modernize transportation systems.",
                        "B: Advocate for increased federal funding for infrastructure repair and expansion, including transportation, roads, bridges, and public transit.",
                        "C: Favor deregulation and privatization of infrastructure, with minimal government involvement in funding and management.",
                        "D: Seek bipartisan solutions to address critical infrastructure needs, promote sustainable development, and improve transportation accessibility and efficiency." },

                { "What is your stance on energy policy and environmental protection?",
                        "A: Support domestic energy production, including fossil fuels and nuclear power, to achieve energy independence and economic growth.",
                        "B: Advocate for renewable energy development, environmental regulations, and climate action to address climate change and protect natural resources.",
                        "C: Favor energy deregulation and market-based solutions to promote innovation and efficiency in the energy sector.",
                        "D: Seek policies that balance environmental protection with economic interests, promoting sustainable development and clean energy transition." },

                { "How should the government address housing affordability and homelessness?",
                        "A: Support market-based solutions, including deregulation and incentives for private developers, to increase housing supply and affordability.",
                        "B: Advocate for federal funding for affordable housing programs, rent control measures, and homelessness prevention initiatives.",
                        "C: Favor deregulation and free market approaches to housing, reducing government intervention and barriers to housing development.",
                        "D: Seek bipartisan solutions to address housing affordability and homelessness issues." }
        };

        int currentQuestion = 0;

        while (currentQuestion <= questionAnswers.length) {
            System.out.println("");
            System.out.println(questionAnswers[currentQuestion][0]);
            for (int i = 1; i < questionAnswers[currentQuestion].length; i++) {
                System.out.println(questionAnswers[currentQuestion][i]);
            }

            String userInput = scanner.nextLine();
            currentQuestion += 1;
        }
    }
}