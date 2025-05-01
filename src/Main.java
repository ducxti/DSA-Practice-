public class Main {
    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList();
//        list.add(5);
//        list.add(4);
//        list.add(2);
//        list.add(7);
//        list.add(1);
//        list.add(6);
//        Node sortedHead = insertionSort(list.getFirst());
//        list.setHead(sortedHead);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).value);
//        }
        int[] arr = {2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, 8, 0, arr.length-1));
        printnumb(1);

    }

    private static int binarySearch(int[] array, int target, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                return binarySearch(array, target, low, mid);
            } else {
                return binarySearch(array, target, mid, high);
            }
        } else return -1;
    }
    private static void printnumb(int n){
        if (n > 3) {
            return;
        }
        System.out.println(n);
        printnumb(n + 1);
    }

    private static Node insertionSort(Node head) {
        Node sorted = null;
        Node curr = head;
        while (curr != null) {
            Node currNext = curr.next;
            sorted = sortedInsert(sorted, curr);
            curr = currNext;
        }
        return sorted;
    }

    private static Node sortedInsert(Node sorted, Node new_elem) {
        if (sorted == null || sorted.value > new_elem.value) {
            new_elem.next = sorted;
            if (sorted != null) {
                sorted.previous = new_elem;
            }
            return new_elem;
        } else {
            Node curr = sorted;
            while (curr.next != null && curr.next.value <= new_elem.value) {
                curr = curr.next;
            }
            new_elem.next = curr.next;
            if (curr.next != null) {
                curr.next.previous = new_elem;
            }
            curr.next = new_elem;
            new_elem.previous = curr;
            return sorted;
        }
    }
}