package session_6;

public class Mani2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is ").append("awesome");
        sb.insert(5, "really ");
        sb.delete(0, 5);
        sb.replace(10, 17, "amazing");
        System.out.println(sb.toString());
    }
}
