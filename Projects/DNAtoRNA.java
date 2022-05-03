package Other;

import java.util.*;

public class DNAtoRNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Please enter a positive integer: ");
        int dnaLength = sc.nextInt();

        // generate random dna sequence of that length (random assortment of 4 possible chars at specified DNA strand length
        String[] dnaChars = {"A", "T", "C", "G"};

        String newDnaSequence = "";
        for (int i = 0; i < dnaLength; i++) {
            String item = dnaChars[rd.nextInt(4)];
            newDnaSequence += item;
        }

        // convert DNA to RNA (video 58 seconds in)
        /*
         * "A" in dna becomes "U" in rna
         * "T" in dna becomes "A" in rna
         * "C" in dna becomes "G" in rna
         * "G" in dna becomes "C" in rna
         * */

        String newRnaSequence = "";
        for (int i = 0; i < dnaLength; i++) {
            switch (newDnaSequence.substring(i, i + 1)) {
                case "A" -> newRnaSequence += "U";
                case "T" -> newRnaSequence += "A";
                case "C" -> newRnaSequence += "G";
                case "G" -> newRnaSequence += "C";

            }
        }

        System.out.println(newRnaSequence);

        // convert RNA to amino acid chain, see link http://www.math.utep.edu/Faculty/mleung/bioinformatics/aacodon.html
        HashMap<String, String> aminoAcids = insertItemsToMap(new HashMap<>());


        String aminoAcidSeq = "";
        for (String set : splitSequence(newRnaSequence)) {
            aminoAcidSeq += aminoAcids.get(set);
        }

        System.out.println(aminoAcidSeq);
    }

    public static HashMap<String, String> insertItemsToMap(HashMap<String, String> aminoAcids) {
        aminoAcids.put("GCA", "A");
        aminoAcids.put("GCC", "A");
        aminoAcids.put("GCG", "A");
        aminoAcids.put("GCU", "A");

        aminoAcids.put("UGC", "C");
        aminoAcids.put("UGU", "C");

        aminoAcids.put("GAC", "D");
        aminoAcids.put("GAU", "D");

        aminoAcids.put("GAA", "E");
        aminoAcids.put("GAG", "E");

        aminoAcids.put("UUC", "F");
        aminoAcids.put("UUU", "F");

        aminoAcids.put("GGA", "G");
        aminoAcids.put("GGC", "G");
        aminoAcids.put("GGG", "G");
        aminoAcids.put("GGU", "G");

        aminoAcids.put("CAC", "H");
        aminoAcids.put("CAU", "H");

        aminoAcids.put("AUA", "I");
        aminoAcids.put("AUC", "I");
        aminoAcids.put("AUU", "I");

        aminoAcids.put("AAA", "K");
        aminoAcids.put("AAG", "K");

        aminoAcids.put("UUA", "L");
        aminoAcids.put("UUG", "L");
        aminoAcids.put("CUA", "L");
        aminoAcids.put("CUC", "L");
        aminoAcids.put("CUG", "L");
        aminoAcids.put("CUU", "L");

        aminoAcids.put("AUG", "M");

        aminoAcids.put("AAC", "N");
        aminoAcids.put("AAU", "N");

        aminoAcids.put("CCA", "P");
        aminoAcids.put("CCC", "P");
        aminoAcids.put("CCG", "P");
        aminoAcids.put("CCU", "P");

        aminoAcids.put("CAA", "Q");
        aminoAcids.put("CAG", "Q");

        aminoAcids.put("AGA", "R");
        aminoAcids.put("AGG", "R");
        aminoAcids.put("CGA", "R");
        aminoAcids.put("CGC", "R");
        aminoAcids.put("CGG", "R");
        aminoAcids.put("CGU", "R");

        aminoAcids.put("AGC", "S");
        aminoAcids.put("AGU", "S");
        aminoAcids.put("UCA", "S");
        aminoAcids.put("UCC", "S");
        aminoAcids.put("UCG", "S");
        aminoAcids.put("UCU", "S");

        aminoAcids.put("ACA", "T");
        aminoAcids.put("ACC", "T");
        aminoAcids.put("ACG", "T");
        aminoAcids.put("ACU", "T");

        aminoAcids.put("GUA", "V");
        aminoAcids.put("GUC", "V");
        aminoAcids.put("GUG", "V");
        aminoAcids.put("GUU", "V");

        aminoAcids.put("UGG", "W");

        aminoAcids.put("UAC", "Y");
        aminoAcids.put("UAU", "Y");

        aminoAcids.put("UAA", "Z");
        aminoAcids.put("UGA", "Z");
        aminoAcids.put("UAG", "Z");

        return aminoAcids;
    }

    public static ArrayList<String> splitSequence(String seq) {
        ArrayList<String> newSeq = new ArrayList<>();
        for (int i = 0; i < seq.length(); i += 3) {
            if (i + 3 > seq.length()) {
                break;
            }

            newSeq.add(seq.substring(i, i + 3));
        }

        return newSeq;
    }
}
