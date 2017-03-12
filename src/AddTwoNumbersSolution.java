/**
 * Created by weileizhe589 on 3/12/17.
 */
public class AddTwoNumbersSolution {
    public SingleLinkedListNode addTwoNumbers(SingleLinkedListNode l1, SingleLinkedListNode l2) {
        SingleLinkedListNode list1 = l1;
        SingleLinkedListNode list2 = l2;
        SingleLinkedListNode sumNumbersFirst = new SingleLinkedListNode(0);
        SingleLinkedListNode sumNumbers = sumNumbersFirst;
        sumNumbers.next = null;
        while (list1 != null || list2 != null) {
            int currentDigit1 = list1 == null ? 0 : list1.val;
            int currentDigit2 = list2 == null ? 0 : list2.val;
            if (list1 == null) {
                list1 = new SingleLinkedListNode(0);
                list1.next = null;
            }
            if (list2 == null) {
                list2 = new SingleLinkedListNode(0);
                list2.next = null;
            }
            if (sumNumbers == null) {
                sumNumbers = new SingleLinkedListNode(0);
                sumNumbers.next = null;
            }
            int currentDigitSum = currentDigit1+currentDigit2;
            sumNumbers.val = sumNumbers.val+currentDigitSum;
            list1 = list1.next;
            list2 = list2.next;
            if (sumNumbers.val > 9) {
                sumNumbers.val = sumNumbers.val-10;
                sumNumbers.next = new SingleLinkedListNode(0);
                sumNumbers.next.val = sumNumbers.next.val+1;
            } else {
                if (list1 == null && list2 == null) {
                    sumNumbers.next = null;
                } else {
                    sumNumbers.next = new SingleLinkedListNode(0);
                }
            }
            sumNumbers = sumNumbers.next;
        }

        return sumNumbersFirst;

    }
}
