import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ChopEmUpTest {

    @Test(timeout=1000)
    public void Test01() {
        int result = ChopEmUp.countEm("1 hi 12 bye 101");
        assertEquals(5, result);
    }

    @Test(timeout=1000)
    public void Test02() {
        int result = ChopEmUp.countEm("");
        assertEquals(0, result);
    }

    @Test(timeout=1000)
    public void Test03() {
        int result = ChopEmUp.countEm("3.4 false 8 111 hello and goodbye or hi bye");
        assertEquals(10, result);
    }

    @Test(timeout=1000)
    public void Test04() {
        String result = ChopEmUp.condenseSpaces("  Have     no fear    of perfection,     you'll    never  reach     it.  ");
        String ans = "Have no fear of perfection, you'll never reach it.";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test05() {
        String result = ChopEmUp.condenseSpaces("          ");
        String ans = "";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test06() {
        String result = ChopEmUp.condenseSpaces("              Why did             the football coach         go to the bank? To              get his quarter back. Why can't a            leopard                      hide? He's always spotted.    ");
        String ans = "Why did the football coach go to the bank? To get his quarter back. Why can't a leopard hide? He's always spotted.";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test07() {
        int result = ChopEmUp.addEm("5 - 4 + 12 - -2");
        assertEquals(15, result);
    }

    @Test(timeout=1000)
    public void Test08() {
        int result = ChopEmUp.addEm("1 + 1");
        assertEquals(2, result);
    }

    @Test(timeout=1000)
    public void Test09() {
        int result = ChopEmUp.addEm("5 - 4 + 12 + 100 - 55 - 2564 + 7895 - 1 - 14 + 999");
        assertEquals(6373, result);
    }

    @Test(timeout=1000)
    public void Test10() {
        int result = ChopEmUp.smallest("5 41 12 222");
        assertEquals(5, result);
    }

    @Test(timeout=1000)
    public void Test11() {
        int result = ChopEmUp.smallest("5 -4 12 100 -55 -2564 7895 -1 -14 -99999");
        assertEquals(-99999, result);
    }

    @Test(timeout=1000)
    public void Test12() {
        int result = ChopEmUp.smallest("5 -4 12 100 -55 -2564 7895 -1 -14 999");
        assertEquals(-2564, result);
    }

    @Test(timeout=1000)
    public void Test13() {
        double result = ChopEmUp.range("5.412 413.33 12.14568 222.123456");
        assertEquals(407.918, result, .1e-14);
    }

    @Test(timeout=1000)
    public void Test14() {
        double result = ChopEmUp.range("100.2332 -5533.1234 -2564 7895.44 -1.0 -14 99999 4 3 1 33 1 1 999");
        assertEquals(105532.1234, result, .1e-14);
    }

    @Test(timeout=1000)
    public void Test15() {
        double result = ChopEmUp.range("3 2 1 6 7 8 9");
        assertEquals(8, result, .1e-14);
    }

    @Test(timeout=1000)
    public void Test16() {
        String result = ChopEmUp.cumulativeTotals("1 5 8 3");
        String ans = "1 6 14 17";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test17() {
        String result = ChopEmUp.cumulativeTotals("11 -5 188 233 -9876 23 1 2 3");
        String ans = "11 6 194 427 -9449 -9426 -9425 -9423 -9420";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test18() {
        String result = ChopEmUp.cumulativeTotals("-1 -2 -3 -4 -222 -212 -456789 -9876");
        String ans = "-1 -3 -6 -10 -232 -444 -457233 -467109";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test19() {
        String result = ChopEmUp.flipCoins("H T T H H");
        String ans = "60.00% win";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test20() {
        String result = ChopEmUp.flipCoins("H T T H H H T T");
        String ans = "50.00% lose";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test21() {
        String result = ChopEmUp.flipCoins("H T T H H H T T T");
        String ans = "44.44% lose";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test22() {
        int result = ChopEmUp.adjacentDuplicateGroups("1 1 2 7 7 7 7 3 3 5 3 7 7 7");
        assertEquals(4, result);
    }

    @Test(timeout=1000)
    public void Test23() {
        int result = ChopEmUp.adjacentDuplicateGroups("1 2 3 4 5 6 7 8 9");
        assertEquals(0, result);
    }

    @Test(timeout=1000)
    public void Test24A() {
        int result = ChopEmUp.adjacentDuplicateGroups("1 1 2 2 1 1 1 4 4 4 1 1 1 7 7 7 7 7 7 7 1 1 1 1 1 7 7 7 7");
        assertEquals(8, result);
    }
    @Test(timeout=1000)
    public void Test24B() {
        int result = ChopEmUp.adjacentDuplicateGroups("abc abc d e e f a a a 240 240 240");
        assertEquals(4, result);
    }
    @Test(timeout=1000)
    public void Test24C() {
        int result = ChopEmUp.adjacentDuplicateGroups("");
        assertEquals(0, result);
    }

    @Test(timeout=1000)
    public void Test25() {
        String result = ChopEmUp.stats("When life gives you lemons, make lemonade.");
        String ans = "7 tokens, longest is 8";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test26() {
        String result = ChopEmUp.stats("I thought the dryer was shrinking my clothes. Turns out, it was the refrigerator, all along.");
        String ans = "16 tokens, longest is 12";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test27() {
        String result = ChopEmUp.stats("How do you follow Will Smith in the snow.....   You follow the fresh prints. Watch out, you might get slapped..");
        String ans = "20 tokens, longest is 7";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test28() {
        String result = ChopEmUp.halloween("IronMan 4 Leia 2 SpiderMan 1 BlackWidow 3 Hulk 9 Catwoman 13 Superman 4");
        String ans = "guys 4, girls 3, diff 0";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test29() {
        String result = ChopEmUp.halloween("IronMan 2 Leia 6 SpiderMan 11 BlackWidow 13 Hulk 9 Catwoman 4 Superman 4 Dora 6 CaptainAmerica 1");
        String ans = "guys 5, girls 4, diff 2";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test30() {
        String result = ChopEmUp.halloween("IronMan 2 Leia 6 SpiderMan 11 BlackWidow 13 Hulk 9 Catwoman 4 Superman 4 Dora 6 CaptainAmerica 8 Barbie 4 Hawkeye 4");
        String ans = "guys 6, girls 5, diff 5";
        assertEquals(ans, result);
    }
/*
    @Test(timeout=1000)
    public void Test31() throws FileNotFoundException {
        String result = ProcessingFiles.stringifyFile("nirvana.txt").trim();
        String ans = "Load up on guns, bring your friends\n" +
                "It's fun to lose and to pretend\n" +
                "She's over bored and self assured\n" +
                "Oh no, I know a dirty word\n" +
                "\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello\n" +
                "\n" +
                "With the lights out, it's less dangerous\n" +
                "Here we are now, entertain us\n" +
                "I feel stupid and contagious\n" +
                "Here we are now, entertain us\n" +
                "A mulatto, an albino, a mosquito, my libido\n" +
                "Yeah, hey\n" +
                "\n" +
                "Yay\n" +
                "\n" +
                "I'm worse at what I do best\n" +
                "And for this gift I feel blessed\n" +
                "Our little group has always been\n" +
                "And always will until the end\n" +
                "\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello\n" +
                "\n" +
                "With the lights out, it's less dangerous\n" +
                "Here we are now, entertain us\n" +
                "I feel stupid and contagious\n" +
                "Here we are now, entertain us\n" +
                "A mulatto, an albino, a mosquito, my libido\n" +
                "Yeah, hey\n" +
                "\n" +
                "Yay\n" +
                "\n" +
                "And I forget just why I taste\n" +
                "Oh yeah, I guess it makes me smile\n" +
                "I found it hard, was hard to find\n" +
                "Oh well, whatever, never mind\n" +
                "\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello\n" +
                "\n" +
                "With the lights out, it's less dangerous\n" +
                "Here we are now, entertain us\n" +
                "I feel stupid and contagious\n" +
                "Here we are now, entertain us\n" +
                "A mulatto, an albino, a mosquito, my libido\n" +
                "A denial, a denial, a denial, a denial, a denial\n" +
                "A denial, a denial, a denial, a denial".trim();
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test32() throws FileNotFoundException {
        String result = ProcessingFiles.stringifyFile("RollingStone.txt").trim();
        String ans = "Once upon a time you dressed so fine\n" +
                "Threw the bums a dime in your prime, didn't you?\n" +
                "People call say 'beware doll, you're bound to fall'\n" +
                "You thought they were all kidding you\n" +
                "You used to laugh about\n" +
                "Everybody that was hanging out\n" +
                "Now you don't talk so loud\n" +
                "Now you don't seem so proud\n" +
                "About having to be scrounging your next meal\n" +
                "How does it feel, how does it feel?\n" +
                "To be without a home\n" +
                "Like a complete unknown, like a rolling stone\n" +
                "Ahh you've gone to the finest schools, alright Miss Lonely\n" +
                "But you know you only used to get juiced in it\n" +
                "Nobody's ever taught you how to live out on the street\n" +
                "And now you're gonna have to get used to it\n" +
                "You say you never compromise\n" +
                "With the mystery tramp, but now you realize\n" +
                "He's not selling any alibis\n" +
                "As you stare into the vacuum of his eyes\n" +
                "And say do you want to make a deal?\n" +
                "How does it feel, how does it feel?\n" +
                "To be on your own, with no direction home\n" +
                "A complete unknown, like a rolling stone\n" +
                "Ah you never turned around to see the frowns\n" +
                "On the jugglers and the clowns when they all did tricks for you\n" +
                "You never understood that it ain't no good\n" +
                "You shouldn't let other people get your kicks for you\n" +
                "You used to ride on a chrome horse with your diplomat\n" +
                "Who carried on his shoulder a Siamese cat\n" +
                "Ain't it hard when you discovered that\n" +
                "He really wasn't where it's at\n" +
                "After he took from you everything he could steal\n" +
                "How does it feel, how does it feel?\n" +
                "To be on your own, with no direction home\n" +
                "Like a complete unknown, like a rolling stone\n" +
                "Ahh princess on a steeple and all the pretty people\n" +
                "They're all drinking, thinking that they've got it made\n" +
                "Exchanging all precious gifts\n" +
                "But you better take your diamond ring, you better pawn it babe\n" +
                "You used to be so amused\n" +
                "At Napoleon in rags and the language that he used\n" +
                "Go to him he calls you, you can't refuse\n" +
                "When you ain't got nothing, you got nothing to lose\n" +
                "You're invisible now, you've got no secrets to conceal\n" +
                "How does it feel, ah how does it feel?\n" +
                "To be on your own, with no direction home\n" +
                "Like a complete unknown, like a rolling stone".trim();
        assertEquals(ans, result);
    }

    @Test(timeout=2500)
    public void Test33() throws IOException {
        ProcessingFiles.writeNumbers("ten.txt", 10);
        Scanner file = new Scanner(new File("ten.txt"));
        String result = "";
        while(file.hasNextLine()){
            result += file.nextLine() + "\n";
        }
        String ans = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10";
        assertEquals(ans.trim(), result.trim());
    }

    @Test(timeout=1000)
    public void Test34() throws IOException {
        ProcessingFiles.writeNumbers("twentytwo.txt", 22);
        Scanner file = new Scanner(new File("twentytwo.txt"));
        String result = "";
        while(file.hasNextLine()){
            result += file.nextLine() + "\n";
        }
        String ans = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22";
        assertEquals(ans.trim(), result.trim());
    }

    @Test(timeout=1000)
    public void Test35() throws FileNotFoundException {
        String result = ProcessingFiles.piggyBank("piggyBank.txt").trim();
        String ans = "Piggy Bank Total: $2.18";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test36() throws FileNotFoundException {
        String result = ProcessingFiles.piggyBank("piggyBank2.txt").trim();
        String ans = "Piggy Bank Total: $5546.29";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test37() throws FileNotFoundException {
        String result = ProcessingFiles.piggyBank("piggyBank3.txt").trim();
        String ans = "Piggy Bank Total: $410160.25";
        assertEquals(ans, result);
    }

    @Test(timeout=1000)
    public void Test38() throws IOException {
        ProcessingFiles.alternate("Frost.txt", "FrostSwapped.txt");
        Scanner file = new Scanner(new File("FrostSwapped.txt"));
        String result = "";
        while(file.hasNextLine()){
            result += file.nextLine() + "\n";
        }
        String ans = "Some say in ice.\n" +
                "Some say the world will end in fire,\n" +
                "I hold with those who favour fire.\n" +
                "From what I’ve tasted of desire\n" +
                "I think I know enough of hate\n" +
                "But if it had to perish twice,\n" +
                "Is also great\n" +
                "To say that for destruction ice\n" +
                "And would suffice.\n";
        assertEquals(ans.trim(), result.trim());
    }

    @Test(timeout=1000)
    public void Test39() throws IOException {
        ProcessingFiles.alternate("Nirvana.txt", "NirvanaSwapped.txt");
        Scanner file = new Scanner(new File("NirvanaSwapped.txt"));
        String result = "";
        while(file.hasNextLine()){
            result += file.nextLine() + "\n";
        }
        String ans = "It's fun to lose and to pretend\n" +
                "Load up on guns, bring your friends\n" +
                "Oh no, I know a dirty word\n" +
                "She's over bored and self assured\n" +
                "Hello, hello, hello, how low\n" +
                "\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "\n" +
                "Hello, hello, hello\n" +
                "Here we are now, entertain us\n" +
                "With the lights out, it's less dangerous\n" +
                "Here we are now, entertain us\n" +
                "I feel stupid and contagious\n" +
                "Yeah, hey\n" +
                "A mulatto, an albino, a mosquito, my libido\n" +
                "Yay\n" +
                "\n" +
                "I'm worse at what I do best\n" +
                "\n" +
                "Our little group has always been\n" +
                "And for this gift I feel blessed\n" +
                "\n" +
                "And always will until the end\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello\n" +
                "Hello, hello, hello, how low\n" +
                "With the lights out, it's less dangerous\n" +
                "\n" +
                "I feel stupid and contagious\n" +
                "Here we are now, entertain us\n" +
                "A mulatto, an albino, a mosquito, my libido\n" +
                "Here we are now, entertain us\n" +
                "\n" +
                "Yeah, hey\n" +
                "\n" +
                "Yay\n" +
                "Oh yeah, I guess it makes me smile\n" +
                "And I forget just why I taste\n" +
                "Oh well, whatever, never mind\n" +
                "I found it hard, was hard to find\n" +
                "Hello, hello, hello, how low\n" +
                "\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "\n" +
                "Hello, hello, hello\n" +
                "Here we are now, entertain us\n" +
                "With the lights out, it's less dangerous\n" +
                "Here we are now, entertain us\n" +
                "I feel stupid and contagious\n" +
                "A denial, a denial, a denial, a denial, a denial\n" +
                "A mulatto, an albino, a mosquito, my libido\n" +
                "A denial, a denial, a denial, a denial\n";
        assertEquals(ans.trim(), result.trim());
    }

    @Test(timeout=1000)
    public void Test41() throws IOException {
        ProcessingFiles.removeTags("index.html", "noTags.txt");
        Scanner file = new Scanner(new File("noTags.txt"));
        String result = "";
        while(file.hasNextLine()){
            result += file.nextLine() + "\n";
        }
        String ans = "Title of the page\n" +
                "\n" +
                "    \n" +
                "        Heading\n" +
                "            \n" +
                "                  last name\n" +
                "                  \n" +
                "            \n" +
                "        This is a paragraph\n" +
                "    \n" +
                "    \n" +
                "        This is the footer";
        assertEquals(ans.trim(), result.trim());
    }

    @Test(timeout=1000)
    public void Test42() throws IOException {
        ProcessingFiles.removeTags("simple.html", "noTags2.txt");
        Scanner file = new Scanner(new File("noTags2.txt"));
        String result = "";
        while(file.hasNextLine()){
            result += file.nextLine() + "\n";
        }
        String ans = "Go BOLD    \n" +
                "    Simple HTML\n" +
                "\n" +
                "    READY?\n" +
                "    \n" +
                "      GO!\n" +
                "    \n" +
                " \n" +
                "\n" +
                "\n" +
                "    CANCEL\n" +
                "    \n" +
                "      X";
        assertEquals(ans.trim(), result.trim());
    }

    @Test(timeout=1000)
    public void Test43() throws IOException {
        ProcessingFiles.wrap("ExcellentLord.txt", "ExcellentLordWrapped50.txt", 50);
        Scanner file = new Scanner(new File("ExcellentLordWrapped50.txt"));
        String result = "";
        while (file.hasNextLine()) {
            result += file.nextLine() + "\n";
        }
        String ans = "SALOMON saies; A good Name is as a precious\n" +
                "oyntment; And I assure my selfe, such wil your\n" +
                "Graces Name bee, with Posteritie. For your\n" +
                "Fortune, and Merit both, have been Eminent. And\n" +
                "you have planted Things, that are like to last. I\n" +
                "doe now publish my Essayes; which, of all my other\n" +
                "workes, have beene most Currant: For that, as it\n" +
                "seemes, they come home, to Mens Businesse, and\n" +
                "Bosomes. I have enlarged them, both in Number, and\n" +
                "Weight; So that they are indeed a New Worke. I\n" +
                "thought it therefore agreeable, to my Affection,\n" +
                "and Obligation to your Grace, to prefix your Name\n" +
                "before them, both in English, and in Latine. For I\n" +
                "doe conceive, that the Latine Volume of them,\n" +
                "(being in the Universall Language) may last, as\n" +
                "long as Bookes last. My Instauration, I dedicated\n" +
                "to the King: My Historie of Henry the Seventh,\n" +
                "(which I have now also translated into Latine) and\n" +
                "my Portions of Naturall History, to the Prince:\n" +
                "And these I dedicate to your Grace; Being of the\n" +
                "best Fruits, that by the good Encrease, which God\n" +
                "gives to my Pen and Labours, I could yeeld. God\n" +
                "leade your Grace by the Hand. Your Graces most\n" +
                "Obliged and faithfull Servant,\n";
        assertEquals(ans.trim(), result.trim());
    }

    @Test(timeout=1000)
    public void Test44() throws IOException {
        ProcessingFiles.wrap("OfDeath.txt", "OfDeathWrap20.txt", 20);
        Scanner file = new Scanner(new File("OfDeathWrap20.txt"));
        String result = "";
        while (file.hasNextLine()) {
            result += file.nextLine() + "\n";
        }
        String ans = "MEN fear death, as\n" +
                "children fear to go\n" +
                "in the dark; and as\n" +
                "that natural fear in\n" +
                "children, is\n" +
                "increased with\n" +
                "tales, so is the\n" +
                "other. Certainly,the\n" +
                "contemplation of\n" +
                "death, as the wages\n" +
                "of sin, and passage\n" +
                "to another world, is\n" +
                "holy and religious;\n" +
                "but the fear of it,\n" +
                "as a tribute dueunto\n" +
                "nature, is weak. Yet\n" +
                "in religious\n" +
                "meditations, there\n" +
                "is sometimes mixture\n" +
                "of vanity, and of\n" +
                "superstition. You\n" +
                "shall read, in some\n" +
                "of thefriars' books\n" +
                "of mortification,\n" +
                "that a man should\n" +
                "think with himself,\n" +
                "what the pain is, if\n" +
                "he have but his\n" +
                "finger's end\n" +
                "pressed, or\n" +
                "tortured,and thereby\n" +
                "imagine, what the\n" +
                "pains of death are,\n" +
                "when the whole body\n" +
                "is corrupted, and\n" +
                "dissolved; when many\n" +
                "times death passeth,\n" +
                "with lesspain than\n" +
                "the torture of a\n" +
                "limb; for the most\n" +
                "vital parts, are not\n" +
                "the quickest of\n" +
                "sense. And by him\n" +
                "that spake only as a\n" +
                "philosopher,\n" +
                "andnatural man, it\n" +
                "was well said, Pompa\n" +
                "mortis magis terret,\n" +
                "quam mors ipsa.\n" +
                "Groans, and\n" +
                "convulsions, and a\n" +
                "discolored face, and\n" +
                "friendsweeping, and\n" +
                "blacks, and\n" +
                "obsequies, and the\n" +
                "like, show death\n" +
                "terrible. It is\n" +
                "worthy the\n" +
                "observing, that\n" +
                "there is no passion\n" +
                "in the mind of\n" +
                "man,so weak, but it\n" +
                "mates, and masters,\n" +
                "the fear of death;\n" +
                "and therefore, death\n" +
                "is no such terrible\n" +
                "enemy, when a man\n" +
                "hath so many\n" +
                "attendantsabout him,\n" +
                "that can win the\n" +
                "combat of him.\n" +
                "Revenge triumphs\n" +
                "over death; love\n" +
                "slights it; honor\n" +
                "aspireth to it;\n" +
                "grief flieth to\n" +
                "it;fear\n" +
                "preoccupateth it;\n" +
                "nay, we read, after\n" +
                "Otho the emperor had\n" +
                "slain himself, pity\n" +
                "(which is the\n" +
                "tenderest of\n" +
                "affections) provoked\n" +
                "many todie, out of\n" +
                "mere compassion to\n" +
                "their sovereign, and\n" +
                "as the truest sort\n" +
                "of followers. Nay,\n" +
                "Seneca adds niceness\n" +
                "and satiety: Cogita\n" +
                "quamdiueadem\n" +
                "feceris; mori velle,\n" +
                "non tantum fortis\n" +
                "aut miser, sed etiam\n" +
                "fastidiosus potest.\n" +
                "A man would die,\n" +
                "though he were\n" +
                "neither valiant,\n" +
                "normiserable, only\n" +
                "upon a weariness to\n" +
                "do the same thing so\n" +
                "oft, over and over.\n" +
                "It is no less\n" +
                "worthy, to observe,\n" +
                "how little\n" +
                "alteration in\n" +
                "goodspirits, the\n" +
                "approaches of death\n" +
                "make; for they\n" +
                "appear to be the\n" +
                "same men, till the\n" +
                "last instant.\n" +
                "Augustus Caesar died\n" +
                "in a compliment;\n" +
                "Livia,conjugii\n" +
                "nostri memor, vive\n" +
                "et vale. Tiberius in\n" +
                "dissimulation; as\n" +
                "Tacitus saith of\n" +
                "him, Jam Tiberium\n" +
                "vires et corpus, non\n" +
                "dissimulatio,\n" +
                "deserebant.\n" +
                "Vespasian in a jest,\n" +
                "sitting upon the\n" +
                "stool; Ut puto deus\n" +
                "fio. Galba with a\n" +
                "sentence; Feri, si\n" +
                "ex re sit populi\n" +
                "Romani; holdingforth\n" +
                "his neck. Septimius\n" +
                "Severus in despatch;\n" +
                "Adeste si quid mihi\n" +
                "restat agendum. And\n" +
                "the like. Certainly\n" +
                "the Stoics bestowed\n" +
                "too muchcost upon\n" +
                "death, and by their\n" +
                "great preparations,\n" +
                "made it appear more\n" +
                "fearful. Better\n" +
                "saith he, qui finem\n" +
                "vitae extremum inter\n" +
                "munera ponatnaturae.\n" +
                "It is as natural to\n" +
                "die, as to be born;\n" +
                "and to a little\n" +
                "infant, perhaps, the\n" +
                "one is as painful,\n" +
                "as the other. He\n" +
                "that dies in an\n" +
                "earnestpursuit, is\n" +
                "like one that is\n" +
                "wounded in hot\n" +
                "blood; who, for the\n" +
                "time, scarce feels\n" +
                "the hurt; and\n" +
                "therefore a mind\n" +
                "fixed, and bent\n" +
                "uponsomewhat that is\n" +
                "good, doth avert the\n" +
                "dolors of death.\n" +
                "But, above all,\n" +
                "believe it, the\n" +
                "sweetest canticle\n" +
                "is', Nunc dimittis;\n" +
                "when a man\n" +
                "hathobtained worthy\n" +
                "ends, and\n" +
                "expectations. Death\n" +
                "hath this also; that\n" +
                "it openeth the gate\n" +
                "to good fame, and\n" +
                "extinguisheth envy.\n" +
                "--Extinctusamabitur\n" +
                "idem.\n";
        assertEquals(ans.trim(), result.trim());
    }

 */
}
