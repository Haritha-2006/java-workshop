public class str1 {
    public static void main(String[] args) {
        String X = " haritha ";
        String Z = "Haritha";
        String Y;
        int a=10;
        Y=X.toLowerCase();
        System.out.println(Y);
        Y=X.toUpperCase();
        System.out.println(Y);
        System.out.println(X.replace('h','H'));
        System.out.println(X.trim());

        if(X.equals(Z)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        if(X.equalsIgnoreCase(Z)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        System.out.println(X.indexOf('r'));
        System.out.println(X.indexOf('r',2));
        System.out.println(String.valueOf(a));
    }
}
