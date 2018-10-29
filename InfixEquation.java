import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
public class InfixEquation {
        public static void computeInfix(String eqaation) {

//            eqa.replaceAll("\\s+","");
            StringTokenizer tokens = new StringTokenizer(eqaation,"{}[]()+-/*",true);
//(   (    4  *  9  -  5  *  1 )  )
            ArrayList<String>  list = new ArrayList<>();

            while (tokens.hasMoreTokens()){
                String token = tokens.nextToken();
                list.add(token);
            }
//            for (int i=0; i < list.size() ;i++) {
//                System.out.println(list.get(i));
//
//            }
            Stack<String> stack = new Stack<>();

            for (int i =0 ; i < list.size() ; i++) {
                if (!(list.get(i).equals(")"))) {
                    stack.push(String.valueOf(list.get(i)));
//                    ((4*9) - (5*1))
                }
                else if (list.get(i).equals(")")) {
                    int v1 = Integer.parseInt(stack.pop());
                    String operator = stack.pop();
                    int v2 = Integer.parseInt(stack.pop());
                    String op = stack.pop();



                    int result=0;
                    switch(operator)
                    {
                        case "+" : result= v2+v1;
                            stack.push(String.valueOf(result));
                            System.out.println(String.valueOf(result));
                            break;
                        case "-" : result= v2-v1;
                            stack.push(String.valueOf(result));
                            System.out.println(String.valueOf(result));
                            break;
                        case "/" : result= v2/v1;
                            stack.push(String.valueOf(result));
                            System.out.println(String.valueOf(result));
                            break;
                        case "*" : result= v2*v1;
                            stack.push(String.valueOf(result));
                            System.out.println(String.valueOf(result));
                            break;
                    }
                }
            }

        }

        public static void main(String[] args) {
            System.out.println("Expression is ((8*1)*(9*1))");
            computeInfix("((8*1)*(9*1))");

//            Or
            String equation  = "((8*1)*(9*1))";
            System.out.println("Output For the given eq"+equation);
            computeInfix(equation);
        }
    }


