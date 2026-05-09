public class Calculator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String op = new String(args[1]);
        int b = Integer.parseInt(args[2]);

        switch(op)
        {
            case "+" : System.out.println(a+b);
            break;
            case "-" : System.out.println(a-b);
            break;
            case "*" : System.out.println(a*b);
            break;
            case "/" : System.out.println(a/b);
            break;
            default: System.out.println("INVALID OPERATOR");
            
        }
    }
    
}
