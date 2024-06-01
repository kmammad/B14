package Assignmenents;

public class A16_ReverseEachWord {

    public static void main(String[] args) {
        //Run the unit tests to check your method correctness

        System.out.println(reverseEachWord("Hi how are you")); // -> iH woh era uoy

        System.out.println(reverseEachWord("Java is fun")); // -> avaJ si nuf

        System.out.println(reverseEachWord("Javaisfun")); // -> nufsiavaJ

        System.out.println(reverseEachWord("Java")); // -> avaJ

        System.out.println(reverseEachWord("There are two ways to write error-free programs; only the third one works")); // -> erehT era owt syaw ot etirw eerf-rorre ;smargorp ylno eht driht eno skrow

        System.out.println(reverseEachWord("Don’t worry if it doesn’t work right. If everything did, you’d be out of a job")); // -> t’noD yrrow fi ti t’nseod krow .thgir fI gnihtyreve ,did d’uoy eb tuo fo a boj

        System.out.println(reverseEachWord("Sometimes it's better to leave something alone, to pause, and that's very true of programming")); // -> semitemoS s'ti retteb ot evael gnihtemos ,enola ot ,esuap dna s'taht yrev eurt fo gnimmargorp

        System.out.println(reverseEachWord("Good code is short, simple, and symmetrical - the challenge is figuring out how to get there")); // -> dooG edoc si ,trohs ,elpmis dna lacirtemmys - eht egnellahc si gnirugif tuo woh ot teg ereht

    }

    public static String reverseEachWord(String str){

        String [] arr = str.split(" ");

        String str2 = " ";

        for (int i = 0; i < arr.length; i++) {

            char [] ch = arr[i].toCharArray();

            for (int k = 0, j = ch.length - 1; k < j; k++, j--){
                char temp = ch [k];
                ch [k] = ch [j];
                ch [j] =  temp;
            }

            str2 += String.valueOf(ch);

            // str2 += new String(ch) + " ";

        }

        return str2.trim();
    }


}
/**
 Create a method that takes a String and returns it so that EACH word of that String is reversed.

 Use loops, arrays, split() and join() methods to achieve the result.

 Examples:
 reverseEachWord("Hi how are you") -> iH woh era uoy

 reverseEachWord("Java is fun") -> avaJ si nuf

 reverseEachWord("Javaisfun") -> nufsiavaJ

 reverseEachWord("Java") -> avaJ

 reverseEachWord("There are two ways to write error-free programs; only the third one works") -> erehT era owt syaw ot etirw eerf-rorre ;smargorp ylno eht driht eno skrow

 reverseEachWord("Don’t worry if it doesn’t work right. If everything did, you’d be out of a job") -> t’noD yrrow fi ti t’nseod krow .thgir fI gnihtyreve ,did d’uoy eb tuo fo a boj

 reverseEachWord("Sometimes it's better to leave something alone, to pause, and that's very true of programming") -> semitemoS s'ti retteb ot evael gnihtemos ,enola ot ,esuap dna s'taht yrev eurt fo gnimmargorp

 reverseEachWord("Good code is short, simple, and symmetrical - the challenge is figuring out how to get there") -> dooG edoc si ,trohs ,elpmis dna lacirtemmys - eht egnellahc si gnirugif tuo woh ot teg ereht

 */
