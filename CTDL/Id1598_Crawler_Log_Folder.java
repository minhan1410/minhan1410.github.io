public class Id1598_Crawler_Log_Folder {
    public static void main(String[] args) {
        System.out.println(minOperations(new String[] { "d1 /", "d2 /", "../", "d21 /", "./" }));
        System.out.println(minOperations(new String[] { "d1 /", "d2 /", "./", "d3 /", "../", "d31 /"}));
        System.out.println(minOperations(new String[] { "d1 /", "../", "../", "../"}));
        System.out.println(minOperations(new String[] { "./", "wz4/", "../", "mj2/", "../", "../", "ik0/", "il7/" }));

    }

    public static int minOperations(String[] logs) {
        int count = 0;
        for (String string : logs) {
            if (string.equals("../")) {
                count--;
            } else if (string.equals("./")) {

            } else {
                count++;
            }

            if(count<0){
                count = 0;
            }
        }
        return count;
    }
}
