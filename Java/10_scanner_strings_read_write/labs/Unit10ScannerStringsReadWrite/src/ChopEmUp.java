import java.util.Scanner;

import static java.lang.System.out;

public class ChopEmUp {

    public static int countEm(String str){
        Scanner kb = new Scanner(str);
        int count = 0;
        while (kb.hasNext()){
            count++;
            kb.next();
        }
        return count;
    }

    public static String condenseSpaces(String str){
        return str.replaceAll("\\s+", " ").trim();
    }

    public static int addEm(String str){
        Scanner kb = new Scanner(str);
        int ret = 0;
        ret+=kb.nextInt();
        while (kb.hasNext()){
            String sign = kb.next();
            int num = kb.nextInt();
            if (sign.equals("+")) ret+=num;
            else ret-= num;
        }
        return ret;
    }

    public static int smallest(String str){
        Scanner kb = new Scanner(str);
        int min = kb.nextInt();
        while (kb.hasNextInt()){
            int next = kb.nextInt();
            min = Math.min(min, next);
        }
        return min;
    }

    public static double range(String str){
        Scanner kb = new Scanner(str);
        double min  = kb.nextDouble();
        double max = min;
        while (kb.hasNextDouble()){
            double temp = kb.nextDouble();
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }
        return max-min;
    }

    public static String cumulativeTotals(String str){
        Scanner kb = new Scanner(str);
        int sum = kb.nextInt();
        StringBuilder ret = new StringBuilder(sum + " ");
        while (kb.hasNextInt()){
            sum+=kb.nextInt();
            ret.append(sum).append(" ");
        }
        return ret.toString().trim();
    }

    public static String flipCoins(String str){
        Scanner kb = new Scanner(str);
        int heads = 0;
        int tails = 0;
        while (kb.hasNext()){
            if (kb.next().equals("H")){
                heads++;
            } else tails++;

        }
        double percent = (100.0*heads)/(double)(heads+tails);
        String win = (heads>tails) ? "win": "lose";
        return String.format("%.2f%% %s", percent, win);
    }

    public static int adjacentDuplicateGroups(String str){
        if (str.isEmpty()) return 0;
        Scanner kb = new Scanner(str);
        int count = 0;
        String prev = kb.next();
        boolean check = false;

        while (kb.hasNext()) {
            String current = kb.next();
            if (prev.equals(current) && !check) {
                count++;
                check = true;
            }
            if (!prev.equals(current)) check = false;
            prev = current;
        }

        return count;

    }

    public static String stats(String str){
        str = str.replaceAll(",", "").replaceAll("\\.", "");
        Scanner kb = new Scanner(str);
        int numTerms = 0;
        int max = 0;
        while (kb.hasNext()){
            numTerms++;
            max = Math.max(max, kb.next().length());
        }
        return String.format("%d tokens, longest is %d", numTerms, max);
    }

    public static String halloween(String str){
        Scanner kb = new Scanner(str);
        int guys = 0;
        int girls = 0;
        int absolute = 0;
        int iterate = 1;

        while (kb.hasNext()){
            String costume = kb.next();
            int count = kb.nextInt();

            if (iterate % 2 == 1){
                guys++;
                absolute += count;
            } else {
                girls++;
                absolute -= count;
            }
            iterate++;
        }
        return String.format("guys %d, girls %d, diff %d", guys, girls, Math.abs(absolute));
    }

    public static void main(String[] args) {
        out.println(countEm("1 hi 12 bye 101") + " == 5");
        String spaces = " Have no fear of perfection, ";
        spaces += "you'll never reach it. ";
        String res = "Have no fear of perfection, ";
        res += "you'll never reach it.";
        out.println(condenseSpaces(spaces).equals(res) + " == true");
        out.println(addEm("5 - 4 + 12") + " == 13");
        String s = "99 3 66 44 12 78 -4 102";
        out.println(smallest(s) + " == -4");
        s = "99.4 3 66.2 4.4 12 78 -4 102.0";
        out.println(range(s) + " == 106.0");
        out.println(cumulativeTotals("1 5 8 3") + " == 1 6 14 17");
        out.println(flipCoins("H T T H H") + " == 60.00% win");
        s = "1 1 2 7 7 7 7 3 3 5 3";
        //out.println(adjacentDuplicatesCount(s) + " == 3");
        s = "When life gives you lemons, make lemonade.";
        out.println(stats(s) + " == 7 tokens, longest is 8");
        s = "IronMan 4 Leia 2 SpiderMan 1 BlackWidow 3 ";
        s += "Hulk 9 Catwoman 13 Superman 4";
        out.println(halloween(s) + " == guys 4, girls 3, diff 0");
    }


}
