import java.lang.reflect.Array;

public class main {
    public static void main(String[] args) {
        String[][] questionAnswers = {
                { "What is your stance on gun-control",
                        "I love the second amendment and want no restrictions",
                        "We need no guns and only police and military should have them",
                        "I want complete gun rights with minimal restrictions",
                        "We need a balanced approach that can address public safety while respecting the second amendment" },

                { "How should the government approach healthcare reform?",
                        "Support market-based solutions and oppose government intervention in healthcare.",
                        "Advocate for universal healthcare coverage and government-funded healthcare programs.",
                        "Promote healthcare deregulation and individual choice in healthcare services.",
                        "Seek bipartisan solutions to improve access to affordable healthcare without excessive government control." },

                { "What is your opinion on taxation and fiscal policy?",
                        "Advocate for lower taxes, limited government spending, and fiscal responsibility.",
                        "Support progressive taxation and increased government spending on social programs.",
                        "Favor minimal taxation and limited government involvement in the economy.",
                        "Advocate for a fair tax system and responsible fiscal management to address economic inequality and promote growth." },

                { "How should the government address climate change?",
                        "Oppose strict environmental regulations and prioritize economic growth over environmental concerns.",
                        "Support aggressive measures to combat climate change, including carbon emissions reduction targets.",
                        "Favor market-based solutions and technological innovation to address environmental challenges.",
                        "Advocate for pragmatic policies that balance environmental protection with economic interests." },

                { "What is your stance on immigration policy?",
                        "Support strict immigration controls, border security, and enforcement of immigration laws.",
                        "Advocate for comprehensive immigration reform, including a path to citizenship for undocumented immigrants.",
                        "Promote open borders and free movement of people, with minimal restrictions on immigration.",
                        "Seek a balanced approach to immigration policy that addresses border security concerns while providing opportunities for legal immigration and protecting immigrant rights." },

                { "How should the government address income inequality?",
                        "Support free-market capitalism and oppose government intervention to redistribute wealth.",
                        "Advocate for progressive taxation, social welfare programs, and income redistribution to reduce inequality.",
                        "Favor deregulation and economic freedom to promote upward mobility and entrepreneurship.",
                        "Seek policies that promote economic opportunity and fairness, addressing inequality without stifling economic growth." },

                { "What is your opinion on foreign policy and military intervention?",
                        "Support a strong national defense and assertive foreign policy to protect American interests.",
                        "Advocate for diplomacy and multilateral cooperation to address global challenges and reduce military intervention.",
                        "Favor non-interventionism and oppose military intervention in foreign conflicts.",
                        "Seek a pragmatic approach to foreign policy that balances national security interests with diplomatic engagement and humanitarian concerns." },

                { "How should the government address education reform?",
                        "Support school choice initiatives, charter schools, and voucher programs to increase educational options and competition.",
                        "Advocate for increased funding for public education, teacher pay raises, and universal pre-K programs.",
                        "Favor privatization and decentralization of education, with minimal government involvement in curriculum and standards.",
                        "Seek bipartisan solutions to improve educational outcomes, increase access to quality education, and address disparities in education." },

                { "What is your stance on LGBTQ rights?",
                        "Oppose LGBTQ rights and support traditional family values and religious freedom.",
                        "Advocate for LGBTQ rights and equality under the law.",
                        "Favor individual freedom and limited government interference in personal matters, including LGBTQ rights.",
                        "Seek policies that respect individual autonomy and uphold civil liberties, while respecting diverse beliefs and values." },

                { "What is your stance on reproductive rights?",
                        "Oppose abortion rights and support restrictions on reproductive choices.",
                        "Advocate for reproductive rights and access to abortion services.",
                        "Favor individual autonomy and limited government interference in reproductive matters.",
                        "Seek policies that respect reproductive choices and support comprehensive reproductive healthcare." },

                { "How should the government address criminal justice reform and policing?",
                        "Support law and order policies, tough-on-crime measures, and support for law enforcement.",
                        "Advocate for police reform, racial justice, and community policing initiatives.",
                        "Favor criminal justice reform, including ending the war on drugs and reducing mass incarceration.",
                        "Seek a balanced approach to criminal justice reform that prioritizes public safety, accountability, and fairness in the legal system." },

                { "What is your opinion on trade policy and globalization?",
                        "Support free trade agreements, deregulation, and economic globalization to promote growth and competitiveness.",
                        "Advocate for fair trade policies, protectionism, and tariffs to protect American workers and industries.",
                        "Favor free trade and open markets, opposing tariffs and trade barriers that restrict international commerce.",
                        "Seek policies that balance the benefits of global trade with the need to protect domestic industries and workers from unfair competition." },

                { "How should the government address infrastructure investment and transportation?",
                        "Support private sector investment and public-private partnerships to fund infrastructure projects and modernize transportation systems.",
                        "Advocate for increased federal funding for infrastructure repair and expansion, including transportation, roads, bridges, and public transit.",
                        "Favor deregulation and privatization of infrastructure, with minimal government involvement in funding and management.",
                        "Seek bipartisan solutions to address critical infrastructure needs, promote sustainable development, and improve transportation accessibility and efficiency." },

                { "What is your stance on energy policy and environmental protection?",
                        "Support domestic energy production, including fossil fuels and nuclear power, to achieve energy independence and economic growth.",
                        "Advocate for renewable energy development, environmental regulations, and climate action to address climate change and protect natural resources.",
                        "Favor energy deregulation and market-based solutions to promote innovation and efficiency in the energy sector.",
                        "Seek policies that balance environmental protection with economic interests, promoting sustainable development and clean energy transition." },

                { "How should the government address housing affordability and homelessness?",
                        "Support market-based solutions, including deregulation and incentives for private developers, to increase housing supply and affordability.",
                        "Advocate for federal funding for affordable housing programs, rent control measures, and homelessness prevention initiatives.",
                        "Favor deregulation and free market approaches to housing, reducing government intervention and barriers to housing development.",
                        "Seek bipartisan solutions" }
        };

        
    }
}