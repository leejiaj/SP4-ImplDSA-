/**
 * @author Leejia James
 * @author Priyanka Awaraddi
 *
 * Driver class to test Binary search tree
 *
 * Ver 1.0: 2018/09/27
 */

package pxa172130;

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {	
	    BinarySearchTree<Integer> t = new BinarySearchTree<>();
	    System.out.println("Options:");
    	System.out.println("1. Add element eg. 1 5");
    	System.out.println("2. Remove element eg. 2 5");
    	System.out.println("3. Get element eg. 3 5");
    	System.out.println("4. Contains element eg. 4 5");
    	System.out.println("5. Minimum element eg. 5");
    	System.out.println("6. Maximum element eg. 6");
    	System.out.println("7. Array using inorder traversal of tree eg. 7");
    	System.out.println("8. Exit");
        Scanner in = new Scanner(System.in);
        int x;
        Comparable[] arr;
        whileloop:
        while(in.hasNext()) {
            int com = in.nextInt();
            switch(com) {
            case 1:  // Add element to tree
	            x = in.nextInt();
	            System.out.print("Add " + x + " : ");
	            t.add(x);
	            t.printTree();
	            break;
            case 2:  // Remove element from tree
            	x = in.nextInt();
	            System.out.print("Remove " + x + " : ");
	            t.remove(x);
	            t.printTree();
                break;
            case 3:  // Get element from tree
            	x = in.nextInt();
	            System.out.print("Get " + x + " : ");
	            if(t.get(x) == null) {
	            	System.out.println("No such element");
	            }
	            else {
	            	System.out.println("Element returned: " + t.get(x));
	            }
	            t.printTree();
                break;
            case 4:  // Check if element contains in the tree
            	x = in.nextInt();
	            System.out.print("Contains " + x + " ? : ");
	            if(t.contains(x) == true) {
	            	System.out.println("Element is in tree");
	            }
	            else {
	            	System.out.println("Element is not in tree");
	            }
	            t.printTree();
                break;
            case 5:  // Find min element in the tree
               	if(t.min() == null) {
            		System.out.println("Tree is empty");
            	}
               	else {
               		System.out.println("Minimum element : " + t.min());
               	}
                break;
            case 6:  // Find max element in the tree
               	if(t.max() == null) {
            		System.out.println("Tree is empty");
            	}
               	else {
               		System.out.println("Maximum element : " + t.max());
               	}
                break;
            case 7:  // Array using inorder traversal of tree
	            arr = t.toArray();
	            System.out.print("Array using in-order tree traversal: ");
	            for(int i=0; i<t.size; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            System.out.println();
                break;
            default:  // Exit loop
	            arr = t.toArray();
	            System.out.print("Final: ");
	            for(int i=0; i<t.size; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            System.out.println();
                break whileloop;
            }

    	    System.out.println("Options:");
        	System.out.println("1. Add element eg. 1 5");
        	System.out.println("2. Remove element eg. 2 5");
        	System.out.println("3. Get element eg. 3 5");
        	System.out.println("4. Contains element eg. 4 5");
        	System.out.println("5. Minimum element eg. 5");
        	System.out.println("6. Maximum element eg. 6");
        	System.out.println("7. Array using inorder traversal of tree eg. 7");
        	System.out.println("8. Exit");
        }
    }
}


/* Sample input:
   1 2 1 2 1 1 1 2 1 1 2 0
   Sample output:
10: 1 2 3 4 5 6 7 8 9 10
1
9: 2 3 4 5 6 7 8 9 10
2
8: 3 4 5 6 7 8 9 10
3
4
5
7: 3 4 6 7 8 9 10
6
7
6: 3 4 6 8 9 10
6: 3 4 6 8 9 10
6: 3 6 9 4 8 10
*/
