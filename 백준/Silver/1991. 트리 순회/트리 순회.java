import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static class Node {
      char self;
      Node left, right;
        public Node(char self) {
            this.self = self;
        }
        public Node(Node left, Node right) {
            this.left = left;
            this.right = right;
        }
        public String toString(){
            return self+"";
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Node[] orgArr = new Node[n];
        // 'A' = 65
        char al = 'A';
        // 각 노드 할당
        for(int i = 0; i < n; i++) {
            orgArr[i] = new Node(al++);
        }
        // 자식노드 연결
        for(int i = 0; i < n; i++) {
            char line[] = br.readLine().toCharArray();
            orgArr[line[0]-65].left = line[2] == '.' ? null : orgArr[line[2]-65];
            orgArr[line[0]-65].right = line[4] == '.' ? null : orgArr[line[4]-65];
        }

        System.out.println(preorder(orgArr[0]));
        System.out.println(inorder(orgArr[0]));
        System.out.println(postorder(orgArr[0]));
    }
    private static String preorder(Node node) {
        /*
            preorder : 자신을 입력하고, 좌측 노드를 담은 뒤 우측 노드를 입력한 값 리턴
         */
        String retVal = "";
        retVal += node.self;
        if(node.left != null) retVal += preorder(node.left);
        if(node.right != null) retVal += preorder(node.right);

        return retVal;
    }
    private static String inorder(Node node) {
        /*
            inorder : 좌측 노드를 담은 뒤, 자신을 입력하고 우측 노드를 입력한 값 리턴
         */
        String retVal = "";
        if(node.left != null) retVal += inorder(node.left);
        retVal += node.self;
        if(node.right != null) retVal += inorder(node.right);

        return retVal;
    }
    private static String postorder(Node node) {
        String retVal = "";
        if(node.left != null) retVal += postorder(node.left);
        if(node.right != null) retVal += postorder(node.right);
        retVal += node.self;

        return retVal;
    }
}

