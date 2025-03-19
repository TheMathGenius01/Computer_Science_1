import static java.lang.System.out;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringsTest {

    public static void main(String[] args) {
        out.println(Strings.reverse("hello") + " == olleh");
        out.println(Strings.numVowels("eggOmelet") + " == 4");
        out.println(Strings.getUpper("bAdeB fC") + " == ABC");
        out.println(Strings.everyNth("0123456789", 3));
        out.println("\n" + Strings.box("Box") + "\n");

        out.println(Strings.box2("CompSci")+ "\n");
        out.println(Strings.staircase("Comp")+ "\n");
        out.println(Strings.triangleA(5));
        out.println(Strings.triangleB(5));
        out.println(Strings.triangleC(5));
        out.println(Strings.triangleD(5));
        out.println(Strings.multiplicationTable(10)+ "\n");
        out.println(Strings.makeHappy(":(sad :(faces:("));
        out.println(Strings.isBalanced("(1+3 * (3)+4) / (3+7)"));


    }


    @Test
    public void Test01() {
        String result = Strings.reverse("abcdef");
        assertEquals("fedcba", result);
    }

    @Test
    public void Test02() {
        String result = Strings.reverse("THis is text that will be reVersed!!!");
        assertEquals("!!!desreVer eb lliw taht txet si siHT", result);
    }

    @Test
    public void Test03() {
        String result = Strings.reverse("Why do fathers take an extra pair of socks when they go golfing? In case they get a hole in one!");
        assertEquals("!eno ni eloh a teg yeht esac nI ?gniflog og yeht nehw skcos fo riap artxe na ekat srehtaf od yhW", result);
    }

    @Test
    public void Test04() {
        int result = Strings.numVowels("");
        assertEquals(0, result);
    }

    @Test
    public void Test05() {
        int result = Strings.numVowels("What did the ocean say to the beach? Nothing, it just waved.");
        assertEquals(17, result);
    }

    @Test
    public void Test06() {
        int result = Strings.numVowels("WhAt dId the zEro say to the eight? That belt looks good on you.");
        assertEquals(19, result);
    }

    @Test
    public void Test07() {
        String result = Strings.getUpper("no uppers here");
        assertEquals("", result);
    }

    @Test
    public void Test08() {
        String result = Strings.getUpper("What did Baby Corn say to Mama Corn? Where's Pop Corn?");
        assertEquals("WBCMCWPC", result);
    }

    @Test
    public void Test09() {
        String result = Strings.getUpper("Why did Billy get fiRed from the bAnanA facTory? He Kept throwinG aWay the bent ONES.");
        assertEquals("WBRAATHKGWONES", result);
    }

    @Test
    public void Test10() {
        String result = Strings.everyNth("Why don't eggs tell jokes? They'd crack each other up.", 1);
        assertEquals("Why don't eggs tell jokes? They'd crack each other up.", result);
    }

    @Test
    public void Test11() {
        String result = Strings.everyNth("Did you hear the rumor about butter? Well, I'm not going to spread it!", 2);
        assertEquals("Ddyuha h uo bu utr el ' o on osra t", result);
    }

    @Test
    public void Test12() {
        String result = Strings.everyNth("Why couldn't the bicycle stand up by itself? It was two tired.", 5);
        assertEquals("Wo'eys yeIs d", result);
    }

    @Test
    public void Test13() {
        String result = Strings.box("aaaa").trim();
        String exp = "aaaa\naaaa\naaaa\naaaa\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test14() {
        String result = Strings.box("Computers").trim();
        String exp = "Computers\nComputers\nComputers\nComputers\nComputers\nComputers\nComputers\nComputers\nComputers\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test15() {
        String result = Strings.box("c").trim();
        String exp = "c\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test16() {
        String result = Strings.box2("ca").trim();
        String exp = "ca\nac".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test17() {
        String result = Strings.box2("Computers").trim();
        String exp = ("Computers\n" +
                "o       r\n" +
                "m       e\n" +
                "p       t\n" +
                "u       u\n" +
                "t       p\n" +
                "e       m\n" +
                "r       o\n" +
                "sretupmoC").trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test18() {
        String result = Strings.box2("Testing Box 2").trim();
        String exp = ("Testing Box 2\n" +
                "e            \n" +
                "s           x\n" +
                "t           o\n" +
                "i           B\n" +
                "n            \n" +
                "g           g\n" +
                "            n\n" +
                "B           i\n" +
                "o           t\n" +
                "x           s\n" +
                "            e\n" +
                "2 xoB gnitseT").trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test19() {
        String result = Strings.staircase("abc").trim();
        String exp = "a\nab\nabc\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test20() {
        String result = Strings.staircase("Java").trim();
        String exp = "J\nJa\nJav\nJava\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test21() {
        String result = Strings.staircase("PYTHON").trim();
        String exp = "P\nPY\nPYT\nPYTH\nPYTHO\nPYTHON\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test22() {
        String result = Strings.triangleA(1).trim();
        String exp = "*\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test23() {
        String result = Strings.triangleA(4).trim();
        String exp = "*\n**\n***\n****\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test24() {
        String result = Strings.triangleA(10).trim();
        String exp = "*\n**\n***\n****\n*****\n******\n*******\n********\n*********\n**********\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test25() {
        String result = Strings.triangleB(2).trim();
        String exp = "**\n*\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test26() {
        String result = Strings.triangleB(4).trim();
        String exp = "****\n***\n**\n*\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test27() {
        String result = Strings.triangleB(10).trim();
        String exp = "**********\n*********\n********\n*******\n******\n*****\n****\n***\n**\n*\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test28() {
        String result = Strings.triangleC(3).trim();
        String exp = "  *\n **\n***\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test29() {
        String result = Strings.triangleC(4).trim();
        String exp = "   *\n  **\n ***\n****\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test30() {
        String result = Strings.triangleC(10).trim();
        String exp = "         *\n        **\n       ***\n      ****\n     *****\n    ******\n   *******\n  ********\n *********\n**********\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test31() {
        String result = Strings.triangleD(2).trim();
        String exp = "**\n *\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test32() {
        String result = Strings.triangleD(4).trim();
        String exp = "****\n ***\n  **\n   *\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test33() {
        String result = Strings.triangleD(10).trim();
        String exp = "**********\n *********\n  ********\n   *******\n    ******\n     *****\n      ****\n       ***\n        **\n         *\n".trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test34() {
        String result = Strings.multiplicationTable(5).trim();
        String exp = ("  1  2  3  4  5\n" +
                "  2  4  6  8 10\n" +
                "  3  6  9 12 15\n" +
                "  4  8 12 16 20\n" +
                "  5 10 15 20 25").trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test35() {
        String result = Strings.multiplicationTable(10).trim();
        String exp = ("   1   2   3   4   5   6   7   8   9  10\n" +
                "   2   4   6   8  10  12  14  16  18  20\n" +
                "   3   6   9  12  15  18  21  24  27  30\n" +
                "   4   8  12  16  20  24  28  32  36  40\n" +
                "   5  10  15  20  25  30  35  40  45  50\n" +
                "   6  12  18  24  30  36  42  48  54  60\n" +
                "   7  14  21  28  35  42  49  56  63  70\n" +
                "   8  16  24  32  40  48  56  64  72  80\n" +
                "   9  18  27  36  45  54  63  72  81  90\n" +
                "  10  20  30  40  50  60  70  80  90 100").trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test36() {
        String result = Strings.multiplicationTable(35).trim();
        String exp = ("    1    2    3    4    5    6    7    8    9   10   11   12   13   14   15   16   17   18   19   20   21   22   23   24   25   26   27   28   29   30   31   32   33   34   35\n" +
                "    2    4    6    8   10   12   14   16   18   20   22   24   26   28   30   32   34   36   38   40   42   44   46   48   50   52   54   56   58   60   62   64   66   68   70\n" +
                "    3    6    9   12   15   18   21   24   27   30   33   36   39   42   45   48   51   54   57   60   63   66   69   72   75   78   81   84   87   90   93   96   99  102  105\n" +
                "    4    8   12   16   20   24   28   32   36   40   44   48   52   56   60   64   68   72   76   80   84   88   92   96  100  104  108  112  116  120  124  128  132  136  140\n" +
                "    5   10   15   20   25   30   35   40   45   50   55   60   65   70   75   80   85   90   95  100  105  110  115  120  125  130  135  140  145  150  155  160  165  170  175\n" +
                "    6   12   18   24   30   36   42   48   54   60   66   72   78   84   90   96  102  108  114  120  126  132  138  144  150  156  162  168  174  180  186  192  198  204  210\n" +
                "    7   14   21   28   35   42   49   56   63   70   77   84   91   98  105  112  119  126  133  140  147  154  161  168  175  182  189  196  203  210  217  224  231  238  245\n" +
                "    8   16   24   32   40   48   56   64   72   80   88   96  104  112  120  128  136  144  152  160  168  176  184  192  200  208  216  224  232  240  248  256  264  272  280\n" +
                "    9   18   27   36   45   54   63   72   81   90   99  108  117  126  135  144  153  162  171  180  189  198  207  216  225  234  243  252  261  270  279  288  297  306  315\n" +
                "   10   20   30   40   50   60   70   80   90  100  110  120  130  140  150  160  170  180  190  200  210  220  230  240  250  260  270  280  290  300  310  320  330  340  350\n" +
                "   11   22   33   44   55   66   77   88   99  110  121  132  143  154  165  176  187  198  209  220  231  242  253  264  275  286  297  308  319  330  341  352  363  374  385\n" +
                "   12   24   36   48   60   72   84   96  108  120  132  144  156  168  180  192  204  216  228  240  252  264  276  288  300  312  324  336  348  360  372  384  396  408  420\n" +
                "   13   26   39   52   65   78   91  104  117  130  143  156  169  182  195  208  221  234  247  260  273  286  299  312  325  338  351  364  377  390  403  416  429  442  455\n" +
                "   14   28   42   56   70   84   98  112  126  140  154  168  182  196  210  224  238  252  266  280  294  308  322  336  350  364  378  392  406  420  434  448  462  476  490\n" +
                "   15   30   45   60   75   90  105  120  135  150  165  180  195  210  225  240  255  270  285  300  315  330  345  360  375  390  405  420  435  450  465  480  495  510  525\n" +
                "   16   32   48   64   80   96  112  128  144  160  176  192  208  224  240  256  272  288  304  320  336  352  368  384  400  416  432  448  464  480  496  512  528  544  560\n" +
                "   17   34   51   68   85  102  119  136  153  170  187  204  221  238  255  272  289  306  323  340  357  374  391  408  425  442  459  476  493  510  527  544  561  578  595\n" +
                "   18   36   54   72   90  108  126  144  162  180  198  216  234  252  270  288  306  324  342  360  378  396  414  432  450  468  486  504  522  540  558  576  594  612  630\n" +
                "   19   38   57   76   95  114  133  152  171  190  209  228  247  266  285  304  323  342  361  380  399  418  437  456  475  494  513  532  551  570  589  608  627  646  665\n" +
                "   20   40   60   80  100  120  140  160  180  200  220  240  260  280  300  320  340  360  380  400  420  440  460  480  500  520  540  560  580  600  620  640  660  680  700\n" +
                "   21   42   63   84  105  126  147  168  189  210  231  252  273  294  315  336  357  378  399  420  441  462  483  504  525  546  567  588  609  630  651  672  693  714  735\n" +
                "   22   44   66   88  110  132  154  176  198  220  242  264  286  308  330  352  374  396  418  440  462  484  506  528  550  572  594  616  638  660  682  704  726  748  770\n" +
                "   23   46   69   92  115  138  161  184  207  230  253  276  299  322  345  368  391  414  437  460  483  506  529  552  575  598  621  644  667  690  713  736  759  782  805\n" +
                "   24   48   72   96  120  144  168  192  216  240  264  288  312  336  360  384  408  432  456  480  504  528  552  576  600  624  648  672  696  720  744  768  792  816  840\n" +
                "   25   50   75  100  125  150  175  200  225  250  275  300  325  350  375  400  425  450  475  500  525  550  575  600  625  650  675  700  725  750  775  800  825  850  875\n" +
                "   26   52   78  104  130  156  182  208  234  260  286  312  338  364  390  416  442  468  494  520  546  572  598  624  650  676  702  728  754  780  806  832  858  884  910\n" +
                "   27   54   81  108  135  162  189  216  243  270  297  324  351  378  405  432  459  486  513  540  567  594  621  648  675  702  729  756  783  810  837  864  891  918  945\n" +
                "   28   56   84  112  140  168  196  224  252  280  308  336  364  392  420  448  476  504  532  560  588  616  644  672  700  728  756  784  812  840  868  896  924  952  980\n" +
                "   29   58   87  116  145  174  203  232  261  290  319  348  377  406  435  464  493  522  551  580  609  638  667  696  725  754  783  812  841  870  899  928  957  986 1015\n" +
                "   30   60   90  120  150  180  210  240  270  300  330  360  390  420  450  480  510  540  570  600  630  660  690  720  750  780  810  840  870  900  930  960  990 1020 1050\n" +
                "   31   62   93  124  155  186  217  248  279  310  341  372  403  434  465  496  527  558  589  620  651  682  713  744  775  806  837  868  899  930  961  992 1023 1054 1085\n" +
                "   32   64   96  128  160  192  224  256  288  320  352  384  416  448  480  512  544  576  608  640  672  704  736  768  800  832  864  896  928  960  992 1024 1056 1088 1120\n" +
                "   33   66   99  132  165  198  231  264  297  330  363  396  429  462  495  528  561  594  627  660  693  726  759  792  825  858  891  924  957  990 1023 1056 1089 1122 1155\n" +
                "   34   68  102  136  170  204  238  272  306  340  374  408  442  476  510  544  578  612  646  680  714  748  782  816  850  884  918  952  986 1020 1054 1088 1122 1156 1190\n" +
                "   35   70  105  140  175  210  245  280  315  350  385  420  455  490  525  560  595  630  665  700  735  770  805  840  875  910  945  980 1015 1050 1085 1120 1155 1190 1225\n").trim();
        assertEquals(exp, result);
    }

    @Test
    public void Test37() {
        String result = Strings.makeHappy(":(:(:(:(");
        assertEquals(":):):):)", result);
    }

    @Test
    public void Test38() {
        String result = Strings.makeHappy(":(sadface:(:):.:(");
        assertEquals(":)-------:)----:)", result);
    }

    @Test
    public void Test39() {
        String result = Strings.makeHappy(":)....**!@noSadFaces:::):");
        assertEquals("-------------------------", result);
    }

    @Test
    public void Test40() {
        int result = Strings.countCaps("Simple Test Case");
        assertEquals(3, result);
    }

    @Test
    public void Test41() {
        int result = Strings.countCaps("How does A pEnguin builD Its house?Igloos it Together.");
        assertEquals(4, result);
    }

    @Test
    public void Test42() {
        int result = Strings.countCaps("when Two Vegans get In aN argumenT, is It stIll Called A Beef ?");
        assertEquals(7, result);
    }

    @Test
    public void Test43() {
        boolean result = Strings.isBalanced("((bc(a))ed)");
        assertEquals(true, result);
    }

    @Test
    public void Test44() {
        boolean result = Strings.isBalanced("((())))");
        assertEquals(false, result);
    }

    @Test
    public void Test45() {
        boolean result = Strings.isBalanced("(a(a(a()))");
        assertEquals(false, result);
    }

    @Test
    public void Test46() {
        boolean result = Strings.isBalanced("a%(c+((4(x*y)^(4+(d-e)))*f))");
        assertEquals(true, result);
    }

    


}
