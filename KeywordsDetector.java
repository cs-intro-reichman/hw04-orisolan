public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        for (String sentence : sentences) {
            
            boolean isBullshit = false;
            
            String lowerSentence = sentence.toLowerCase();
            
            for (String keyword : keywords) {
                
                String lowerKeyword = keyword.toLowerCase();
                
                if (lowerSentence.contains(lowerKeyword)) {
                    
                    isBullshit = true; 
                    break;             
                }
            }
            
            if (isBullshit) {
                System.out.println(sentence);
            }
        }
    }
}