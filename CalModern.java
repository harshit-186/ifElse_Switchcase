public class CalModern {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String op = args[1];
        int b = Integer.parseInt(args[2]);

        switch(op){
            case "+"-> System.out.println(a+b);
            case "-"-> System.out.println(a-b);
            case "/"-> System.out.println(a/b);
            case "*"-> System.out.println(a*b);
            default-> System.out.println("Invalid Operator");
        }
    }
    
}
