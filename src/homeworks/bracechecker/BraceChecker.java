package homeworks.bracechecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text){
        this.text = text;

    }
    public void check(){
        Stack stack = new Stack(text.length());
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;

                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty()) {
                        System.out.println("Error closed " + c + "at" + i + "but nothing opened");
                    } else {
                        char last = stack.pop();
                        if (!matches(last, c)) {
                            System.out.println("Error: opened " + last + " but closed " + c + " at " + i);
                        }
                    }
                    break;
            }
        }
        while(!stack.isEmpty()) {
            char notClosed = stack.pop();
            System.out.println("Error: opened " + notClosed + " but not closed");
        }
    }
    private boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}