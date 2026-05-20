public class PassFail {
    public static void main(String[] args) {
        int p, m, c;
        p = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        if (p >= 50) {
            if (c >= 55) {
                if (m >= 60) {
                    if (m + c + p >= 220)
                        System.out.println("Pass");
                    else if (m + p >= 130)
                        System.out.println("Pass");
                    else
                        System.out.println("Failed");
                } else
                    System.out.println("Failed");

            } else
                System.out.println("Failed");
        } else
            System.out.println("Failed");
    }

}
